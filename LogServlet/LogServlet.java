

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
    public LogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
	
		int i;
		for(i=0; i<User.user.size() ; i=i+4){
			if((request.getParameter("username").equals(User.user.get(i)))== true)
				{if((request.getParameter("password").equals(User.user.get(i+1))) == true)
				{response.getWriter().println("zalogowales sie");
				session.setAttribute("nrOfUser", i);
				session.setAttribute("logged", 1);
				response.sendRedirect("menu.jsp");
				
				}
				else response.getWriter().println("nieprawidlowe haslo");
				
				} 
			
		}
		
		
		response.getWriter().println("sry");
		
		
		
	
	}

}
