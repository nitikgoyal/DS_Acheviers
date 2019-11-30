import java.util.*;
public class sumoflists
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
    public static sumoflists insert(sumoflists li,int data)
    {
        Node newNode=new Node(data);
        newNode.next=null;
        if(li.head==null)
        {
            li.head=newNode;
        }
        else
        {
            Node last =li.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
        return li;
    }
    public static void display(sumoflists li)
    {
        Node temp=li.head;
        while(temp.next!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    
    public static sumoflists sumll(sumoflists li1,sumoflists li2)
    {
        int count=0;
    	 int count1=0;
    	 int sum1=0;
    	 int sum2=0;
    	 int total=0;
    	 Node current=li1.head;
    	 Node current1=li2.head;
    	 while(current!=null)
    	 {
    		 sum1=(int)(sum1+current.data*Math.pow(10,count));
    		 count++;
    		 current=current.next;
    	 }
    	 while(current1!=null)
    	 {
    		 sum2=(int)(sum2+current1.data*Math.pow(10,count1));
    		 count1++;
    		 current1=current1.next;
    	 }
    	 total=sum1+sum2;
//    	 return total;
        sumoflists li =new sumoflists();
        while(total!=0)
        {
            li.insert(li,(total%10));
            total=total/10;
        }
        return li;
        
    }
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        sumoflists li1=new sumoflists();
        sumoflists li2=new sumoflists();
        sumoflists li3=new sumoflists();
        System.out.println("Enter the  number of Elements in linked list 1");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            li1.insert(li1,scan.nextInt());
            
        }
        System.out.println("Enter the  number of Elements in linked list 2");
        int n2=scan.nextInt();
        for(int i=0;i<n2;i++)
        {
            li2.insert(li2,scan.nextInt());
            
        }
        li3=sumll(li1,li2);
        display(li3);
        
    }
    
}