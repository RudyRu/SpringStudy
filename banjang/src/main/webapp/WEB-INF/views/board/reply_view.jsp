<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>title</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</head>

<body>
reply view
<form action="reply" method="post">
<input type="text" name="id" value="${reply_view.id}">
<input type="text" name="group" value="${reply_view.group}">
<input type="text" name="step" value="${reply_view.step}">
<input type="text" name="indent" value="${reply_view.indent}">
<table class="table">
	<tr>
		<td>번호</td>
		<td>${reply_view.id}<input type="hidden" name="id" value="${reply_view.id}"></td>
	</tr>
	<tr>
		<td>HIT</td>
		<td>${reply_view.hit}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>
			<input type="text" name="writer" value="${reply_view.writer}">
		</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>
			<input type="text" name="title" value="${reply_view.title}">
		</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea rows="10" name="content">${reply_view.content}</textarea>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="저장">
				<a href="list">목록보기</a>
		</td>
	</tr>
</table>
</form>
</body>
</html>
