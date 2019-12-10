import java.util.*;
class spiralmatrix
{
    static void spiralprint(int a[][],int r,int c)
    {
        int k=0,l=0;
        while(k<r && l<c)
        {
            for(int i=l;i<c;i++)
                System.out.print(a[k][i]+" ");
            k++;
            
            for(int i=k;i<r;i++)
            System.out.print(a[i][c-1]+" ");
            c--;       
            if(k<r)
            {
                for(int i=c-1;i>=l;i--)
                    System.out.print(a[r-1][i]+" ");
                r--;
            }
            if(l<c)
            {
                for(int i=r-1;i>=k;i--)
                    System.out.print(a[i][l]+" ");
                l++;
            }
        }
        
    }
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no. of rows matrix");
        int r=scan.nextInt();
        System.out.println("Enter the no.of columns of matrix");
        int c=scan.nextInt();
        int[][] a=new int[r][c]; 
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               a[i][j]=scan.nextInt(); 
            }
        }
        spiralprint(a,r,c);
    }
}