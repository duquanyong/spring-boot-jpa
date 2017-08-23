package com.dqy.spring.boot.jpa.service;

import com.dqy.spring.boot.jpa.entity.User;

public interface UserService {
	 User findByUserName(String userName);
}
