import java.util.Stack;
import java.util.Scanner;
import java.util.LinkedList;
class QueueUsingStack
{
    static Stack<Integer> s1=new Stack<Integer>();
    static Stack<Integer> s2=new Stack<Integer>();
     
    static void enqueue(int x)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
            
        }
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    
    static int deueue()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        int x=s1.peek();
        s1.pop();
        return x;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        QueueUsingStack qs=new QueueUsingStack();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            qs.enqueue(scan.nextInt());
        }
        System.out.println(qs.deueue());
       
    }
}