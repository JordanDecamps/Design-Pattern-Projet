package design.pattern.projet;

public class Houe  implements Outils{

    @Override
    public void Recolter(Coffre coffre, Case position){
        System.out.println("Houe");
        coffre.ajouterRessource(Ressources.Nourriture, position.enleverRessource(Ressources.Nourriture, 1));
        
    }
    
}
