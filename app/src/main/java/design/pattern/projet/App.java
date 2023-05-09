package design.pattern.projet;

import java.util.ArrayList;

import javax.swing.*;

public class App extends JFrame {
    public App() {
        initGUI();
    }

    private void initGUI() {
        setTitle("Jeu de Plateau");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        PlateauGUI plateau = new PlateauGUI(20);
        getContentPane().add(plateau);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App app = new App();
                app.setVisible(true);
            }
        });
        /*Unite unite1 = new Unite( 2, TypeUnite.BUCHERON);
        Unite unite2 = new Unite( 3, TypeUnite.MINEUR);
        ArrayList liste = new ArrayList<>();
        liste.add(unite1);
        liste.add(unite2);
        Groupe groupe = new Groupe(liste);
        System.out.println(groupe);*/

    }
}
