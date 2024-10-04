<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		justify-content: center;
	align-items: center;
	text-align: center;
	box-shadow: 12px 21px 22px rgb(0,0,0,0.2);
	margin-top: 10%;
	width: 50%;
	margin-left: 27%;
	}
	th{
		padding: 5px;
		background-color: black;
		color: white;
	}
	td{
		padding: 2px;
	}
</style>
</head>
<body>
<%@include file="header.jsp"%>
<table border="2">
	<tr>
		<th>Description</th>
		<th>status</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="d" items="${dis}">
		<tr>
			<td>${d.discription}</td>
			<td>${d.status}</td>
			<td><a href="/${d.id}">Update Status</a></td>
			<td><a href="/del${d.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>