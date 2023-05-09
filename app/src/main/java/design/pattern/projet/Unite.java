package design.pattern.projet;
public class Unite {
    public int vitesse;
    public TypeUnite type;
    public Unite(int vitesse, TypeUnite type) {
        this.vitesse = vitesse;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Unite [vitesse=" + vitesse + ", type=" + type.toString() + "]";
    }
    


}
