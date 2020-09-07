package com.cos.blog2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog2.model.User;
import com.cos.blog2.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void 회원가입(User user) {
		user.setRole("ROLE_USER");
		userRepository.save(user); //save 끝나면 다시 컨트롤러로
	}
	
	@Transactional(readOnly = true)
	public User 로그인(User user) {
		return userRepository.login(user);
	}
}
