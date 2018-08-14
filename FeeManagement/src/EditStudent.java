

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditStudent extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) {
		try {
			
			HttpSession session = request.getSession();
			
			String usn = (String)session.getAttribute("USN");//from session
			int remainingfees = (int)session.getAttribute("REMAININGFEES");//from session
			String totalfees = (String)session.getAttribute("TOTALFEES");//from session
			String feespaid = request.getParameter("feespaid");//from editStudent.jsp
			
			Model m = new Model();
			m.setUsn(usn);
			m.setRemainingfees(remainingfees);
			m.setTotalfees(totalfees);
			m.setFeespaid(feespaid);
			
			boolean status = m.editStudent();
			
			if(status==true) {
				response.sendRedirect("/FeeManagement/feeUpdateSuccessful.jsp");
			}
			else
				response.sendRedirect("/FeeManagement/feeUpdateFailure.jsp");
			
		} catch(Exception e) {}
	}
}
