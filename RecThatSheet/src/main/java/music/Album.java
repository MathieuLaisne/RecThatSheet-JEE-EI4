package music;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
	@Id
	private int _id;
	private String _Titre;
	private Artist _Artist;
	private ArrayList<Musique> _Musiques;
	
	
	
	public String getTitre() {
		return _Titre;
	}
	public void setTitre(String Titre) {
		this._Titre = Titre;
	}
	public Artist getArtist() {
		return _Artist;
	}
	public void setArtist(Artist Artist) {
		this._Artist = Artist;
	}
	public ArrayList<Musique> getMusiques() {
		return _Musiques;
	}
	public void setMusiques(ArrayList<Musique> Musiques) {
		this._Musiques = Musiques;
	}
}
