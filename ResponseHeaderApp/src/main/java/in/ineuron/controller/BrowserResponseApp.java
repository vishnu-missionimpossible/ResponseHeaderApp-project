package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BrowserResponseApp
 */
@WebServlet(urlPatterns = {"/test"},loadOnStartup = 1)
public class BrowserResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	static {
		System.out.println("TestServlet is loading...");
	}
	public BrowserResponseApp() {
		// TODO Auto-generated constructor stub
		System.out.println("TestServleet is instantiating....");
	}
	 @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("TestServlet is initializing.....");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<center><h1>Request Header Information....</h1></center>");
		
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>HeaderName</th><th>HeaderValue</th></tr>");
		while(headerNames.hasMoreElements()) {
			out.println("<tr>");
			String headerName = (String)headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println("<td>"+headerName+"</td><td>"+headerValue+"</td>");
			
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
