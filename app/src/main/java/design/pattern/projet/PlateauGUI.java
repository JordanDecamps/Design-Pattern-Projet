package design.pattern.projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlateauGUI extends JPanel {
    private int gridSize;

    public PlateauGUI(int gridSize) {
        this.gridSize = gridSize;
        initGUI();
    }

    private void initGUI() {
        setLayout(new GridLayout(gridSize, gridSize));

        for (int i = 0; i < gridSize * gridSize; i++) {
            JButton button = new JButton();
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Cellule sélectionnée");
                }
            });

            button.setBackground(Color.WHITE);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(button);
        }
    }
    
}
