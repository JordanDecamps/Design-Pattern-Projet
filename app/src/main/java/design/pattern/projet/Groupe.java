package design.pattern.projet;

import java.util.ArrayList;

public class Groupe {
    public ArrayList<Unite> listeUnite;

    public Groupe(ArrayList<Unite> listeUnite) {
        this.listeUnite = listeUnite;
    }

    @Override
    public String toString() {
       
        return "Groupe [listeUnite=" + listeUnite + "]";
    }

    

    
}
