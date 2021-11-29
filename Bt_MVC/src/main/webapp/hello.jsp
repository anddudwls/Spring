<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- JSTL core --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>hello jsp</title>
</head>
<body>
<h2>hello jsp - webapp</h2>
<%= 10 + 2 %><br>
이름: <c:out value="jang"/><br>
나이: <c:out value="25"/><br>
<img src="face01.png"><br>
</body>
</html>