<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String)session.getAttribute("NAME");
		out.println("Hello "+name);
	%>
	<form action="">
		<table>
			<tr>
				<td>
					<a href="addStudent.jsp">
						<input type="button" value="Add Student">
					</a>
				</td>
			</tr>
			<tr>
				<td>
					<a href="viewStudent.jsp">
						<input type="button" value="View Student">
					</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>