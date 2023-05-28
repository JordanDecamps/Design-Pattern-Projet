package design.pattern.projet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App extends JFrame {
    public static void main(String[] args) {


       // set 
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App app = new App();
                app.setVisible(true);
            }
        });*/
        /*OutilsFactory outilsFactory = new OutilsFactory();
        Outils mahache= outilsFactory.getOutils("HACHE");
        mahache.Recolter();
        Outils mahoue= outilsFactory.getOutils("HOUE");
        mahoue.Recolter();
        Outils mapioche= outilsFactory.getOutils("PIOCHE");
        mapioche.Recolter();*/


        Partie partie= new Partie(3,4);
        //Grille grille= new Grille(3,4);
         //test de la classe GUI
        ImageIcon icon = new ImageIcon("image/Basic_red_dot.png");
        GlobalState.plateau.setImageAt(0, 0, icon);

       
        /*Unite unite1 = new Unite( 2, TypeUnite.BUCHERON);
        Unite unite2 = new Unite( 3, TypeUnite.MINEUR);
        unite1.outils.Recolter();
        unite2.outils.Recolter();
        ArrayList liste = new ArrayList<>();
        liste.add(unite1);
        liste.add(unite2);
        Groupe groupe = new Groupe(liste);
        System.out.println(groupe);*/
        partie.initPartie();
        //System.out.println(partie);
        partie.tour();
        //System.out.println(partie);

    }
}
