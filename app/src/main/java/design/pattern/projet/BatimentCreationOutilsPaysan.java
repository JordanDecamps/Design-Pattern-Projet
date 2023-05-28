package design.pattern.projet;

public class BatimentCreationOutilsPaysan implements BatimentCreationOutils {
    @Override
    public void construire() {
        System.out.println("batiment creation outils paysan construit");
    }

    @Override
    public void remove() {
        System.out.println("batiment creation outils paysan detruit");
    }
    
}
