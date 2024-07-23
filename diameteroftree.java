
public class diameteroftree {
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
        //calculate height of tree
        public int heightofNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftNodes = heightofNodes(root.left);
            int rightNodes = heightofNodes(root.right);
            int myHeight=Math.max(leftNodes, rightNodes)+1;
            return myHeight;
        }

        //calculate diameter of tree
        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3= heightofNodes(root.left)+heightofNodes(root.right);
            return Math.max(diam3,Math.max(diam1,diam2));
        }


    }

    public static void main(String[] args) {
        int Nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);
        System.out.println("Diameter of tree is: " + tree.diameter(root));
    }
}
