package design.pattern.projet;

public class OutilsFactory {

    
   public Outils getOutils(TypeUnite type){	
    if(type == TypeUnite.BUCHERON){
       return new Hache();
    }
    if (type == TypeUnite.PAYSAN){
        return new Houe();
    }
    if(type == TypeUnite.MINEUR){
        return new Pioche();
    }
    
    return null;
 }

    
}
