package design.pattern.projet;

public class Unite {
    public int vitesse;
    public Coffre coffre;
    public TypeUnite type;
    public Outils outils;
    public Groupe groupe;
    public int x;
    public int y;
    public Unite(int vitesse, TypeUnite type, int x, int y) {
        this.vitesse = vitesse;
        this.type = type;
        this.outils=  OutilsFactory.getInstance().getOutils(type);
        this.groupe=null;
        this.x=x;
        this.y=y;


    }
    @Override
    public String toString() {
        String elem="Unite [vitesse=" + vitesse + ", type=" + type.toString() +"groupe=";
       if(groupe == null){
            elem=elem+" aucun ]";
        }
        else{
            elem+=groupe.nom+ "]";
        }

        return elem;
    }
    public int valeurRecolte(){
        int val; 
        if(this.groupe==null){
            val=1;
        }
        else{
            val=2;
        }
        return val;
    }


}
