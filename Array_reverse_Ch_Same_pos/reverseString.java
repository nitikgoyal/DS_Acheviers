import java.util.*;
public class reverseString
{
	static boolean ischar(char ch)
	{
		 if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
		 {
			 return true;
		 }
        else
        {
		return false;
        }
	}
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String str=scan.next();
	char[] ch=str.toCharArray();
	int l=0;
    int n=ch.length-1;
	while(l<n)
	{
		if(!ischar(ch[l]))
			l++;
		else if(!ischar(ch[n]))
			n--;
		else
		{
			char t=ch[l];
			ch[l]=ch[n];
			ch[n]=t;
			l++;
			n--;
		}
	}
	System.out.println(ch);
	
	
}
}