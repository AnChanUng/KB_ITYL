package BE_WS_02.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParameterServlet
 */
@WebServlet("/params")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String job = request.getParameter("job");
		String pageNo = request.getParameter("pageNo");
		String searchWord = request.getParameter("searchWord");

		String result = "";
		result += "<h1> job: " + job + "</h1>";
		result += "<h1> pageNo: " + pageNo + "</h1>";
		result += "<h1> searchWord: " + searchWord + "</h1>";
		
		System.out.println("job : "+job);
		System.out.println("pageNo : "+pageNo);
		System.out.println("searchWord : "+searchWord);
		
		response.setContentType("text/html");
		response.setCharacterEncoding("euc-kr"); // 한글 전용
		response.getWriter().append(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		
		System.out.println("name : "+name);
		System.out.println("email : "+email);
		System.out.println("gender : "+gender);
		System.out.print("hobby : ");
		for (int i = 0; i < hobby.length - 1; i++) {
			System.out.print(hobby[i] + ", ");
		}
		System.out.println(hobby[hobby.length - 1]);
		System.out.println("favorite : "+favorite);
		System.out.println("desc : "+desc);

		String result = "";
		result += "<h1>name : " + name + "</h1>";
		result += "<h1>email : " + email + "</h1>";
		result += "<h1>gender : " + gender + "</h1>";
		result += "<h1>hobby : ";
		for (int i = 0; i < hobby.length - 1; i++) {
			result += hobby[i] + ", ";
		}
		result += hobby[hobby.length - 1] + "</h1>";

		result += "<h1>favorite : " + favorite + "</h1>";
		result += "<h1>desc : " + desc + "</h1>";

		response.setContentType("text/html");
		response.setCharacterEncoding("euc-kr"); // 한글 전용
		response.getWriter().append(result);
	}

}
