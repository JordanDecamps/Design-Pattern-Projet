package design.pattern.projet;

public class Houe implements Outils {

    private Coffre coffre;

    public Houe(Coffre coffre) {
        this.coffre = coffre;
    }

    @Override
    public void Recolter() {
        System.out.println("Houe");
        coffre.ajouterRessource(Ressources.Nourriture, 1);
    }
}
