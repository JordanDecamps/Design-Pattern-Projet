package design.pattern.projet;

public class Grille {

    public Case[][] grille;

    public Grille(int x, int y) {
        this.grille = new Case[x][y];
        for (int index = 0; index < x; index++) {
            for (int index2 = 0; index < y; index++) {
    
                this.grille[index][index2]= new Case();
            }
        }
    }

 

    


    
}
