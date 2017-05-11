<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
 <%-- <%@ taglib uri="/struts-dojo-tags" prefix="sx"%> --%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home Page</title>
 <%-- <sx:head />  --%>
</head>
<body>

<s:form action="Welcome" namespace="/">
<s:textfield name="name" label="User Name"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:textarea name="bio" label="About You" cols="20" rows="3" wrap="true"></s:textarea>
<s:checkbox name="receiveUpdates" fieldValue="true" label="Check to receive updates."></s:checkbox>

<s:select list="{'Developer','Manager','Customer'}" name="rolesSelect" multiple="true"></s:select>
<s:checkboxlist list="{'Developer','Manager','Customer'}" name="roleCheckbox"></s:checkboxlist>

<s:radio list="{'Developer','Manager','Customer'}" name="rolesRadio" multiple="true"></s:radio>
<s:radio list="languages" name="language" label="Language" listKey="code" listValue="name"/>
<s:radio label="Answer" name="yourAnswer" list="#{'1':'Yes','2':'No'}" value="2" /> 
<s:doubleselect list="{'Developer','Manager','Tester'}" name="doubleSelectRole" label="Role"
	doubleList="top == 'Developer' ? {'Java','PHP'} : 
	(top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 
	'Functional Testing'})" 
	doubleName="doubleSelectExpertise"></s:doubleselect>

 <%-- <sx:autocompleter size="1" list="countries" name="country" label="Country"></sx:autocompleter> 
 <sx:datetimepicker name="date2" label="Format (dd-MMM-yyyy)" 
displayFormat="dd-MMM-yyyy" value="%{'2010-01-01'}"/> --%>
<s:url id="url" value="/displayMsg" />
      <%-- <sx:div href="%{#url}" delay="2000">
           Initial Content
      </sx:div> --%>
<s:url id="url2" value="/msg" />
<<%-- sx:tabbedpanel id="tabContainer">
         <sx:div label="Tab 1" href="%{#url}" >Tab 1</sx:div>
         <sx:div label="Tab 2" href="%{#url2}" >Tab 2</sx:div>
      </sx:tabbedpanel>      
      --%> 
<s:select list="countries" name="country" label="Country" 
		headerKey="-1" headerValue="Select Country" ></s:select>
<s:select label="Qualification" 
		headerKey="-1" headerValue="--- Select ---"
		list="qualificationMap" 
		name="qualification" />		
<s:submit value="Submit"></s:submit>
</s:form>

</body>
</html>