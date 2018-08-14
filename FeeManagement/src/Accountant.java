
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Accountant extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) {
		
		String un = request.getParameter("un");
		String pw = request.getParameter("pw");
		
		try {
			Model m = new Model();
			m.setUn(un);
			m.setPw(pw);
			
			if(m.accountantLogin()==true) {
				String name = m.getName();
				
				HttpSession session = request.getSession(true);
				session.setAttribute("NAME", name);
				
				response.sendRedirect("/FeeManagement/accountantOptions.jsp");
			}
			else
				response.sendRedirect("/FeeManagement/accountantLoginFailure.jsp");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
