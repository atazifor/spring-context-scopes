package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

import javax.xml.stream.events.Comment;

@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public  CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
