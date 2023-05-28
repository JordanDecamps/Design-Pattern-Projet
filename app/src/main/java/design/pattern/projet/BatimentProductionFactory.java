
package design.pattern.projet;

public final class BatimentProductionFactory {

    private static BatimentProductionFactory instance;

    private BatimentProductionFactory() {
    };

    public static BatimentProductionFactory getInstance() {
        if (instance == null) {
            instance = new BatimentProductionFactory();
        }
        return instance;
    }

    public BatimentProduction getBatimentsProduction(TypeUnite type) {
        if (type == TypeUnite.BUCHERON) {
            return new BatimentProductionBucheron();
        }
        if (type == TypeUnite.PAYSAN) {
            return new BatimentProductionPaysan();
        }
        if (type == TypeUnite.MINEUR) {
            return new BatimentProductionMineur();
        }

        return null;
    }
}
