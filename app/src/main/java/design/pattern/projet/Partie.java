package design.pattern.projet;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;

public class Partie extends JFrame {
  public Grille grille;

  public Coffre coffre;

  public Map<TypeUnite, ArrayList <BatimentProduction>> listeBatimentsProduction;
  public Map<TypeUnite, ArrayList <BatimentCreationOutils>> listeBatimentsCreationOutils;

  
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
    this.listeBatimentsProduction = new HashMap<>();
    this.listeBatimentsCreationOutils = new HashMap<>();
    for(TypeUnite type : TypeUnite.values()){
      this.listeBatimentsProduction.put(type,new ArrayList<BatimentProduction>());
      this.listeBatimentsCreationOutils.put(type,new ArrayList<BatimentCreationOutils>());
  }
}

public void initPartie(){
  this.grille.initGrille();
}

public void tour(){
    /*System.out.println(this.grille);
    this.grille.tour(this.coffre);*/
    poserQuestions();
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    while(!input.equals("Q")){
      if(input.equals("B")){

        gestionBatiment();
      }
      if(input.equals("T")){
        this.grille.tour(coffre);
      }
      poserQuestions();
      input = scanner.nextLine();

    }
    System.out.println("Vous avez quitté");
}

public void poserQuestions(){
  System.out.println("Voici la grille:");
  System.out.println(this);
  System.out.println("Saisir B pour gérer les batiments");
  System.out.println("Saisir T pour lancer un tour (nourrir + récolte)");
  System.out.println("Saisir Q pour sortir");
}

public void gestionBatiment(){
  Scanner scanner = new Scanner(System.in);
  String input;
  System.out.println("saisir C pour voir les baitments de Creation et P pour ceux de production");
  input = scanner.nextLine();
  if(input.equals("C")){
    gestionBatimentsCrea();
  }
  if(input.equals("P")){
    gestionBatimentsProd();

  }
  

}

public void gestionBatimentsProd(){
  Scanner scanner = new Scanner(System.in);
  String input;
  System.out.println(affichageBatimentsProduction());
  System.out.println("saisir A pour ajouter et D pour détruire");
  input = scanner.nextLine();
  System.out.println("saisir le nom du type");
  String input2= scanner.nextLine();
  TypeUnite typeunite;
  try {
    typeunite=TypeUnite.valueOf(input2);
  } catch (Exception e) {
    typeunite=null;
  }
  if(typeunite!=null){
  if(input.equals("A")){
    int test=1;
    for(Ressources res : Ressources.values()){
    if (this.coffre.ressources.get(res) < 5){
      test=0;   
    }
  }
 
    if(test==1){
      BatimentProduction bat=BatimentProductionFactory.getInstance().getBatimentsProduction(typeunite);
      for(Ressources res : Ressources.values()){
        this.coffre.ressources.put(res,this.coffre.ressources.get(res)-5);
      }
      this.listeBatimentsProduction.get(typeunite).add(bat);
   
    }
    else{
      System.out.println("Vous n'avez pas les moyens");
    }
    
 
  }
  
  else if(input.equals("D")){
    this.listeBatimentsProduction.get(typeunite).remove(0);
    
 
}
else{
  System.out.println("commande invalide");
}

}
else{
  System.out.println("type invalide");
}

}
public void gestionBatimentsCrea(){
  Scanner scanner = new Scanner(System.in);
  String input;
  System.out.println(affichageBatimentsCreationOutils());
  System.out.println("saisir A pour ajouter et D pour détruire");
  input = scanner.nextLine();
  System.out.println("saisir le nom du type");
  String input2= scanner.nextLine();
  TypeUnite typeunite;
  try {
    typeunite=TypeUnite.valueOf(input2);
  } catch (Exception e) {
    typeunite=null;
  }
  if(typeunite!=null){
  if(input.equals("A")){
    int test=1;
    for(Ressources res : Ressources.values()){
    if (this.coffre.ressources.get(res) < 5){
      test=0;   
    }
  }
    if(test==1){
      BatimentCreationOutils bat=BatimentCreationOutilsFactory.getInstance().getBatimentsCreationOutils(typeunite);
      for(Ressources res : Ressources.values()){
        this.coffre.ressources.put(res,this.coffre.ressources.get(res)-5);
      }
      this.listeBatimentsCreationOutils.get(typeunite).add(bat);
   
    }
    else{
      System.out.println("Vous n'avez pas les moyens");
    }
    
 
    }
  
  else if(input.equals("D")){
    this.listeBatimentsCreationOutils.get(typeunite).remove(0);
    
  }
  else{
    System.out.println("commande invalide");
  }
  
}
else{
  System.out.println("type invalide");
}

}

public String affichageBatimentsProduction(){
  String res= "";
  for(Map.Entry<TypeUnite, ArrayList <BatimentProduction>> bat : this.listeBatimentsProduction.entrySet()){
   
    res+= bat.getKey().toString()+ ": " +bat.getValue().size()+"\n";
    
  }
  return res;
}
public String affichageBatimentsCreationOutils(){
  String res= "";
  for(Map.Entry<TypeUnite, ArrayList <BatimentCreationOutils>> bat : this.listeBatimentsCreationOutils.entrySet()){
   
    res+= bat.getKey().toString()+ ": " +bat.getValue().size()+"\n";
    
  }
  return res;
}

public String toString(){
  String res="La partie:\n";
  res+=this.grille.toString();
  res+="Le coffre\n";
  res+=this.coffre.toString();
  res+="\nBatiments Production\n";
  res+= affichageBatimentsProduction();
  res+="Batiments Creation d'outils\n";
  res+= affichageBatimentsCreationOutils();

  return res;
}

}