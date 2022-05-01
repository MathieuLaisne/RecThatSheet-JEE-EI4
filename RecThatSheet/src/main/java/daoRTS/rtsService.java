package daoRTS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import music.*;

public class rtsService {
	
	private static dao tot = new dao();
	
	 @Path("/Artists")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Artist[] getArtist()
	 {
		 return tot.getallArtists();
	 }
	 
	 @Path("/Genres")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Genre[] getGenre()
	 {
		 return tot.getallGenres();
	 }
	 
	 @Path("/Albums")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Album[] getAlbum()
	 {
		 return tot.getallAlbums();
	 }
	 
	 @Path("/Songs")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Musique[] getSongs()
	 {
		 return tot.getallMusiques();
	 }
	 
	 @Path("/Recommendations/{id}")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Musique getRecs(@PathParam("id") int id)
	 {
		 Musique m = tot.getMusique(id);
		 return tot.getRecommendation(m);
	 }

}
