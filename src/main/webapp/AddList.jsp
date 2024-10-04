<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	form {
	justify-content: center;
	align-items: center;
	text-align: center;
	border: 2px solid black;
	box-shadow: 12px 21px 22px rgb(0,0,0,0.2);
	margin-top: 10%;
	width: 50%;
	padding: 30px;
	margin-left: 20%;
}
</style>
</head>
<body>
<%@include file="header.jsp"%>
	<form action="/add" method="post">
	<h2>Add ToDoList</h2><br>	
		<label>Description: </label>
		<input type="text" name="discription" placeholder="Enter discription..">
		<input type="hidden" name="status">
		<button type="submit">Add</button>
	</form>
	<h2>${msg}</h2>
	<h2>${emsg}</h2>
</body>
</html>