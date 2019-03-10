<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html;charset=UTF-8">
		<title>Modify VIP Page</title>
	</head>
	<body>
		<s:form action="memberUpdate" method="post">
			<h4><s:text name="Modify Vip Information"></s:text></h4>			
			<s:actionerror/>
			<s:hidden name="member.id" value="%{member.id}"></s:hidden>
			<s:textfield name="member.name" label="VIP Name" required="true"></s:textfield>
			<s:textfield name="member.password" label="VIP Password"></s:textfield>
			<s:textfield name="member.address" label="VIP Address"></s:textfield>
			<s:textfield name="member.email" label="VIP EMail"></s:textfield>
			<s:textfield name="member.level" label="VIP Level"></s:textfield>
			<s:submit value="Submit"/>
		</s:form>
	</body>
</html>