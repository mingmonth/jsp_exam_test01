<%@page import="test01.GoodsVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd";>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<style type="text/css">
table, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>

</head>
<body>
	<table>
		<tr>
			<td>no</td>
			<td>item</td>
			<td>price</td>
			<td>detail</td>
			<td>img</td>
		</tr>

		<c:forEach items="${list}" var="i">
			<tr>
				<td>${i.no }</td>
				<td>${i.item }</td>
				<td>${i.price }</td>
				<td>${i.detail }</td>
				<td><a href="SelectOne?no=${i.no}">${i.img}</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
