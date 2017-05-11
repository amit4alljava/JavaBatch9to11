<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:a href="welcomeac?request_locale=en_US">Click to Open Welcome Page </s:a>
	<s:form action="login" method="post">
	<s:textfield name="userid" label="Userid"/>
	<s:password name="pass" label="Password"/>
	<s:submit value="Login"></s:submit>
	</s:form>
</body>
</html>