import java.util.*;
class pairArraysum
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array1");
        int n=scan.nextInt();
        System.out.println("Enter size of array2");
        int m=scan.nextInt();
        System.out.println("Enter the sum");
        int sum=scan.nextInt();
        System.out.println("Enter the array1 elements");
        int[] a1=new int[n];
        int[] a2=new int[m];
        for(int i=0;i<n;i++)
        {
          a1[i]=scan.nextInt();  
        }
        System.out.println("Enter the array2 elements");
        for(int i=0;i<m;i++)
        {
            a2[i]=scan.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a1[i]+a2[j]==sum)
                {
                    System.out.println(a1[i]+" "+a2[j]);
                }
            }
        }
    }
}