<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" session="true" errorPage="error.jsp" isErrorPage="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! static int x; %>
<%! int counter; // Instance Variable %>
Current Date is <%=new Date() %>
<%
counter++;

//int e = 100/0;
String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");
if(userid!=null && pwd!=null){
if(userid.equals(pwd)){
	response.sendRedirect("welcome.html");
}
else{
%>
<h2 style="color: red;">Invalid Userid or Password</h2>
<%
}
}
%>
<h1>No of Times Page Visited <%=counter %></h1>
<jsp:include page="header.jsp"/>
<form action="login.jsp" method="post">
<table>
		<tr>
			<td><label for="">Userid</label></td>
			<td><input name="userid" type="text"></td>
		</tr>
		<tr>
			<td><label for="">Password</label></td>
			<td><input name="pwd" type="password"></td>
		</tr>
		<tr>
			<td><button>Login</button></td>
			<td><button>Reset</button></td>
		</tr>
	</table>
</form>	
<!--  this  page is build by me -->
<%-- <%
int x =100; 
int y  =200;
int z = x + y;
//out.println("Sum is "+z);
%> --%>
<h2>Sum is <%-- <%=z %> --%></h2>	
</body>
</html>