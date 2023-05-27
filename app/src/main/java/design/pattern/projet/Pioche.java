package design.pattern.projet;

public class Pioche implements Outils {

    @Override
    public void Recolter(Coffre coffre,  Case position){
        coffre.ajouterRessource(Ressources.Pierre, position.enleverRessource(Ressources.Pierre, 1));
        coffre.ajouterRessource(Ressources.Or, position.enleverRessource(Ressources.Or, 1));
        
    }

    
}