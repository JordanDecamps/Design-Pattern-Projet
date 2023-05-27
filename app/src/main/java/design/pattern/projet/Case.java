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
        for(Ressources res : Ressources.values()){
            listeRessourcesCase.put(res,0);
        }
        listeUnitesCase= new ArrayList<Unite>();
       
    }

    

    
}
