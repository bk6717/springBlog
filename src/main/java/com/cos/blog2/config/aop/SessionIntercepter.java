package com.cos.blog2.config.aop;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cos.blog2.model.User;

public class SessionIntercepter extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(); // request를 받아 올 수 있기 때문에 HttpSession사용 가능
		User principal = (User)session.getAttribute("principal");
		if(principal == null) {
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('로그인이 필요합니다.')");
			out.print("locaiton.href='/auth/loginFrom'");
			out.print("<script>");
			return false; // false해야 빠져나와서 한번만 실행함
		}
		System.out.println("인증을 체크해야함");
		return true;


	}
}
