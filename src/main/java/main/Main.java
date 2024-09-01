package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = applicationContext.getBean(CommentService.class);
        var userService = applicationContext.getBean(UserService.class);
        //commentRepository is a singleton bean, so only a single instance in the context is returned
        System.out.println("userService.getCommentRepository() == commentService.getCommentRepository(): " + (userService.getCommentRepository() == commentService.getCommentRepository()));
    }
}
