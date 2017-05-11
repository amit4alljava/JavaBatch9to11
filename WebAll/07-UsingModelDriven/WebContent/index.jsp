<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>
<h1>Struts 2 ModelDriven example</h1>

<h2>Add New Customer </h2>
<s:form  action="customerAC" >
<s:textfield name="id" label="Id"></s:textfield>
  <s:textfield name="name" label="Name" />
  <s:textarea name="address" label="Address" cols="10" rows="5">
  </s:textarea>
  <s:submit />
</s:form>

</body>
</html>