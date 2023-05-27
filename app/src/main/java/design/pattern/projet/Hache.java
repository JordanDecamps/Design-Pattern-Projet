package design.pattern.projet;

public class Hache implements Outils {

    @Override
    public void Recolter(Coffre coffre, Case position){
        System.out.println("test");
        coffre.ajouterRessource(Ressources.Bois, position.enleverRessource(Ressources.Bois, 1));
        
    }

}
