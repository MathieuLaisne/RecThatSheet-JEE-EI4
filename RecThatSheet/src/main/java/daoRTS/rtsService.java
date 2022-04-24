package daoRTS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
		 return tot.Artists;
	 }
	 
	 @Path("/Genres")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Genre[] getGenre()
	 {
		 return tot.Genres;
	 }
	 
	 @Path("/Albums")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Album[] getAlbum()
	 {
		 return tot.Albums;
	 }

}
