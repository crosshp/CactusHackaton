package com.avteam.smartqueue.server.controller;

import com.avteam.smartqueue.server.entity.Comment;
import com.avteam.smartqueue.server.entity.User;
import com.avteam.smartqueue.server.entity.UserQueue;
import com.avteam.smartqueue.server.services.CommentService;
import com.avteam.smartqueue.server.services.UserQueueService;
import com.avteam.smartqueue.server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@RestController
public class RequestController {
    @Autowired
    private UserService userService;
    @Autowired
    UserQueueService userQueueService;
    @Autowired
    CommentService commentService;




    private UserQueue getUserQueue(long id) {
        List<Comment> comments = new ArrayList<Comment>();
        List<User> users = new ArrayList<User>();
        Comment comment = new Comment();
        comment.setCommentText("Hello World");
        User user = new User();
        user.setFirstName("Vadim");
        user.setLastName("Semenyuk");
        user.setLogin("SenioR");
        user.setPassword("Hello");
        comments.add(comment);
        user.setComments(comments);
        users.add(user);
        UserQueue userQueue = new UserQueue();
        userQueue.setId(id);
        userQueue.setQueueName("Best Queue");
        userQueue.setUsersInQueue(users);
        userQueue.setCommentsList(comments);
        return userQueue;
    }

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<UserQueue> getQueues(@PathVariable("id") long userId) {
        List<UserQueue> listQueues = new ArrayList<UserQueue>();
        for (int i = 0; i < 5; i++) {
            listQueues.add(getUserQueue(i));
        }
        return listQueues;
    }
    @RequestMapping(value = "queue/getComments/{id}",method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> getComments(@PathVariable("id") long commentId){
        return null;
    }

    @RequestMapping(value = "queue/getUsers/{id}",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(@PathVariable("id") long commentId){
        return null;
    }

}
