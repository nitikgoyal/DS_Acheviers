import java.util.*;

public class removeduplicate
{
    public static int rd(int a[],int n)
    {
        if(n==0 ||n==1)
            return n;
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
                temp[j++]=a[i];
            
        }
        temp[j++]=a[n-1];
        for(int i=0;i<j;i++)
        {
            a[i]=temp[i];
        }
        return j;
    }
    
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=scan.nextInt(); 
        }
        n=rd(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
            
    }
}