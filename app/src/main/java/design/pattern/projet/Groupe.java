package design.pattern.projet;

import java.util.ArrayList;

public class Groupe {
    public ArrayList<Unite> listeUnite;

    public Groupe(ArrayList<Unite> listeUnite) {
        this.listeUnite = listeUnite;
    }

    @Override
    public String toString() {
        String texte = "";
        for (Unite element : listeUnite) {
            texte+= element;
        }
        return "Groupe [listeUnite=" + listeUnite + "]";
    }

    

    
}
