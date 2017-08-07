<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
<h1>分页查询</h1>
<table border="1">
<tr>   
<td>序列号</td>
<td>用户名称</td>
<td>性别</td>
<td>操作状态</td>
</tr>
<c:forEach items="${pageData}" var="pages">
<tr>   
<td>${pages.id}</td>
<td>${pages.userName}</td>
<td>${pages.sex}</td>
<td><a href="/PageServlet/DeleDataServlet?id=${pages.id}" >删除</a></td>
</tr>
</c:forEach>

</table>


<table>
<tr>  
<c:forEach  items="${totalPage}" var="index_page">
<td><a href="/PageServlet/PageServlet?currentPage=${index_page}">${index_page}</a></td>
</c:forEach>
</tr>
</table>



</body>
</html>