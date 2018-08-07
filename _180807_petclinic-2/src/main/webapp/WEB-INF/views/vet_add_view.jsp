<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="600">
	<form action="vet_add" method="get">
		<tr>
			<td width="70">First Name</td>
			<td><input type="text" name="first_name" size="50"></td>
		</tr>
		<tr>
			<td width="70">Last Name</td>
			<td><input type="text" name="last_name" size="50"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="입력"><a href="vetlist">의사목록모기</a></td>
		</tr>
	</form>
</table>
</body>
</html>