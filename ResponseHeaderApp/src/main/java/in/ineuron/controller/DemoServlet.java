package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet(urlPatterns={"/Demo"},loadOnStartup =0)
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static {
		System.out.println("DemoServlet is loading.....");
	}
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
        
       System.out.println("DemoServlet is instantiating....");
    }

	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("DemoServlet is initialiazing....");
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	 
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1 align='center'>DemoServlet information:</h1>");
		out.println("<Client IP Address: "+request.getRemoteAddr());
		out.println("Client Host name: "+request.getRemoteHost());
		out.println("Client PortNo: "+request.getRemotePort());
		out.println("Server name: "+request.getServerName());
		out.println("Server Portno: "+request.getServerPort());
		
		
		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DemoServelt is DeInstantiated.....");
	}

}
