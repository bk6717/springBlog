package com.cos.blog2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
	
	@GetMapping("joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}
