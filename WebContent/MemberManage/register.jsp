<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head><title>VIP Registing Page</title></head>
	<body>
		<s:form action="memberRegister" method="post" namespace="/MemberManage">
			<h4>Welcome For Registing...</h4>
			<s:property value="exception.message"/>
			<s:textfield name="member.name" label="VIP Name" tooltip="Please input your name" required="true"></s:textfield>
			<s:password name="member.password" label="VIP Password" tooltip="Please input your password" required="true"></s:password>
			<s:textfield name="member.address" label="VIP Address" required="true"></s:textfield>
			<s:textfield name="member.email" label="VIP Email"></s:textfield>
			<s:textfield name="member.level" label="VIP Level" required="true"></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
	</body>
</html>