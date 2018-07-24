<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>list.jsp</title>
</head>
<body>
	<table width="600" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>HIT</td>
		</tr>
<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.bId}</td>
			<td>${dto.bName}</td>
		<td>
<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
<a href="content_view?bId=${dto.bId}">${dto.bTitle}</a>		
		</td>
			<td>${dto.bDate}</td>
			<td>${dto.bHit}</td>
		</tr>
</c:forEach>		
		<tr>
			<td colspan="5"><a href="write_view">글작성</a></td>
		</tr>
	</table>
</body>
</html>
