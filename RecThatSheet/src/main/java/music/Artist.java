package music;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist {
	@Id
	private int _id;
	private String _Nom;
	private String _Prenom;
	
	public Artist(String nom, String prenom)
	{
		setNom(nom);
		setPrenom(prenom);
	}

	public String getNom() {
		return _Nom;
	}

	public void setNom(String Nom) {
		this._Nom = Nom;
	}

	public String getPrenom() {
		return _Prenom;
	}

	public void setPrenom(String Prenom) {
		this._Prenom = Prenom;
	}

	public int getid() {
		return _id;
	}

	public void setid(int id) {
		this._id = id;
	}
}
