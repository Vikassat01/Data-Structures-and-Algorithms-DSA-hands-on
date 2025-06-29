package BST.gui;

import BST.Node;
import BST.bst;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    private final bst tree;

    public CustomPanel(bst tree) {
        this.tree = tree;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g, tree.root, getWidth() / 2, 40, getWidth() / 4);
    }

    private void drawTree(Graphics g, Node node, int x, int y, int xOffset) {
        if (node == null) return;

        g.setColor(Color.BLUE);
        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawString(Integer.toString(node.data), x - 6, y + 5);

        if (node.left != null) {
            int childX = x - xOffset;
            int childY = y + 60;
            g.setColor(Color.BLACK);
            g.drawLine(x, y, childX, childY);
            drawTree(g, node.left, childX, childY, xOffset / 2);
        }

        if (node.right != null) {
            int childX = x + xOffset;
            int childY = y + 60;
            g.setColor(Color.RED);
            g.drawLine(x, y, childX, childY);
            drawTree(g, node.right, childX, childY, xOffset / 2);
        }
    }
}
