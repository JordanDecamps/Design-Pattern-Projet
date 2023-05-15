package design.pattern.projet;

public class OutilsFactory {

    
   public Outils getOutils(String outils){	
    if(outils.equals("HACHE")){
       return new Hache();
    }
    if (outils.equals("HOUE")){
        return new Houe();
    }
    if(outils.equals("PIOCHE")){
        return new Pioche();
    }
    
    return null;
 }

    
}
