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
<<<<<<< Updated upstream
		 return tot.Artists;
=======
		 return tot.getallArtists();
>>>>>>> Stashed changes
	 }
	 
	 @Path("/Genres")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Genre[] getGenre()
	 {
<<<<<<< Updated upstream
		 return tot.Genres;
=======
		 return tot.getallGenres();
>>>>>>> Stashed changes
	 }
	 
	 @Path("/Albums")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Album[] getAlbum()
	 {
<<<<<<< Updated upstream
		 return tot.Albums;
=======
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
>>>>>>> Stashed changes
	 }

}
