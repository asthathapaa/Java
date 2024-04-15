
package sthaa;


import java.io.*;  
 
import javax.servlet.*;  
import javax.servlet.http.*;      
public class Validation extends HttpServlet 
{    
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, 
     HttpServletResponse response) 
       throws ServletException, IOException 
   {        
       response.setContentType("text/html");      
       PrintWriter pwriter = response.getWriter();                
       String name=request.getParameter("uname");      
       String pass=request.getParameter("upass");                
       if(name.equals("Astha") && 
          pass.equals("Thapa"))
       {          
          RequestDispatcher dis=request.getRequestDispatcher("welcome");          
          dis.forward(request, response);      
       }     
       else
       {      
    	   pwriter.println("<!DOCTYPE html>");
           pwriter.println("<html>");
           pwriter.println("<head>");
           pwriter.println("<meta charset=\"UTF-8\">");
           pwriter.println("<style>");
//    	   pwriter.print("<div style='text-align: center; color: red;'> Invalid Username or Password!</div>");
//  
           pwriter.println("  text-align: center;");
           pwriter.println("  color: red;");
           pwriter.println("}");
           pwriter.println("</style>");
           pwriter.println("</head>");
           pwriter.println("<body>");
           pwriter.println("<h3  style='color: red; text-align: center;' >User name or password is incorrect!</h3>");
           pwriter.println("</body>");
           pwriter.println("</html>");
          RequestDispatcher dis=request.getRequestDispatcher("index.html");          
          dis.include(request, response);           

         
       }      
   }    
}  