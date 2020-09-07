package com.cos.blog2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/test/user/{id}")
	public String findUser() {
		return "<h1>유저찾기</h1>";
	}
	
	@GetMapping("/test/post/{id}")
	public String findPost() {
		return "<h1>글 상세보기 페이지</h1>";
	}
	
	@GetMapping("/test/admin")
	public String admin() {
		return "<h1>관리자 페이지</h1>";
	}
	
}
