package facebook;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup2
 */
public class Signup2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s= request.getParameter("string");
		 Signup1Dao rdao=new  Signup1Dao();
		 Signup1 s1=rdao.getSignup1(s);
		request.setAttribute("data", s1);
		RequestDispatcher rd=request.getRequestDispatcher("suresh12.jsp");
		rd.forward(request, response);
	}

}
