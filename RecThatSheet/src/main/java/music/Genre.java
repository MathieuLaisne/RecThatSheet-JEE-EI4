package music;

import java.util.ArrayList;

public class Genre {
    
     private String _Nom;
     private Genre _Origine;
     private ArrayList<Genre> _Derives;
     
     public Genre(String nom, Genre origine, ArrayList<Genre> derives)
     {
         setNom(nom);
         setOrigine(origine);
         setDerives(derives);
     }

    public String getNom() {
        return _Nom;
    }

    public void setNom(String Nom) {
        this._Nom = Nom;
    }

    public Genre getOrigine() {
        return _Origine;
    }

    public void setOrigine(Genre Origine) {
        this._Origine = Origine;
    }

    public ArrayList<Genre> getDerives() {
        return _Derives;
    }

    public void setDerives(ArrayList<Genre> Derives) {
        this._Derives = Derives;
    }
}