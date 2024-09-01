package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var c1 = applicationContext.getBean("commentService", CommentService.class);
        var c2 = applicationContext.getBean("commentService", CommentService.class);
        //commentService is a prototype bean, so no two instances are the same
        System.out.println("c1 == c2 = " + (c1 == c2));
    }
}
