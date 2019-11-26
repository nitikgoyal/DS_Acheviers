import java.util.Scanner;
class removeduplicatech
{
      public static void main(String args[])
      {
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter the String");
          String s=scan.next();
          String str="";
          for(int i=0;i<s.length()-1;i++)
          {
              if(i==0)
              {
                  if(s.charAt(i) != s.charAt(i+1))
                  {
                      str=str+s.charAt(i);
                  }
              }
              else if(i>0)
              {
                  if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i-1))
                  {
                      str=str+s.charAt(i);
                  }
              }
          }
          
          if(s.charAt(s.length()-1) != s.charAt(s.length()-2))
          {
              str=str+s.charAt(s.length()-1);
          }
          System.out.println(str);
          
      }
}