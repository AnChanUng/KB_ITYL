package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParameterServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String hobby = request.getParameter("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		response.getWriter().append("이름: "+name);
		response.getWriter().append("<br>e-mail: "+email);
		response.getWriter().append("<br>성별: "+gender);
		response.getWriter().append("<br>취미: "+hobby);
		response.getWriter().append("<br>선호하는 재테크: "+favorite);
		response.getWriter().append("<br>기타: "+desc);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
