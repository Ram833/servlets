<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AddAccountant">
		<table>
			<tr>
				<td>
					Accountant Name:
				</td>
				<td>
					<input type="text" name="name" minlength="1">
				</td>
			</tr>
			<tr>
				<td>
					Accountant UserName:
				</td>
				<td>
					<input type="text" name="un" minlength="1">
				</td>
			</tr>
			<tr>
				<td>
					Accountant Password:
				</td>
				<td>
					<input type="password" name="pw" minlength="8">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>