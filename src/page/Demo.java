package page;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(description = "WebProjectMaven", urlPatterns = { "/Demo" , "/Demo.do"}, initParams = {@WebInitParam(name="id",value="1"),@WebInitParam(name="name",value="pankaj")})
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";
       

    public Demo() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Date date = new Date();
		out.println(HTML_START + "Name: <input type=\"text\" id=\"myText\" value=\"\">\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<button onclick=\"myFunction()\">Click Here</button>\r\n" + 
				"\r\n" + 
				"<p id=\"demo\"></p>\r\n" + 
				"\r\n" + 
				"<script>\r\n" + 
				"function myFunction() {\r\n" + 
				"    var x = document.getElementById(\"myText\").value;\r\n" + 
				"    document.getElementById(\"demo\").innerHTML = x;\r\n" + 
				"}\r\n" + 
				"</script><h3>Date="+date +"</h3>"+HTML_END);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}