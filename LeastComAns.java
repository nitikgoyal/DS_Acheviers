import java.util.*;
	public class LeastComAns 
	{
		static class Node
		{
			Node left,right;
			int data;
			Node(int data)
			{
				this.data=data;
				left=null;
				right=null;
			}
		}
		static Node root;
		Node findlca(int a,int b)
		{
			return lowest(root,a,b);
		}
		Node lowest(Node root,int a,int b)
		{
			if(root==null)
				return root;
			if(root.data==a||root.data==b)
				return root;
			Node lft=lowest(root.left,a,b);
			Node rht=lowest(root.right,a,b);
			if(lft!=null&&rht!=null)
				return root;
			return (lft!=null)?lft:rht;
		}
		
		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);
			LeastComAns lca=new LeastComAns();
			lca.root=new Node(1);
			lca.root.left=new Node(2);
			lca.root.right=new Node(3);
			lca.root.left.left=new Node(4);
			lca.root.left.right=new Node(5);
			lca.root.right.left=new Node(6);
			lca.root.right.right=new Node(7);
			System.out.println("Enter the any two nodes");
			int a=scan.nextInt();
			int b=scan.nextInt();
			Node nd=lca.lowest(lca.root,a,b);
			System.out.print(nd.data+" ");
		}
	}