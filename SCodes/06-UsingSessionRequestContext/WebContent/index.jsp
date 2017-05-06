<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Choose Language
<br>
<s:a href="langAC?request_locale=en_US">English</s:a>
<s:a href="langAC?request_locale=hi_IN">Hindi</s:a>
<s:a href="langAC?request_locale=it_IT">Italian</s:a>
</body>
</html>