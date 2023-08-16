<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<form action = "parameterServlet" method = "post" accept-charset="EUC-KR">
			<b>기본 정보</b>
			<br> <br>
			<b>이름</b><br> 
			<input type="text" name="name">
			<br>
			<b>e-mail</b><br>
        	<input type="email" name="email">
        	<br> <br>
        	<b>성별</b>
        	<br> <br>
        	남<input type="radio" name="gender" value="M">
        	여<input type="radio" name="gender" value="F">
        	<br> <br>
        	<b>취미</b>
        	<br> <br>
        	영화<input type="checkbox" name="hobby" value="movie">
        	스포츠<input type="checkbox" name="hobby" value="sport">
        	음악<input type="checkbox" name="hobby" value="music">
        	<br> <br>
        	<b>선호하는 재테크</b>
        	<br> <br>
        	<select>
				<option value="favorite">연금</option>
				<option value="favorite">주식</option>
			</select>
			<br> <br>
			<b>기타</b>
			<br> <br>
			<textarea name="desc" rows="5" cols="25"></textarea>
			<br> <br>
			<input type="submit" value="Post 전송">
		</form>	
			
	</body>

</html>