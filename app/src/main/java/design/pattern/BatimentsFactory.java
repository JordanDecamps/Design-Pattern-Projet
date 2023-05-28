package design.pattern;

import design.pattern.projet.TypeUnite;

public class BatimentsFactory {

    public Batiments createProductionBatiment(TypeUnite type) {
        return new ProductionBatiment(type);
    }
    
}