package design.pattern.projet;

import java.util.List;

public class Partie {
    public  List[][] grille;
    
    public Coffre coffre;
    /*public Inventaire inventaire;
    public Partie(List[][] grille, Coffre coffre, Inventaire inventaire) {
        this.grille = grille;
        this.coffre = coffre;
        this.inventaire = inventaire;
    }
    
    */
    public Partie(int x , int y){
       this.grille = new List[x][y];
       this.coffre= new Coffre();
       


    }
    
    

}   
