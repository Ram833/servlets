
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddAccountant extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String un = request.getParameter("un");
		String pw = request.getParameter("pw");
		
		try {
			Model m = new Model();
			m.setName(name);
			m.setUn(un);
			m.setPw(pw);
			boolean status = m.addAccountant();
			
			if(status==true)
				response.sendRedirect("/FeeManagement/acntAddedSuccess.jsp");
			else
				response.sendRedirect("/FeeManagement/acntAddedFailure.jsp");
		} 
		catch (Exception e) {e.printStackTrace();}
	}
}
