import java.util.Scanner;

public class checkpallindrom
{
    static Node head;
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

	public void insert(int d)
	{
		Node n=new Node(d);
		n.next=null;

		if(head==null)
		{
			head=n;
		}
		else
		{
			Node last;
			last=head;
			while(last.next!=null)
			{
				last=last.next;

			}
			last.next=n;
		}
	}
	public void checkPalindrome()
	{
		int a=0;
		int rev=0;
		int b=1;
		Node temp=head;
		while(temp!=null)
		{
			a=a*10+temp.data;
			rev=rev+temp.data*b;
			b*=10;
			temp=temp.next;

		}
		if(a==rev)
		{
			System.out.println("List is Pallindrome");
		}
		else
			System.out.println("List is not Pallindrome");


	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	checkpallindrom li =new checkpallindrom();
	System.out.println("Enter the number of elements:");
	int n=sc.nextInt();
	System.out.println("Enter elements:");
	for(int i=0;i<n;i++)
	{
		int elem=sc.nextInt();
		li.insert(elem);
	}
      li.checkPalindrome();
	}
}