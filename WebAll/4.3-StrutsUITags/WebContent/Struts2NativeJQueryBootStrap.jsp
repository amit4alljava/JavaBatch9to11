<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="css/bootstrap.css" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet' type='text/css'>
<script src="js/jquery-1.11.3.min.js"></script>
<style>
div{
font-family: 'Bitter', serif;
}
</style>
</head>
<body>
<s:form id="loginform">
<s:textfield id="userid" name="userid" label="Userid" ></s:textfield>
<s:password id="password" name="password" label="password"></s:password>
<button id="ajaxbt">Login</button>
</s:form>
</body>
</html>