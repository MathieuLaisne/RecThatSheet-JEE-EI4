package music;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music")
public class Musique {
	@Id
	private int _id;
	private String _Titre;
	private Artist _Artist;
	private Genre _Genre;
	private Album _Album;
	
	public Musique(int id, String titre, Artist artist, Genre genre, Album album)
	{
		_id = id;
		_Titre = titre;
		_Artist = artist;
		_Genre = genre;
		_Album = album;
	}
	
	public int getid() {
		return _id;
	}
	public void setid(int id) {
		this._id = id;
	}
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
	public Genre getGenre() {
		return _Genre;
	}
	public void setGenre(Genre Genre) {
		this._Genre = Genre;
	}
	public Album getAlbum() {
		return _Album;
	}
	public void setAlbum(Album Album) {
		this._Album = Album;
	}
}
