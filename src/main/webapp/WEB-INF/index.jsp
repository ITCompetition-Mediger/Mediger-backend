<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<c:if test="${userId eq null}">
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=a5534c28d19e22a9b084cf7de4152af1&redirect_uri=http://localhost:8090/oauth/token&response_type=code">
			<img src="/img/kakao_login_medium_wide.png">
		</a>
	</c:if>
	<c:if test="${userId ne null}">
		<h1>로그인 성공!</h1>
		<input type="button" value="로그아웃" onclick="location.href='/logout'">
	</c:if>
</body>
</html>