import java.util.*;

class Addwithoutop
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        while(n1>0)
        {
            n1--;
            n2++;
        }
        System.out.println("Sum is:"+n2);
    }
}