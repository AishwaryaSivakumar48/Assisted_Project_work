import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Get_handler extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
/**
* @see HttpServlet#HttpServlet()
*/
public Get_handler() {
    super();
    // TODO Auto-generated constructor stub
}

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
              PrintWriter out = response.getWriter();
                out.println("<html><body>");
                
                String name = request.getParameter("name");
                String address = request.getParameter("address");
                out.println("Name=" + name + "<br>Address=" + address);
                out.println("</body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            doGet(request, response);
    }

}