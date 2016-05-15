package com.avteam.smartqueue.server.repository;

import com.avteam.smartqueue.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
