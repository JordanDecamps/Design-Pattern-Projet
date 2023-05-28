
package design.pattern.projet;

public final class BatimentCreationOutilsFactory {

    private static BatimentCreationOutilsFactory instance;

    private BatimentCreationOutilsFactory() {
    };

    public static BatimentCreationOutilsFactory getInstance() {
        if (instance == null) {
            instance = new BatimentCreationOutilsFactory();
        }
        return instance;
    }

    public BatimentCreationOutils getBatimentsCreationOutils(TypeUnite type) {
        if (type == TypeUnite.BUCHERON) {
            return new BatimentCreationOutilsBucheron();
        }
        if (type == TypeUnite.PAYSAN) {
            return new BatimentCreationOutilsPaysan();
        }
        if (type == TypeUnite.MINEUR) {
            return new BatimentCreationOutilsMineur();
        }

        return null;
    }
}
