<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%> <%--다른 jsp에서 발생한 예외를 설정 exception 변수에 예외가 저장됨--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error_gugudan.jsp</title>
</head>
<body>
	
	<h1>예외정보: <%= exception.getMessage() %></h1>
	
</body>
</html>