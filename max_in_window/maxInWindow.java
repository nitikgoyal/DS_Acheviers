import java.util.*;
class maxInWindow
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of Array And window Size");
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] a=new int[n];
         System.out.println("Enter the eleents");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Outout:-");
        for(int i=0;i<=n-k;i++)
        {
            int max=a[i];
            for(int j=0;j<k;j++)
            {
                if(max<a[i+j])
                {
                    max=a[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
}