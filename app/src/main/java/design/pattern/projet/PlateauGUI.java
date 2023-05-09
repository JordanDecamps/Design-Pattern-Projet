package design.pattern.projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlateauGUI extends JPanel {
    private int gridSize;
    private JButton[][] buttons;

    public PlateauGUI(int gridSize) {
        this.gridSize = gridSize;
        buttons = new JButton[gridSize][gridSize];
        initGUI();
    }

    private void initGUI() {
        setLayout(new GridLayout(gridSize, gridSize));

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                JButton button = new JButton();
                button.setActionCommand(i + "," + j); // Ajouter les coordonnées x, y au bouton
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] coordinates = e.getActionCommand().split(",");
                        int x = Integer.parseInt(coordinates[0]);
                        int y = Integer.parseInt(coordinates[1]);
                        System.out.println("Cellule sélectionnée : (" + x + ", " + y + ")");
                    }
                });

                button.setBackground(Color.WHITE);
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                add(button);
                buttons[i][j] = button;
            }
        }
    }

    public void setImageAt(int x, int y, ImageIcon icon) {
        if (x >= 0 && x < gridSize && y >= 0 && y < gridSize) {
            buttons[x][y].setIcon(icon);
        } else {
            throw new IllegalArgumentException("Les coordonnées x et y doivent être comprises entre 0 et " + (gridSize - 1));
        }
    }
}
