<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="ko">
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	index  
</h1>

<form method="get" action="student">
<input type="text" name="id">
<input type="text" name="pw">
<button>get전송</button>
</form>

<form method="post" action="student">
<input type="text" name="id">
<input type="text" name="pw">
<button>post전송</button>
</form>

</body>
</html>
