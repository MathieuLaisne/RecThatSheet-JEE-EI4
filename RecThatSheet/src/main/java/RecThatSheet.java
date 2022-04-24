

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
			Musique[] musiques = d.Songs();
			out.println("<select name=\"song\">");
			for(Musique m : musiques)
			{
				out.println("<option value="+m.getid()+">"+m.toString()+"</option>");
			}
			out.println("</select>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
