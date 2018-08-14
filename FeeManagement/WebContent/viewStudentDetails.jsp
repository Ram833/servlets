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
	String usn = (String)session.getAttribute("USN");
	String branch = (String)session.getAttribute("BRANCH");
	String sem = (String)session.getAttribute("SEM");
	String gender = (String)session.getAttribute("GENDER");
	String totalfees = (String)session.getAttribute("TOTALFEES");
	String feespaid = (String)session.getAttribute("FEESPAID");
	int remainingfees = (int)session.getAttribute("REMAININGFEES");
	
	out.println("Name:               "+name+"<br>");
	out.println("USN:                "+usn+"<br>");
	out.println("Branch:             "+branch+"<br>");
	out.println("Gender:             "+gender+"<br>");
	out.println("Total Fees:     Rs. "+totalfees+"<br>");
	out.println("Fees Paid:      Rs. "+feespaid+"<br>");
	out.println("Remaining Fees: Rs. "+remainingfees+"<br>");
	%>
	<form action="">
		<table>
			<tr>
				<td>
					<a href="editStudent.jsp">
						<input type="button" value="Edit">
					</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>