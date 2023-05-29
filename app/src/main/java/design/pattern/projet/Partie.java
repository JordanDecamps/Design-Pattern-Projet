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
      if(input.equals("G")){
          gestionGroupe();
      }
      poserQuestions();
      input = scanner.nextLine();

    }
    System.out.println("Vous avez quitté");
}

public void poserQuestions(){
  System.out.println("Voici la grille:");
  System.out.println(this.grille);
  System.out.println("Saisir B pour gérer les batiments");
  System.out.println("Saisir G pour gérer les groupes");
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


public void creerGroupe(){
    ArrayList<Unite> listeUnites= new ArrayList<Unite>();
    System.out.println("Rentrer le nom du groupe");
    Scanner scanner = new Scanner(System.in);
    String name=scanner.nextLine();
    String test = "";
    while( !test.equals("stop")){
      
    System.out.println("Donner la coordonnée x de la première case ou se trouve l'unité que vous voulez mettre dans le groupe");
    int x=scanner.nextInt();
    System.out.println("Donner la coordonnée y de la première case ou se trouve l'unité que vous voulez mettre dans le groupe");
    int y=scanner.nextInt();
    int index=0;
    for(Unite unite : this.grille.grille[x][y].listeUnitesCase){
      System.out.println(index+" :"+ unite+ "\n");
      index++;
    } 
    System.out.println("entrez le numero correspondant");
    int UnitePickIndex=scanner.nextInt();
    if(this.grille.grille[x][y].listeUnitesCase.get(UnitePickIndex).groupe == null){
      listeUnites.add(this.grille.grille[x][y].listeUnitesCase.get(UnitePickIndex));
    }
    else{
      System.out.println("il a deja un groupe");
    }
    System.out.println("si vous souhaité arreter de rajouter taper stop sinon tou autre texte");
    test=scanner.nextLine();
    test=scanner.nextLine();
    }
    if(listeUnites.size()>=2){
      Groupe groupe=new Groupe(listeUnites, name);
      for (Unite unite: listeUnites){
        unite.groupe=groupe;
        this.grille.deplacerUnite(unite, groupe.x, groupe.y);
       
    }
    }
    else{
      System.out.println("donnée inutilisable");
    }



}

public void gestionGroupe(){
  System.out.println("Rentrer C pour créer et S pour supprimer");
  Scanner scanner = new Scanner(System.in);
  String rep=scanner.nextLine();
  if(rep.equals("C")){
    creerGroupe();

  }
  else{
    this.grille.selectionGroupeexistant();
  }
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