package com.practice.oauth_session_practice.repository;

import com.practice.oauth_session_practice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
}
