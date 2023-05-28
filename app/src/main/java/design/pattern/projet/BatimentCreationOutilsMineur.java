package design.pattern.projet;

public class BatimentCreationOutilsMineur implements BatimentCreationOutils {
    @Override
    public void construire() {
        System.out.println("batiment creation outils mienur construit");
    }

    @Override
    public void remove() {
        System.out.println("batiment creation outils mineur detruit");
    }
    
}
