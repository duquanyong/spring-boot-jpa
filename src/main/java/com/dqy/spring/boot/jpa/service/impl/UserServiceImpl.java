package com.dqy.spring.boot.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dqy.spring.boot.jpa.dao.UserRepository;
import com.dqy.spring.boot.jpa.entity.User;
import com.dqy.spring.boot.jpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
