package daoRTS;

import java.util.ArrayList;

import music.*;

public class dao {


	Musique[] Musiques;
	Genre[] Genres;

	public Musique getRecommendation(Musique m){
		Genre[] derive = getDerives(m);
	    ArrayList<Musique> Recs = new ArrayList<Musique>();
	    foreach(Genre g in derive)
	    {
	        Musique[] musiqueDeriv = getMusique(g);
	        foreach(Musique m2 in musiqueDeriv)
	        {
	            Recs.Add(m2);
	            Recs.Add(m2);
	        }
	    }
	    foreach(Musique m2 in getMusique(m.getGenre()))
	    {
	        if(m2 != m) 
	        {
	            Recs.Add(m2);
	            Recs.Add(m2);
	            Recs.Add(m2);
	            Recs.Add(m2);
	            Recs.Add(m2);
	            Recs.Add(m2);
	        }
	    }
	    foreach(Musique m2 in getOg(m))
	    {
	        Recs.Add(m2);
	        Recs.Add(m2);
	        Recs.Add(m2);
	        Recs.Add(m2);
	    }
	    return Recs[Random.nextInt(Recs.Count)];
	}

	public Musique[] getOG(Musique m)
	{
	    Genre OG;
	    ArrayList<Musique> music = new ArrayList<Musique>();
	    foreach(Genre g in Genres)
	    {
	        if(g.getDerives.contains(m.getGenre())) OG == g;
	    }
	    foreach(Musique m2 in Musiques)
	    {
	        if(m2.getGenre() == OG) music.Add(m2);
	    }
	    return music.toArray();
	}

	public Genre[] getDerives(Musique m)
	{
	    ArrayList<Genre> genres = new ArrayList<Genre>();
	    foreach(Genre g in Genres)
	    {
	        if(m.getDerives().contains(g)) genres.add(g);
	    }
	    return genres.toArray();
	}

	public Musique[] getMusique(Genre g)
	{
	    ArrayList<Musique> musiques = new ArrayList<Musique>();
	    foreach(Musique m in Musiques)
	    {
	        if(m.getGenre() == g) musiques.Add(m);
	    }
	    return musiques.toArray();
	}
}
