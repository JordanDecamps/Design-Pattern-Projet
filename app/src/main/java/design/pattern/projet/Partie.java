package design.pattern.projet;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Partie extends JFrame {
  public List[][] grille;

  public Coffre coffre;
  /*public Inventaire inventaire;
  public Partie(List[][] grille, Coffre coffre, Inventaire inventaire) {
      this.grille = grille;
      this.coffre = coffre;
      this.inventaire = inventaire;
  }
  
  */

  private void initGUI(int x, int y) {
    setTitle("Jeu de Plateau");
    setSize(800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    GlobalState.plateau = new PlateauGUI(x, y);
    getContentPane().add(GlobalState.plateau);
    setVisible(true); // afficher la fenetre

  }
  public Partie(int x , int y){
    initGUI(x,y); // initialisation de la fenetre
    this.grille = new List[x][y];
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            this.grille[i][j] = new ArrayList<Unite>();  // Chaque élément du tableau est une ArrayList d'objets Unite
        }
    }
    this.coffre= new Coffre();
}

}