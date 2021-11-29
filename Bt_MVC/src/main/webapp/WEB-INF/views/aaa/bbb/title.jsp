<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>title.jsp</title>
</head>
<body>
<h2>title.jsp</h2>
${first } - ${second } = ${first - second }<br>
<img src="face01.png"><br>  <%-- x --%>
<img src="../face01.png"><br>
<img src="${pageContext.request.contextPath }/face01.png"/><br>
<img src="face02.png"><br>
</body>
</html>