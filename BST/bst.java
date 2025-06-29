package BST;

public class bst {
    public Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insertRec(root.left, key);
        else if (key > root.data) root.right = insertRec(root.right, key);
        return root;
    }

    public Node delete(int key) {
        root = deleteRec(root, key);
        return root;
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) root.left = deleteRec(root.left, key);
        else if (key > root.data) root.right = deleteRec(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public boolean search(int key) {
        return searchRec(root, key) != null;
    }

    private Node searchRec(Node root, int key) {
        if (root == null || root.data == key) return root;
        if (key < root.data) return searchRec(root.left, key);
        return searchRec(root.right, key);
    }
}
