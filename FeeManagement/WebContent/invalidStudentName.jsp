<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Invalid Student Name.Try Again...</h1>
	<form action="ViewStudent">
		<table>
			<tr>
				<td>
					Student Name:
				</td>
				<td>
					<input type="text" name="name" min="1">
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