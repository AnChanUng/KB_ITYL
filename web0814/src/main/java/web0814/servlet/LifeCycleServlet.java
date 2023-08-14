package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public LifeCycleServlet() {}
	
	@Override
	public void init() throws ServletException {
		//서블릿 초기화 메서드
		System.out.println("** INIT() **");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		//요청마다 실행되는 메서드
		System.out.println("*** SERVICE ***");
	}
	
	protected void destory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//요청마다 실행되는 메서드
		System.out.println("*** destory ***");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		resp.getWriter().append("Hello Get");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
