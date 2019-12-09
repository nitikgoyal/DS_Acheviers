import java.util.*;
public class InsertAtmid
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    public static InsertAtmid insert(InsertAtmid li,int data)
    {
        Node newNode=new Node(data);
        if(li.head==null)
            li.head=newNode;
        else
        {
            Node last=li.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
        return li;
    }
    
    public static void display(InsertAtmid li)
    {
        Node temp=li.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    
    public static InsertAtmid insertmid(InsertAtmid li,int m,int n)
    {
        int list;
        Node newNode=new Node(m);
        if(n%2==0)
        {
           list=n/2; 
        }
        else 
        {
            list=(n/2)+1;
        }
        Node temp=li.head;
        int i=0;
        while(i<list-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return li;
        
    }
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        InsertAtmid li=new InsertAtmid();
        System.out.println("Enter the number of elements in linked list");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int ele=scan.nextInt();
            li=insert(li,ele);
        }
        //display(li);
        System.out.println("Enter elelmt to be inserted at mid ..");
        int m=scan.nextInt();
        li=insertmid(li,m,n);
        display(li);
    }
}