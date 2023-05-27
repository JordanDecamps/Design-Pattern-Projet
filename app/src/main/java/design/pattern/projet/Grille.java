package design.pattern.projet;
import java.util.Random;

public class Grille {

    public Case[][] grille;
    public int x;
    public int y;

    public Grille(int x, int y) {
        this.x=x;
        this.y=y;
        this.grille = new Case[x][y];
        for (int index = 0; index < x; index++) {
            for (int index2 = 0; index2 < y; index2++) {
    
                this.grille[index][index2]= new Case();
            }
        }
    }

    public void initGrille(){
        //repartir pour chaque type de ressources 3 fois 50 resources sur des cases tirées au hasard dans la grille
        initressources();
        initunités();
       
    }
    public void initressources(){
         //repartir pour chaque type de ressources 3 fois 50 resources sur des cases tirées au hasard dans la grille
        Random random = new Random();
        for(Ressources res : Ressources.values()){
            for (int i = 0; i < 3; i++) {
                int xrand=random.nextInt(x);
                int yrand= random.nextInt(y);
                this.grille[xrand][yrand].listeRessourcesCase.put(res, this.grille[xrand][yrand].listeRessourcesCase.get(res)+50);
            }
        }
    }
    public void initunités(){
        // répartir 15 unités de chaque type sur la grille
       
        for(TypeUnite type : TypeUnite.values()){
            for (int i = 0; i < 30; i++) {
                ajouterUnite(type);
            }
        }
       
    }

    public String toString(){
        String res="La grille:\n";
        for (int index = 0; index < x; index++) {
            for (int index2 = 0; index2 < y; index2++) {
                res+="La case: ("+index+","+index2+"): \n";
                res+=this.grille[index][index2].toString();
               
            }
        }
        return res;
    }

    public void ajouterUnite(TypeUnite type){
        Random random = new Random();
        this.grille[random.nextInt(x)][random.nextInt(y)].listeUnitesCase.add(new Unite(1, type));
    }

    public void tour(Coffre coffre){
        for (int index = 0; index < x; index++) {
            for (int index2 = 0; index2 < y; index2++) {
                for (Unite unite : this.grille[index][index2].listeUnitesCase) {
                    unite.outils.Recolter(coffre, this.grille[index][index2]);
                }
            }
        }
    }
 

    


    
}
