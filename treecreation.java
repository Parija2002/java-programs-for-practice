
public class treecreation {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(Nodes[idx]);
            newnode.left = buildTree(Nodes);
            newnode.right = buildTree(Nodes);
            return newnode;
        }
    }

    public static void main(String args[]) {
        int Nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);
        
        // Additional code to verify the tree creation
        printTree(root);
    }
    
    // Helper method to print the tree in order for verification
    public static void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }
}
