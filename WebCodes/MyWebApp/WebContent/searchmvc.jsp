<%@page import="com.srivastava.onlineapp.dto.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="tcs" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Search</title>
</head>
<body>
Date is <tcs:date lang="hi" country="IN"/>
<form action ="searchController">
<input type="text" value="<%=request.getAttribute("price")==null?0:request.getAttribute("price") %>" placeholder="Type Price to Search " name="txtPrice">
<button type="submit">Search</button>
</form>

<c:if test="${plist.size() > 0}">
<h1>Record Found</h1>
<table border="1">
<tr><th>Id </th><th>Name </th><th>Desc </th><th>Price </th><th>Image </th></tr>
<c:forEach items="${plist}" var="pobject">
<tr>
<td>${pobject.id}</td>
<td>${pobject.name}</td>
<td>${pobject.desc}</td>
<td>${pobject.price}</td>
<td><img src='${pobject.image}'></td>
</tr>
</c:forEach>
</table>
</c:if>
<c:if test="${plist.size() eq 0 }">
<h1>Record not Found</h1>
</c:if>
</body>
</html>











