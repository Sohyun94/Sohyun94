<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과 화면</h1>
	<%=request.getAttribute("title")%>
	<%=request.getAttribute("director")%>
	<%=request.getAttribute("genre")%>
	<%=request.getAttribute("runningTime")%>
</body>
</html>