package design.pattern.projet;

public class BatimentsFactory {

    public Batiments createProductionBatiment(TypeUnite type) {
        return new ProductionBatiment(type);
    }
}