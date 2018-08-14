<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AddStudent">
		<table>
			<tr>
				<td>
					Student Name:
				</td>
				<td>
					<input type="text" name="name" minlength="1">
				</td>
			</tr>
			<tr>
				<td>
					Student USN:
				</td>
				<td>
					<input type="text" name="usn" minlength="1">
				</td>
			</tr>
			<tr>
				<td>
					Student Branch:
				</td>
				<td>
					<input type="text" name="branch" minlength="1">
				</td>
			</tr>
			<tr>
				<td>
					Student Sem:
				</td>
				<td>
					<input type="number" name="sem" min="1" >
				</td>
			</tr>
			<tr>
				<td>
					Student Gender:
				</td>
				<td>
					<input type="text" name="gender" min="1">
				</td>
			</tr>
			<tr>
				<td>
					Total Fees:
				</td>
				<td>
					<input type="number" name="totalfees" min="1">
				</td>
			</tr>
			<tr>
				<td>
					Fees Paid:
				</td>
				<td>
					<input type="number" name="feespaid" min="1">
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