<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

vetslist.jsp

<table width="600" cellpadding="0" cellspacing="0" border="1">
	<c:forEach items="${vetslist}" var="dto">
		<tr>
			<td>id = </td>
			<td>${dto.id}</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>