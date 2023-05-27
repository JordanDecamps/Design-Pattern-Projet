package design.pattern.projet;

import java.util.ArrayList;

import javax.swing.*;

public class App extends JFrame {
    private PlateauGUI plateau;  // filed to store the PlateauGUI instance
    public App() {
        initGUI();
    }

    private void initGUI() {
        setTitle("Jeu de Plateau");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        plateau = new PlateauGUI(20);  // set the grid size to 20 x 20
        getContentPane().add(plateau);
    }

    public static void main(String[] args) {

        // show the gui 
        App app = new App();
        app.setVisible(true);

            // load image
        ImageIcon icon = new ImageIcon("image/Basic_red_dot.png");

    // set image to a specific button
        app.plateau.setImageAt(0, 0, icon);

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
        Unite unite1 = new Unite( 2, TypeUnite.BUCHERON);
        Unite unite2 = new Unite( 3, TypeUnite.MINEUR);
        unite1.outils.Recolter();
        unite2.outils.Recolter();
        ArrayList liste = new ArrayList<>();
        liste.add(unite1);
        liste.add(unite2);
        Groupe groupe = new Groupe(liste);
        System.out.println(groupe);

    }
}
