

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PremServlet
 */
@WebServlet("/PremServlet")
public class PremServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PremServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();
		
		int i;
		for(i=0; i<User.user.size() ; i=i+4){
			if((request.getParameter("username").equals(User.user.get(i)))== true)
				{
				 if(request.getParameter("premium").equals("set")){
				 User.user.remove(i+3);
				 User.user.add(i+3, "p");
				 }
				 else {
					 		User.user.remove(i+3);
							User.user.add(i+3, "u");};
					break;
				} 
			
		
		};
		
		response.getWriter().println("przeszlo dalej");
		
		response.getWriter().println("UserName: " + User.user.get(i));
		response.getWriter().println("Password: " +User.user.get(i+1));
		response.getWriter().println("Email: " + User.user.get(i+2));
		response.getWriter().println("Privilage: " + User.user.get(i+3));	

		
		
		
	}

}
