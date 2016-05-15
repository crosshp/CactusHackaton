package com.avteam.smartqueue.server.services;

import com.avteam.smartqueue.server.entity.User;
import com.avteam.smartqueue.server.entity.UserQueue;

import java.util.List;

/**
 *
 */
public interface UserService {
    public User save(User userToSave);
    public List<UserQueue> getUserQueues(Long userId);

}
