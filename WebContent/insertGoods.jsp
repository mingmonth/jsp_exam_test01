<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>��ǰ ���</h2>

	<hr>
	<%
	String path = request.getRealPath("/upload");
	out.println("path : " + path + "<br/>");
	%>
	<!-- action���� jsp �� servlet ���� �ϳ��� �ü� ���� -->

	<form action="InsertGoods" method="post" enctype="multipart/form-data">

		��ǰ�� : <input type="text" name="item"><br> ���� : <input
			type="text" name="price"><br> �󼼼��� : <br>

		<textarea rows="5" cols="60" name="detail"></textarea>
		<br> ��ǰ�̹��� : <input type="file" name="img"><br> <input
			type="submit" value="���"><br> <input type="reset"
			value="���"><br>

	</form>

</body>
</html>