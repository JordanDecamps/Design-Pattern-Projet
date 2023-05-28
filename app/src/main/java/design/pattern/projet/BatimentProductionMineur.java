package design.pattern.projet;

public class BatimentProductionMineur implements BatimentProduction {
    @Override
    public void construire() {
        System.out.println("batiment production mineur construit");
    }

    @Override
    public void remove() {
        System.out.println("batiment production mineur detruit");
    }
    
}
