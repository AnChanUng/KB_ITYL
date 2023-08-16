<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>

		<b>By Link</b><br>
		<br>
		<a href="parameterServlet?job=insert&pageNo=10&searchWord=bank">get link</a>
		<br> <br>
		
		<b>By Button &amp; JavaScript</b>
		<br> <br>
		<form action = "parameterServlet" method = "get">
			<input type="hidden" name="job" value="insert">
        	<input type="hidden" name="pageNo" value="10">
        	<input type="hidden" name="searchWord" value="bank">
			<input type="submit" value="Get 전송">
		</form>
		
	</body>

</html>