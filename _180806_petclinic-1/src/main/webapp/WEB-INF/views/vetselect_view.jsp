<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <table width="600" cellpadding="0" cellspacing="0" border="0">

      <tr>
        <td colspan="2"> 수의사 전공별 열람  </td>
      </tr>

       <tr>
        <td> 
          <form action="vetselect" method="get">
	          <select name="specialty_id" >          
		          <c:forEach items="${vetselect_view}" var="dto">
		            <option value="${dto.id}"> ${dto.name} </option>
		          </c:forEach>
	          </select> 
        </td>
        <td > <input type="submit" value="전공검색"> &nbsp;&nbsp; </td>
       </tr>

      <tr >
        <td> 
          <form action="vetselect" method="get">
          <c:forEach items="${vetselect_view}" var="dto">
            <input type="radio" name="specialty_id" value="${dto.id}"> ${dto.name}
          </c:forEach>
        </td>
        <td > <input type="submit" value="전공검색"> &nbsp;&nbsp; </td>
      </tr>
    </form>
  </table>

<!--         라디오버튼을 이용한 입력 -->
<%-- 
          <c:forEach items="${vetselect_view}" var="dto">
            <input type="radio" name="specialty_id" value="${dto.id}"> ${dto.name}
          </c:forEach>
--%>


</body>
</html>