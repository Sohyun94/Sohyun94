<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = "SSAFY";
	%>
	int age = 80;
	<%!public int add(int a, int b) {
		return a + b;
	}%>
	<h1>Hello JSP!</h1>
	<p>
		내 이름은
		<%=name%>
		<%out.print(name); %>
		</p>
</body>
</html>