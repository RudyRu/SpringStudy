<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	create_page.jsp
</h1>

<form action="create">
	이름 : <input type="text" name="name" value="${student.name}" /><br/>
	아이디 : <input type="text" name="id" value="${student.id}" /><br/>
	<input type="submit" value="전송">
</form>
</body>
</html>
