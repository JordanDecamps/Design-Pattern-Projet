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

    public void ajouterRessource(Ressources ressource, int quantite) {
        int quantiteActuelle = ressources.getOrDefault(ressource, 0);
        ressources.put(ressource, quantiteActuelle + quantite);
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
