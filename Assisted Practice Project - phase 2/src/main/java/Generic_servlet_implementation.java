import java.io.*;
import javax.servlet.*;

public class Generic_servlet_implementation extends  GenericServlet{
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h2>Welcome to Generic Servelet Implementation</h2>");
		pw.println("<h2>Running..</h2>");
		
		pw.println("<html>");
		pw.println("<body>");
		
	}

}
