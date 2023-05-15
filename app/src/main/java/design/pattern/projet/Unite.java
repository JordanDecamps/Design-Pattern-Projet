package design.pattern.projet;
public class Unite {
    public int vitesse;
    public TypeUnite type;
    public Outils outils;
    public Unite(int vitesse, TypeUnite type) {
        this.vitesse = vitesse;
        this.type = type;
        this.outils= new OutilsFactory().getOutils(type);


    }
    @Override
    public String toString() {
        return "Unite [vitesse=" + vitesse + ", type=" + type.toString() + "]";
    }
    


}
