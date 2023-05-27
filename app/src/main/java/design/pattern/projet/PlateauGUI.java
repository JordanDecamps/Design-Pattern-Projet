package design.pattern.projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlateauGUI extends JPanel {
    private int gridHeight, gridWidth;
    private JButton[][] buttons;

    public PlateauGUI(int gridHeight, int gridWidth) {
        this.gridHeight = gridHeight;
        this.gridWidth = gridWidth;
        buttons = new JButton[gridHeight][gridWidth];
        initGUI();
    }

    private void initGUI() {
        setLayout(new GridLayout(gridHeight, gridWidth));

        for (int i = 0; i < gridHeight; i++) {
            for (int j = 0; j < gridWidth; j++) {
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
        if (x >= 0 && x < gridHeight && y >= 0 && y < gridWidth) {
            buttons[x][y].setIcon(icon);
        } else {
            throw new IllegalArgumentException("Les coordonnées x et y doivent être comprises entre 0 et " + (gridHeight - 1) + " pour x et " + (gridWidth - 1) + " pour y.");
        }
    }
}