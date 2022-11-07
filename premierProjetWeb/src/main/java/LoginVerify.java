

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginVerify
 */

@WebServlet("/LoginVerify")
public class LoginVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginVerify() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("password");
		if(uname.equals("admin") && pwd.equals("admin")) {
			System.out.println("Les id sont corrects");
		}else {
			System.out.println("Erreur id");
			System.out.println("OEHGOIERHOGBOEBUIGZGELKBUIVOEHNPEVHIOP");
		}
	}

}
