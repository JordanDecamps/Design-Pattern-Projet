package design.pattern.projet;

public class BatimentCreationOutilsBucheron implements BatimentCreationOutils {
    @Override
    public void construire() {
        System.out.println("batiment creation outils bucheron construit");
    }

    @Override
    public void remove() {
        System.out.println("batiment creation outils bucheron detruit");
    }
    
}
