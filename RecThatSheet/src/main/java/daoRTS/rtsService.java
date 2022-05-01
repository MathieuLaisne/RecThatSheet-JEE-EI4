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
	 
	 @Path("/Artist/{id}")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Artist gArtist(@PathParam("id") int id)
	 {
		 return tot.getArtist(id);
	 }
	 
	 @Path("/Genres")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Genre[] getGenre()
	 {
		 return tot.getallGenres();
	 }
	 
	 @Path("/Genre/{id}")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Genre gGenre(@PathParam("id") int id)
	 {
		 return tot.getGenre(id);
	 }
	 
	 @Path("/Albums")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Album[] getAlbum()
	 {
		 return tot.getallAlbums();
	 }
	 
	 @Path("/Artist/{id}")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Album gAlbum(@PathParam("id") int id)
	 {
		 return tot.getAlbum(id);
	 }
	 
	 @Path("/Songs")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Musique[] getSongs()
	 {
		 return tot.getallMusiques();
	 }
	 
	 @Path("/Song/{id}")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Musique gSong(@PathParam("id") int id)
	 {
		 return tot.getMusique(id);
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
