package design.pattern.projet;

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

        PlateauGUI plateau = new PlateauGUI(10);
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
    }
}
