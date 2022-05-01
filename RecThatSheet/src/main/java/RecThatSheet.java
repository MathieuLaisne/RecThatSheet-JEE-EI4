

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoRTS.dao;
import music.*;

/**
 * Servlet implementation class RTSserv
 */
@WebServlet("/SongList")
public class RecThatSheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	dao d = new dao();
       
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
			PrintWriter out = response.getWriter();
			Musique[] musiques = d.getallMusiques();
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
		Musique m = d.getMusique(id);
		String Rec = d.getRecommendation(m).toString();
		out.println("<html>");
	    out.println("<body>");
	    out.println("<head>");
		out.println("<title>Recommendation</title>");
		out.println("</head>");
	    out.println("<body>");
	    out.println("<p>Chanson ressemblant à " + m.toString() + ":</p>");
	    out.println("<p>");
	    out.println(Rec);
	    out.println("</p>");
	    out.println("</body>");
	    out.println("</html>");
	}

}
