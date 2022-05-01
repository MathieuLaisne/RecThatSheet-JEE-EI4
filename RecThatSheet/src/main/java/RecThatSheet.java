

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import music.*;

/**
 * Servlet implementation class RTSserv
 */
@WebServlet("/SongList")
public class RecThatSheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecThatSheet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			
			String urlString = "http://localhost:8080/RecThatSheet/Songs";
		    URL url = new URL(urlString);
		    URLConnection conn = url.openConnection();
		    InputStream is = conn.getInputStream();
		    String json = is.toString();
		    ObjectMapper objectMapper = new ObjectMapper();
		    Musique[] musiques = objectMapper.readValue(json, Musique[].class);
		    
			PrintWriter out = response.getWriter();
			out.println("<html>");
		    out.println("<body>");
		    out.println("<head>");
		    out.println("<title>Chanson Préférée</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<p>Choisissez votre chanson préférée:</p>");
			out.println("<form action=\"/Rec\" method=\"post\">");
			out.println("<select name=\"song\">");
			for(Musique m : musiques)
			{
				out.println("<option value="+m.getid()+">"+m.toString()+"</option>");
			}
			out.println("</select>");
			out.println("<button type=\"submit\">Valider</button>");
			out.println("</form>");
			out.println("</body>");
		    out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("song"));
		
		String urlString = "http://localhost:8080/RecThatSheet/Recommendation/" + id;
	    URL url = new URL(urlString);
	    URLConnection conn = url.openConnection();
	    InputStream is = conn.getInputStream();
	    String json = is.toString();
	    ObjectMapper objectMapper = new ObjectMapper();
	    Musique[] musiques = objectMapper.readValue(json, Musique[].class);
		String Rec = musiques[0].toString();
		
		urlString = "http://localhost:8080/RecThatSheet/Songs" + id;
	    url = new URL(urlString);
	    conn = url.openConnection();
	    is = conn.getInputStream();
	    json = is.toString();
	    objectMapper = new ObjectMapper();
	    musiques = objectMapper.readValue(json, Musique[].class);
		String m = musiques[0].toString();
		
		out.println("<html>");
	    out.println("<body>");
	    out.println("<head>");
		out.println("<title>Recommendation</title>");
		out.println("</head>");
	    out.println("<body>");
	    out.println("<p>Chanson ressemblant à " + m + ":</p>");
	    out.println("<p>");
	    out.println(Rec);
	    out.println("</p>");
	    out.println("</body>");
	    out.println("</html>");
	}

}
