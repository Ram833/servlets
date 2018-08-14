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
	String totalfees = (String)session.getAttribute("TOTALFEES");
	int remainingfees = (int)session.getAttribute("REMAININGFEES");
	
	out.println("               "+name+"<br>"+"<br>");
	out.println("Total Fees:     Rs. "+totalfees+"<br>");
	out.println("Remaining Fees: Rs. "+remainingfees+"<br>");
%>
	<form action="EditStudent">
		<table>
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