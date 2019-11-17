import java.util.*;
	public class removeduplicate_inLL 
    {
		Node head;
		public static class Node
		{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
                next=null;
			}
			
		}
		public static removeduplicate_inLL insert(removeduplicate_inLL li,int data)
		{
			Node newNode=new Node(data);
			newNode.next=null;
			int flag=0;
			if(li.head == null)
			li.head=newNode;
			else
			{
				Node temp=li.head;
				while(temp!=null)
				{
					if(temp.data==data)
					{
						flag=1;
						break;
					}
					temp=temp.next;
				}
				if(flag==0)
				{
				Node last=li.head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;
				}
			}
			return li;
		}
		public static void display(removeduplicate_inLL li)
		{
			Node temp=li.head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		public static void main(String[] args) {
			
			removeduplicate_inLL li=new removeduplicate_inLL();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of elements u want in linked list:");
			int n=scan.nextInt();
			System.out.println("Enter the elements:");
			for(int i=0;i<n;i++)
			{
				int num=scan.nextInt();
				insert(li, num);
			}
			System.out.println("The linked list after removing duplicate elements:");
			display(li);
	
		}
	}