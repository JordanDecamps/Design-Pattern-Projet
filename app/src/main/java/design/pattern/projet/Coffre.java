package design.pattern.projet;

import java.util.HashMap;
import java.util.Map;


public class Coffre {

    public Map<Ressources, Integer> ressources ;

    public Coffre() {
        ressources = new HashMap<>();
        for(Ressources res : Ressources.values()){
            ressources.put(res,0);
        }
    }

    @Override
    public String toString() {
        String texte = "";
        for(Map.Entry<Ressources, Integer> res : ressources.entrySet()){
            texte += res.getKey().toString() + " " + res.getValue()+ " ";
        }

        return texte;
    }

}
