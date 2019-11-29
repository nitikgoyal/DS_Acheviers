class Node
{
    int data;
    Node left,right;
    public Node(int item)
    {
        data=item;
        left=right=null;
    }
}
class leftviewbt
{
    Node root;
    void printleftview()
    {
        printlv(root,1);
    }
    static int lvl=0;
    void printlv(Node root,int n)
    {
        if(root==null)
            return;
        if(lvl<n)
        {
            System.out.println(root.data + " ");
            lvl=n;
        }
        
        printlv(root.left,n+1);
        printlv(root.right,n+1);
    }
    
//        public  static int height(Node root)
//       { 
//         if(root == null)
//             return -1;
//         return 1+Math.max(height(root.left),height(root.right));
//        }
    
    public static void main(String args[])
    {
        leftviewbt tr =new leftviewbt();
        tr.root=new Node(1);
        tr.root.left=new Node(2);
        tr.root.right=new Node(3);
        
        tr.root.left.left=new Node(4);
        tr.root.left.right = new Node(5);
        tr.root.right.right=new Node(6);
        tr.root.right.right.left = new Node(7);
        tr.root.right.right.left.right = new Node(8);
        
        tr.printleftview();
        
        
    }
}