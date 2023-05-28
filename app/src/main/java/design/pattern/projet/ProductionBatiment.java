package design.pattern.projet;

public class ProductionBatiment implements Batiments {

    public TypeUnite type;

    public ProductionBatiment(TypeUnite type) {
        this.type = type;
    }

    @Override
    public void construire() {
        System.out.println("Construction du bâtiment de production pour les " + type);
    }

    @Override
    public void remove() {
        System.out.println("Suppression du bâtiment de production pour les " + type);
    }
    
}
