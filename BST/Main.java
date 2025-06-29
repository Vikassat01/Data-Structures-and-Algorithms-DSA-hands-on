package BST;

import BST.gui.CustomPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        bst tree = new bst();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(80);

        JFrame frame = new JFrame("BST Visualizer");
        CustomPanel panel = new CustomPanel(tree);
        JTextField inputField = new JTextField(5);
        JButton insertButton = new JButton("Insert");
        JButton deleteButton = new JButton("Delete");

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Enter Number:"));
        controlPanel.add(inputField);
        controlPanel.add(insertButton);
        controlPanel.add(deleteButton);

        insertButton.addActionListener(e -> {
            try {
                int value = Integer.parseInt(inputField.getText());
                tree.insert(value);
                inputField.setText("");
                panel.repaint();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
            }
        });

        deleteButton.addActionListener(e -> {
            try {
                int value = Integer.parseInt(inputField.getText());
                tree.delete(value);
                inputField.setText("");
                panel.repaint();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
