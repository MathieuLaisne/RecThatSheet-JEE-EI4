package daoRTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import music.*;

public class dao {


	Musique[] Musiques;
	Genre[] Genres;
	Artist[] Artists;
	Album[] Albums;
	
	EntityManagerFactory emf;
    EntityManager entityManager;

    public dao()
    {
        emf = Persistence.createEntityManagerFactory("RecThatSheetDB");
        entityManager = emf.createEntityManager();
    }
    
    public void getallMusiques()
    {
    	Query q = entityManager.createQuery( "from Musique" , Musique.class );
		List<Musique> musiques ;
		musiques = q.getResultList();
		Musiques = musiques.toArray(Musiques);
    }
    
    public void getallGenres()
    {
    	Query q = entityManager.createQuery( "from Genre" , Genre.class );
		List<Genre> genres ;
		genres = q.getResultList();
		Genres = genres.toArray(Genres);
    }
    
    public void getallArtists()
    {
    	Query q = entityManager.createQuery( "from Artiste" , Artist.class );
		List<Artist> artistes ;
		artistes = q.getResultList();
		Artists = artistes.toArray(Artists);
    }
    
    public void getallAlbums()
    {
    	Query q = entityManager.createQuery( "from Album" , Album.class );
		List<Album> albums ;
		albums = q.getResultList();
		Albums = albums.toArray(Albums);
    }
    
    public void init()
    {
    	getallMusiques();
    	getallGenres();
    	getallArtists();
    	getallAlbums();
    }

	public Musique getRecommendation(Musique m){
		Genre[] derive = getDerives(m);
	    ArrayList<Musique> Recs = new ArrayList<Musique>();
	    for(Genre g : derive)
	    {
	        Musique[] musiqueDeriv = getMusique(g);
	        for(Musique m2 : musiqueDeriv)
	        {
	            Recs.add(m2);
	            Recs.add(m2);
	        }
	    }
	    for(Musique m2 : getMusique(m.getGenre()))
	    {
	        if(m2 != m) 
	        {
	            Recs.add(m2);
	            Recs.add(m2);
	            Recs.add(m2);
	            Recs.add(m2);
	            Recs.add(m2);
	            Recs.add(m2);
	        }
	    }
	    for(Musique m2 : getOG(m))
	    {
	        Recs.add(m2);
	        Recs.add(m2);
	        Recs.add(m2);
	        Recs.add(m2);
	    }
	    Random r = new Random();
	    int ind = r.nextInt(Recs.size());
	    return Recs.get(ind);
	}

	public Musique[] getOG(Musique m)
	{
	    Genre OG = null;
	    ArrayList<Musique> music = new ArrayList<Musique>();
	    for(Genre g : Genres)
	    {
	        if(g.getDerives().contains(m.getGenre())) OG = g;
	    }
	    for(Musique m2 : Musiques)
	    {
	        if(m2.getGenre() == OG) music.add(m2);
	    }
	    return (Musique[]) music.toArray();
	}

	public Genre[] getDerives(Musique m)
	{
	    ArrayList<Genre> genres = new ArrayList<Genre>();
	    for(Genre g : Genres)
	    {
	        if(m.getGenre().getDerives().contains(g)) genres.add(g);
	    }
	    return (Genre[]) genres.toArray();
	}

	public Musique[] getMusique(Genre g)
	{
	    ArrayList<Musique> musiques = new ArrayList<Musique>();
	    for(Musique m : Musiques)
	    {
	        if(m.getGenre() == g) musiques.add(m);
	    }
	    return (Musique[]) musiques.toArray();
	}
}
