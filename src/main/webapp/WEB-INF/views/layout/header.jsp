<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>bk blog</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<a class="navbar-brand" href="/">bk Blog</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<div class="justify-content-end collapse navbar-collapse " id="collapsibleNavbar">
		
		<ul class="navbar-nav">
		<c:choose>
			<c:when test="${empty sessionScope.principal}">
				<li class="nav-item"><a class="nav-link" href="/auth/loginForm">로그인</a></li>
				<li class="nav-item"><a class="nav-link" href="/auth/joinForm">회원가입</a></li>
			</c:when>
			<c:otherwise>
				<li class="nav-item"><a class="nav-link" href="/post/saveForm">글쓰기</a></li>
				<li class="nav-item"><a class="nav-link" href="/user/updateForm">회원수정</a></li>
				<li class="nav-item"><a class="nav-link" href="/logout">로그아웃</a></li>
			</c:otherwise>
		</c:choose>
		</ul>
			
		</div>
	</nav>
<br />
<br />
