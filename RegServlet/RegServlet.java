

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}



		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = request.getServletContext();
		HttpSession session = request.getSession();
		
		//tworze usera o prawach admina dla testów
		User.user.add("admin");
		User.user.add("aaa");
		User.user.add("mail@com");
		User.user.add("a");
		//
		
		if(request.getParameter("username").isEmpty() != true){ 
			if(request.getParameter("password").isEmpty() != true){  
				if(request.getParameter("email").isEmpty() != true){
		
		
			User.user.add(request.getParameter("username"));    //pozycja 0	+k*4  gdzie k to nr usera
			User.user.add(request.getParameter("password"));	//pozycja 1	+k*4
			User.user.add(request.getParameter("email"));		//pozycja 2	+k*4
			User.user.add("u");				// u - jako zwykly user na początek, p - premim, a - admin
					}
						else response.sendRedirect("wrongreg.jsp");
				}	else response.sendRedirect("wrongreg.jsp");
			}	else response.sendRedirect("wrongreg.jsp");
		
		response.sendRedirect("logForm.jsp");
		
		
		 
		

	
	
	}

}
