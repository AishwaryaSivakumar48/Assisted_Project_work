import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class Session_servlet2 extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    Cookie ck[]=request.getCookies();  
    out.print("Hello "+ck[0].getValue());  
  
    out.close();  
  
         }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  
