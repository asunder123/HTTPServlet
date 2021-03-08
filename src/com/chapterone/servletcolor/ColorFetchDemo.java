package com.chapterone.servletcolor;
import java.io.* ;
import javax.servlet.*;
import javax.servlet.http.*;

public class ColorFetchDemo extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException{
		
		String color = req.getParameter("color");
		resp.setContentType("text/html");
        PrintWriter wr = resp.getWriter();
        wr.println("<p>the selected color is :");
        wr.println(color);
        wr.close();
        
	}
}
