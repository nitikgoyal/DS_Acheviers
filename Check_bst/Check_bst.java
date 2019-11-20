import java.util.Scanner;

class Node{
	int key;
	Node left,right;
	Node(int k){
		key=k;
		left=right=null;
	}
}
public class Check_bst
{
	static Node root;
	Check_bst()
    {
		root=null;
	}
	static void inOrder(Node root)
    {
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
		return;
	}
	static boolean Check_bstree(Node root){
		if(root.left!=null || root.right!=null){
			if(root.key<root.left.key)
            {
				return false;
			}
			else if(root.key>root.right.key)
            {
				return false;
			}
			else{
				Check_bstree(root.left);
				Check_bstree(root.right);
			}
		}
		return true;
	}
	public static void main(String[] args){
		Check_bst tree=new Check_bst();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		System.out.println("Inorder Traversal of Binary Tree :-");
		inOrder(root);
		if(Check_bstree(root)){
			System.out.println("It is Binary tree");
		}
		else{
			System.out.println("It is not Binary tree");
		}
		
	}
}