package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugudanServlet")
public class gugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	public gugudanServlet() {		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setCharacterEncoding("euc-kr");
		response.setContentType("text/html");
		
		String num = request.getParameter("num");
		int guguNum = Integer.parseInt(num);
		
		for(int i=1; i<=9; i++) {
			response.getWriter().append("<br>" + guguNum + " * " + i + " = " + guguNum * i);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
