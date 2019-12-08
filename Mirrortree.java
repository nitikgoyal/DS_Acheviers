import java.util.*;
class Node
{
    int key;
    Node left,right;
    public Node(int item)
    {
        key=item;
        left=right=null;
    }      
}
public class Mirrortree
{
    static Node root;
    Mirrortree(int data)
    {
        root=new Node(data);
    }
    Mirrortree()
    {
        root=null;
    }
    public static boolean check(Node root)
    {
        return ismirror(root,root);
    }
    
   public static Boolean ismirror(Node tr1,Node tr2)
   {
       if(tr1==null && tr2==null)
       {
           return true;
       }
       else if(tr1!=null&&tr2!=null&& tr1.key==tr2.key)
       {
           return (ismirror(tr1.left,tr2.right) && ismirror(tr1.right, tr2.left)); 
       }
         return false;
    
   }
    
    
    public static void main(String args[])
    {
        Mirrortree bt=new Mirrortree();
//        bt.root = new Node(5); 
//        bt.root.left = new Node(7); 
//        bt.root.right = new Node(7); 
//        bt.root.left.left = new Node(9); 
//        bt.root.left.right = new Node(11); 
//        bt.root.right.left = new Node(9); 
//        bt.root.right.right = new Node(11); 
//          Boolean b=check(root);
     // System.out.println(b);
        
        
        
            bt.root=new Node(1);
            bt.root.left=new Node(2);
			bt.root.right=new Node(2);
			bt.root.left.left=new Node(3);
			bt.root.left.right=new Node(4);
			bt.root.right.left=new Node(4);
			bt.root.right.right=new Node(3);
            bt.root.left.left.left=new Node(5);
			bt.root.left.left.right=new Node(6);
			bt.root.left.right.left=new Node(7);
			bt.root.left.right.right=new Node(8);
			bt.root.right.left.left=new Node(8);
			bt.root.right.left.right=new Node(7);
			bt.root.right.right.left=new Node(6);
			bt.root.right.right.right=new Node(5);
        Boolean c=check(root);
      System.out.println(c);
        
        
    }
}