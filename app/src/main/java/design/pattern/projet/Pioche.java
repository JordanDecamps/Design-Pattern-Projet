package design.pattern.projet;

public class Pioche implements Outils {

    @Override
    public void Recolter(Coffre coffre,  Case position,  int quantite){
        coffre.ajouterRessource(Ressources.Pierre, position.enleverRessource(Ressources.Pierre, quantite));
        coffre.ajouterRessource(Ressources.Or, position.enleverRessource(Ressources.Or, quantite));
        
    }

    
}