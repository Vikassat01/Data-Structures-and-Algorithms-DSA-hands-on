package TreeDSA;

public class BinaryTree {
    Node root = null;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

    // Preorder Traversal (DFS) -> Root -> Left -> Right
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Binary tree operation


    //traversal--->>>
    //Preorder Traversal // DFS(Dapth first search)--->>>  (Root--->>>Left--->>>Right)
    //inorder traverls--->>>>>(Left--->>>Root--->>>Right)
    //Postorder Traversal // (Left--->>>Right--->>>Root)
    //BFS//Level order-Travarsal // (1st root then left to right Leve1,level2........levelN)

    // Inorder Traversal -> Left -> Root -> Right
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);
    }

    // Postorder Traversal -> Left -> Right -> Root
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");
    }
}
