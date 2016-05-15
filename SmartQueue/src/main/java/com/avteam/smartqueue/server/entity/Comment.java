package com.avteam.smartqueue.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "commentaries")
public class Comment {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(name="commentary_text")
    private String commentText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}
