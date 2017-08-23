package com.dqy.spring.boot.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dqy.spring.boot.jpa.dao.UserRepository;
import com.dqy.spring.boot.jpa.entity.User;
import com.dqy.spring.boot.jpa.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJpaApplication.class)
public class IUserServiceTest {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;

	@Test
	public void initData() throws Exception {
		User user = new User();
		user.setUserName("liwei");
		user.setPassword("123456");
		user.setEmail("121088825");
		user.setEnabled(1);
		User user1 = userRepository.save(user);
		System.out.println(user1);
	}

	@Test
	public void findByUserName() throws Exception {
		User user = userService.findByUserName("liwei");
		System.out.println(user);

	}
}
