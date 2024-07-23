
public class countnodes {
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

        // Corrected method to count the nodes
        public int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);
            return leftNodes + rightNodes + 1;
        }
    }

    public static void main(String[] args) {
        int Nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);
        System.out.println("Number of nodes in the tree: " + tree.countNodes(root));
    }
}
