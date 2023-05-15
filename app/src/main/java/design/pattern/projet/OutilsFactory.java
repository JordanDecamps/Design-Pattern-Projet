package design.pattern.projet;

public class OutilsFactory {

    
   public Outils getOutils(String outils){	
    if(outils.equals("HACHE")){
       return new Hache();
    }
    
    return null;
 }

    
}
