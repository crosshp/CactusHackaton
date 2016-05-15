package com.avteam.smartqueue.server.services;

import com.avteam.smartqueue.server.entity.User;
import com.avteam.smartqueue.server.entity.UserQueue;
import com.avteam.smartqueue.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User userToSave) {
        return userRepository.saveAndFlush(userToSave);
    }

    @Override
    public List<UserQueue> getUserQueues(Long userId) {
        return userRepository.getOne(userId).getUsersQueue();
    }
}
