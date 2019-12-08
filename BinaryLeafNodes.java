public class BinaryLeafNodes 
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static Node root;
    void printLeafNodes(Node root)
    {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            System.out.print(root.data+" ");
        if (root.left != null)
            printLeafNodes(root.left);
        if (root.right != null)
            printLeafNodes(root.right);
    }

    public static void main(String[] args) {
        BinaryLeafNodes tree = new BinaryLeafNodes();
        root = new Node(100);
        root.left = new Node(99);
        root.right = new Node(98);
        root.left.left = new Node(97);
        root.left.right = new Node(96);
        root.right.left = new Node(95);
        root.right.right = new Node(94);
        tree.printLeafNodes(root);
    }
}