<%@tag import="java.text.DateFormat"%>
<%@tag import="java.util.Locale"%>
<%@attribute name="lang" type="java.lang.String" required="true" %>
<%@attribute name="country" type="java.lang.String" required="true" %>
<%@ tag language="java" pageEncoding="UTF-8" import="java.util.Date"%>
<%
Locale locale = new Locale(lang,country);
DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
Date date = new Date();
String formattedDate = df.format(date);
%>
<%=formattedDate%>