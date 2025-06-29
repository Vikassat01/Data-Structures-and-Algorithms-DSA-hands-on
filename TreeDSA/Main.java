package TreeDSA;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    Node root = null;

    public Main(Node root) {
        this.root = root;
    }

    public Main() {
        this.root = null;
    }

    // Preorder Traversal (Root -> Left -> Right)
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");
    }

    public static void main(String[] args) {
        // Create binary tree manually
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Traversals
        System.out.println("Preorder Traversal:");
        tree.preOrder(tree.root);

        System.out.println("\nInorder Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postOrder(tree.root);
    }
}
