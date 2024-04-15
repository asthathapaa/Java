package sthaa;

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class WelcomeUser extends HttpServlet { 
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, 
                     HttpServletResponse response) 
            throws ServletException, IOException { 
 
        response.setContentType("text/html"); 
        PrintWriter pwriter = response.getWriter(); 
 
        String name = request.getParameter("uname"); 
        
        // Write HTML response with CSS styling
        pwriter.println("<!DOCTYPE html>");
        pwriter.println("<html>");
        pwriter.println("<head>");
        pwriter.println("<meta charset=\"UTF-8\">");
        pwriter.println("<title>Welcome</title>");
        pwriter.println("<style>");
        pwriter.println("body {");
        pwriter.println("  font-family: Arial, sans-serif;");
        pwriter.println("  background-color: #f4f4f4;");
        pwriter.println("  text-align: center;");
        pwriter.println("}");
        pwriter.println("h1 {");
        pwriter.println("  color: #333333;");
        pwriter.println("}");
        pwriter.println("</style>");
        pwriter.println("</head>");
        pwriter.println("<body>");
        pwriter.println("<h1>Hello " + name + "!</h1>");
        pwriter.println("<p>Welcome to This page</p>");
        pwriter.println("<div style='text-align: center;'><a href=\"index.html\">Redirect to Login page</a></div>");
        pwriter.println("</body>");
        pwriter.println("</html>");
    } 
}  
