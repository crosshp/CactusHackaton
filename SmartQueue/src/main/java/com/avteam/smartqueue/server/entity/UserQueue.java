package com.avteam.smartqueue.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 *
 */
@Entity
@Table(name = "users_queue")
public class UserQueue {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(name = "queue_name")
    private String queueName;
    @ManyToMany
    @JoinTable(name = "users_in_queue",
            joinColumns = @JoinColumn(name = "current_queue_fk"),
            inverseJoinColumns = @JoinColumn(name = "user_fk"))
    List<User> usersInQueue;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "current_queue_fk")
    private List<Comment> commentsList;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {

        return id;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public List<User> getUsersInQueue() {
        return usersInQueue;
    }

    public void setUsersInQueue(List<User> usersInQueue) {
        this.usersInQueue = usersInQueue;
    }

    public List<Comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }
}
