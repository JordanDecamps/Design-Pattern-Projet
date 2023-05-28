package design.pattern.projet;

public class BatimentProductionPaysan implements BatimentProduction {
    @Override
    public void construire() {
        System.out.println("batiment production paysan construit");
    }

    @Override
    public void remove() {
        System.out.println("batiment production paysan detruit");
    }
}