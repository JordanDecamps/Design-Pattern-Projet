package design.pattern.projet;

public final class OutilsFactory {

   private static OutilsFactory instance;
   
   private OutilsFactory() {};
   
   public static OutilsFactory getInstance() {
      if (instance == null) {
         instance = new OutilsFactory();
      }
      return instance;
   }

   public Outils getOutils(TypeUnite type) {	
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
