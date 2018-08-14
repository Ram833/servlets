
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddStudent extends HttpServlet {
public void service(HttpServletRequest request,HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String usn = request.getParameter("usn");
		String branch = request.getParameter("branch");
		String sem = request.getParameter("sem");
		String gender = request.getParameter("gender");
		String totalfees = request.getParameter("totalfees");
		String feespaid = request.getParameter("feespaid");
		
		try {
			Model m = new Model();
			m.setName(name);
			m.setUsn(usn);
			m.setBranch(branch);
			m.setSem(sem);
			m.setGender(gender);
			m.setTotalfees(totalfees);
			m.setFeespaid(feespaid);
			boolean status = m.addStudent();
			
			if(status==true)
				response.sendRedirect("/FeeManagement/studentAddedSuccess.jsp");
			else
				response.sendRedirect("/FeeManagement/studentAddedFailure.jsp");
		} 
		catch (Exception e) {e.printStackTrace();}
	}
}
