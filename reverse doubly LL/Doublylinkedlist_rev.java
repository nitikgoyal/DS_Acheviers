import java.util.Scanner;
public class Doublylinkedlist_rev {
	Node head;
	Node tail;
	public static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data=d;
		}
	}
	public static Doublylinkedlist_rev insert(Doublylinkedlist_rev li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		newNode.prev=null;
		if(li.head == null)
		{
		li.head=newNode;
		newNode.prev=null;
		li.tail=newNode;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			newNode.prev=last;
			last.next=newNode;
			li.tail=newNode;
		}
		return li;
	}
	public static void reverse(Doublylinkedlist_rev li)
	{
		if(li.head==null)
		{
			System.out.println("Nothing to display");
		}
		else
		{
		Node temp=li.tail;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Doublylinkedlist_rev li=new Doublylinkedlist_rev();
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			insert(li,sc.nextInt());
		}
		System.out.println("The doubly linked list in reverse is:");
		reverse(li);
	}
}