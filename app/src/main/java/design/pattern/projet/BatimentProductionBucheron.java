package design.pattern.projet;

public class BatimentProductionBucheron implements BatimentProduction {
    @Override
    public void construire() {
        System.out.println("batiment production bucheron construit");
    }

    @Override
    public void remove() {
        System.out.println("batiment production bucheron detruit");
    }
    
}
