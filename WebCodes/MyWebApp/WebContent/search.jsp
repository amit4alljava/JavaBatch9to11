<%@page import="com.srivastava.onlineapp.dto.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Search</title>
</head>
<body>
<form action ="searchController">
<input type="text" value="<%=request.getAttribute("price")==null?0:request.getAttribute("price") %>" placeholder="Type Price to Search " name="txtPrice">
<button type="submit">Search</button>
</form>
<%

ArrayList<ProductDTO> productList = (ArrayList<ProductDTO>)
request.getAttribute("plist");
if(productList!=null && productList.size()>0){
%>
<h1>Record Found...</h1>
<table border="1">
<tr><th>Id </th><th>Name </th><th>Desc </th><th>Price </th><th>Image </th></tr>
<%
for(ProductDTO pObject : productList){
%>
<tr>
<td><%=pObject.getId() %></td>
<td><%=pObject.getName() %></td>
<td><%=pObject.getDesc() %></td>
<td><%=pObject.getPrice() %></td>
<td><img src='<%=pObject.getImage() %>'></td>
</tr>
<%
}
%>
</table>
<%
}
else{
%>
<h1>Record Not Found</h1>
<%
}
%>
</body>
</html>











