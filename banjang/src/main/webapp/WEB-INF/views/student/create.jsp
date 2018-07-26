<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>title</title>
</head>
<body>
ct
<form action="create" method="post">
이름:<input type="text" name="name" value="${student.name}">
나이:<input type="text" name="age" value="${student.age}">
<button type="submit">전송</button>
</form>

</body>
</html>