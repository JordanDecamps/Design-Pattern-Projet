package design.pattern.projet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Case {

    public Map<Ressources, Integer> listeRessourcesCase;
    public List<Unite> listeUnitesCase;

    public Case() {
        listeRessourcesCase = new HashMap<>();
        for (Ressources res : Ressources.values()) {
            listeRessourcesCase.put(res, 0);
        }
        listeUnitesCase = new ArrayList<Unite>();

    }

    public String toString() {
        String res = "Les ressources:\n";
        for (Map.Entry<Ressources, Integer> mapentry : this.listeRessourcesCase.entrySet()) {
            res += mapentry.getKey() + " : " + mapentry.getValue() + "\n";

        }
        res += "Les unitées:\n";
        for (Unite unite : listeUnitesCase) {
            res += unite.toString() + "\n";
        }
        return res;

    }

    public int enleverRessource(Ressources ressource, int quantite){
        int val =listeRessourcesCase.get(ressource);
        if (val - quantite >= 0 ){
            listeRessourcesCase.put(ressource, val-quantite);
            return quantite;
        }
        else{
            listeRessourcesCase.put(ressource, 0);
            return val;
        }
        
        
    }

}
