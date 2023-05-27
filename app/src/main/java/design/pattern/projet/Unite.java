package design.pattern.projet;


public class Unite {
    public int vitesse;
    public Coffre coffre;
    public TypeUnite type;
    public Outils outils;
    public Unite(int vitesse, TypeUnite type) {
        this.vitesse = vitesse;
        this.type = type;
        this.outils=  OutilsFactory.getInstance().getOutils(type,coffre);


    }
    @Override
    public String toString() {
        return "Unite [vitesse=" + vitesse + ", type=" + type.toString() + "]";
    }
    


}
