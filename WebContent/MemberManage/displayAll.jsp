<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head><title>All VIP Page</title></head>
	<body>
		<h4>VIP information</h4>
		<table border="1">
			<tr>
				<td>VIP ID</td>
				<td>Name</td>
				<td>Password</td>
				<td>Address</td>
				<td>EMail</td>
				<td>Level</td>
				<td>Delete</td>
				<td>Modify</td>
			</tr>
			<s:iterator value="#request.memberList" id="mb">
				<tr>
					<td><s:property value="#mb.id"/></td>
					<td><s:property value="#mb.name"/></td>
					<td><s:property value="#mb.password"/></td>
					<td><s:property value="#mb.address"/></td>
					<td><s:property value="#mb.email"/></td>
					<td><s:property value="#mb.level"/></td>
					<td>
						<a href="<s:url action="memberDelete" >
									<s:param name="id"><s:property value="#mb.id"/></s:param>
								</s:url>">
							Delete
						</a>
					</td>
					<td>
						<a href="<s:url action="memberShow" >
									<s:param name="id"><s:property value="#mb.id"/></s:param>
								</s:url>">
							Modify
						</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		<a href="login.jsp">Return To The Login Page</a>
	</body>
</html>