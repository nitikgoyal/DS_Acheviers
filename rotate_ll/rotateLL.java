
import java.util.Scanner;

public class rotateLL {
	//Node Class
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	public static void insert(int key) {
		Node temp=head;
		if(temp==null) {
			head=new Node(key);
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newNode=new Node(key);
		temp.next=newNode;
		newNode.next=null;
	}
	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void rotate(rotateLL li, int k) {
		
		if(k==0) 
        {
			System.out.print("Enter value greater than 0");
			return;
		}
		Node current = head;
		
		int count=1;
		while(count<k && current!=null) {
			current=current.next;
			count++;
		}
		if(current==null) {
			return;
		}
		Node temp=current;

		while(current.next!=null) {
			current=current.next;
		}
		current.next=head;
		head=temp.next;
		temp.next=null;
	}
	public static void main(String args[]) {
		rotateLL li=new rotateLL();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the LinkedList:- ");
		int n=scan.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) 
        {
			int a=scan.nextInt();
			insert(a);
		}
		System.out.println("Enter the value of k:");
		int k=scan.nextInt();
		System.out.println("LinkedList before rotation:");
		display();
		rotate(li, k);
		System.out.println("LinkedList after rotation:");
        System.out.println("");
		display();
	}
}