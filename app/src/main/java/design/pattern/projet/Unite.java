package design.pattern.projet;

public class Unite {
    public int vitesse;
    public Coffre coffre;
    public TypeUnite type;
    public Outils outils;
    public Groupe groupe;
    public int x;
    public int y;
    public Boolean aTravaille;
    public Boolean aMange;

    public Unite(int vitesse, TypeUnite type, int x, int y) {
        this.vitesse = vitesse;
        this.type = type;
        this.outils=  OutilsFactory.getInstance().getOutils(type);
        this.groupe=null;
        this.x=x;
        this.y=y;
        this.aTravaille=false;
        this.aMange=false;


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
    public int QuantiteRamassage(){
        return 1;
    }
    public int valeurRecolte(){
       
        if(this.groupe==null){
           return QuantiteRamassage();
        }
        else{
           return groupe.quantitéTotaleRamassage();
        }
       
    }
    public int valNouriture(){
        return 1;
    }

    public void nourrir(Coffre coffre){
       
    if(coffre.nourrir(valNouriture())==true){
        aMange=true;
    }
    else{
        if(groupe!= null){
            groupe.supprimer(this);
        }
    }
       
        
    }


}
