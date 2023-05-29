package design.pattern.projet;

import java.util.ArrayList;

public class Groupe {
    public String nom;
    public ArrayList<Unite> listeUnite;
    public int x;
    public int y;

    public Groupe(ArrayList<Unite> listeUnite, String nom) {
        
        this.listeUnite = listeUnite;
        this.nom=nom;
        this.x=this.listeUnite.get(0).x;
        this.y=this.listeUnite.get(0).y;


    }

    @Override
    public String toString() {
       
        return "Groupe [listeUnite=" + listeUnite + "]";
    }

    public void supprimerTout(){
        for(Unite unite: listeUnite){
            unite.groupe=null;
        }
        this.listeUnite=null;
    }
    public void supprimer(Unite unite){
        this.listeUnite.remove(unite);
        unite.groupe=null;
    }
     
    public int quantitéTotaleRamassage(){
        int tot=0;
        for(Unite unite: listeUnite){
           tot+=unite.QuantiteRamassage();
        }
      
       
       return (int) Math.round((1 + ((double)(this.listeUnite.size() - 1) / 10)) * tot);
    }

    public void AccomplisPourTous(){
        for(Unite unite: listeUnite){
            unite.aTravaille=true;
        }
    }
    

    
}
