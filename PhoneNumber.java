import java.util.*;
class PhoneNumber
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Names:");
        int n=scan.nextInt();
        System.out.println("Enter the Name and Phone number:");
        for(int i=0;i<n;i++)
        {
            String str=scan.next();
            int num=scan.nextInt();
            hm.put(str,num);
        }
        System.out.println("Enter the number of data u want:");
        int m=scan.nextInt();
        for(int i=0;i<m;i++)
        {
            String s1=scan.next();
            if(hm.containsKey(s1))
            {
                System.out.println(s1+ " = " +hm.get(s1));
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
}