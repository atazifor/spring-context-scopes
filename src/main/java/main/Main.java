package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Now  we  want to  use a  comment service class");
        var c = applicationContext.getBean(CommentService.class);
        System.out.println("Done");
        //we don't need to use the bean

    }
}
