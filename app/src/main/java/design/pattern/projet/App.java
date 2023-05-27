package design.pattern.projet;

import java.util.ArrayList;

import javax.swing.*;

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
        // test de la classe GUI
        ImageIcon icon = new ImageIcon("image/Basic_red_dot.png");
        GlobalState.plateau.setImageAt(0, 0, icon);
        Unite unite1 = new Unite( 2, TypeUnite.BUCHERON);
        Unite unite2 = new Unite( 3, TypeUnite.MINEUR);
        Unite Paysan = new Unite( 1, TypeUnite.PAYSAN);
        unite1.outils.Recolter();
        unite2.outils.Recolter();
        Paysan.outils.Recolter();
        ArrayList liste = new ArrayList<>();
        liste.add(unite1);
        liste.add(unite2);
        liste.add(Paysan);

        Groupe groupe = new Groupe(liste);
        System.out.println(groupe);

        Coffre coffre = new Coffre();
        System.out.println(coffre);

    }
}
