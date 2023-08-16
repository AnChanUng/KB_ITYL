<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="javax.servlet.RequestDispatcher" %>

<!DOCTYPE html>
<%
    String job = request.getParameter("job");
    String pageNo = request.getParameter("pageNo");
    String searchWord = request.getParameter("searchWord");

    // Create a Map to store the parameters
    Map<String, String> parameterMap = new HashMap<>();
    parameterMap.put("job", job);
    parameterMap.put("pageNo", pageNo);
    parameterMap.put("searchWord", searchWord);

    // Set the Map as an attribute in the request
    request.setAttribute("parameterMap", parameterMap);

    // Forward the request to getResult.jsp
    String forwardURL = "/getResult.jsp";
    RequestDispatcher dispatcher = request.getRequestDispatcher(forwardURL);
    dispatcher.forward(request, response);
%>
<html>
<head>
	<meta charset="UTF-8"><base>
	<title>By Link</title>
</head>	
<body>

	<b>By Link</b><br>
	<b>By Button &amp; JavaScript</b>
</body>
</html>