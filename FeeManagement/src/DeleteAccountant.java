

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAccountant extends HttpServlet {
public void service(HttpServletRequest request,HttpServletResponse response) {
		
		String name = request.getParameter("name");
		
		try {
			Model m = new Model();
			m.setName(name);
			
			boolean status = m.deleteAccountant();
			
			if(status==true)
				response.sendRedirect("/FeeManagement/acntDeleteSuccess.jsp");
			else
				response.sendRedirect("/FeeManagement/acntDeleteFailure.jsp");
		} 
		catch (Exception e) {e.printStackTrace();}
	}
}
