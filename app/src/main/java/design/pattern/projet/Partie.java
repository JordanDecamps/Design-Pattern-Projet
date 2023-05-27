package design.pattern.projet;

import javax.swing.JFrame;

public class Partie extends JFrame {
  public Grille grille;

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
    this.grille = new Grille(x, y);
    this.coffre= new Coffre();
}

public void initPartie(){
  this.grille.initGrille();
}
public String toString(){
  String res="La partie:\n";
  res+=this.grille.toString();
  res+="Le coffre\n";
  res+=this.coffre.toString();
  return res;
}

}