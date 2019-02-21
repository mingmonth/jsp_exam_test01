<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>상품 등록</h2>

	<hr>
	<%
	String path = request.getRealPath("/upload");
	out.println("path : " + path + "<br/>");
	%>
	<!-- action에는 jsp 나 servlet 둘중 하나가 올수 있음 -->

	<form action="InsertGoods" method="post" enctype="multipart/form-data">

		상품명 : <input type="text" name="item"><br> 가격 : <input
			type="text" name="price"><br> 상세설명 : <br>

		<textarea rows="5" cols="60" name="detail"></textarea>
		<br> 상품이미지 : <input type="file" name="img"><br> <input
			type="submit" value="등록"><br> <input type="reset"
			value="취소"><br>

	</form>

</body>
</html>