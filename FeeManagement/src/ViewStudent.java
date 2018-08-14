
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ViewStudent extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) {
		try {
			String name = request.getParameter("name");
			Model m = new Model();
			m.setName(name);
			
			boolean status = m.viewStudentDetails();
			
			if(status==true) {
				String usn = m.getUsn();
				String branch = m.getBranch();
				String sem = m.getSem();
				String gender = m.getGender();
				String totalfees = m.getTotalfees();
				String feespaid = m.getFeespaid();
				int remainingfees = m.getRemainingfees();
			
				HttpSession session = request.getSession(true);
				
				session.setAttribute("NAME", name);
				session.setAttribute("USN", usn);
				session.setAttribute("BRANCH", branch);
				session.setAttribute("SEM", sem);
				session.setAttribute("GENDER", gender);
				session.setAttribute("TOTALFEES", totalfees);
				session.setAttribute("FEESPAID", feespaid);
				session.setAttribute("REMAININGFEES", remainingfees);
				
				response.sendRedirect("/FeeManagement/viewStudentDetails.jsp");
			}
			else
				response.sendRedirect("/FeeManagement/invalidStudentName.jsp");
			
		} catch(Exception e) {}
	}
}
