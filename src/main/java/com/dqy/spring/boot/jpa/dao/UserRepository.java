package com.dqy.spring.boot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dqy.spring.boot.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);
}
