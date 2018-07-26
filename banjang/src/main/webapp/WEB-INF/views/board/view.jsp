<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
view / $target:${target}
<form action="${target}" method="post">

<table class="table">
	<tr>
		<td>번호</td>
		<td>${view.id}<input type="hidden" name="id" value="${view.id}"></td>
	</tr>
	<tr>
		<td>HIT</td>
		<td>${view.hit}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>
			<input type="text" name="writer" value="${view.writer}">
		</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>
			<input type="text" name="title" value="${view.title}">
		</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>
			<textarea rows="10" name="content">${view.content}</textarea>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="작성">
				<a href="list">목록보기</a>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="수정">
				<a href="list">목록보기</a>
				<a href="delete?id=${view.id}">삭제</a>
				<a href="reply_view?id=${view.id}">답변</a>
		</td>

	</tr>
</table>
</form>
</body>
</html>
