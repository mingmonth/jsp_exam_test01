<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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

	<%
	String path = request.getRealPath("/upload");
	out.println("path : " + path + "<br/>");
	%>

	<table>
		<tr>
			<td>no</td>
			<td>${requestScope.vo.no}</td>
		</tr>
		<tr>
			<td>item</td>
			<td>${requestScope.vo.item}</td>
		</tr>
		<tr>
			<td>price</td>
			<td>${requestScope.vo.price}</td>
		</tr>
		<tr>
			<td>detail</td>
			<td>${requestScope.vo.detail}</td>
		</tr>
		<tr>
			<td colspan="2"><img src="upload/${requestScope.vo.img}"></td>
		</tr>
	</table>

</body>
</html>