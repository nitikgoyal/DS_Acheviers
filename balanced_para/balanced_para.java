import java.util.Scanner;
import java.util.Stack;

public class balanced_para{
	
	static boolean checkpara(String str)
    {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++)
        {
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
            {
				s.push(str.charAt(i));
			}
			else if((str.charAt(i)==')'&&s.peek()=='(')||(str.charAt(i)==']'&&s.peek()=='[')||(str.charAt(i)=='}'&&s.peek()=='{'))
            {
				s.pop();
			}
		}
		if(s.isEmpty())
			return true;
		else
			return false;	
	}
	
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the paranthesis... ");
		String str=sc.next();
       
		if(checkpara(str))
        
        {
			System.out.println("Balanced");
		}
		else
        {
			System.out.println("Not Balanced");		
		}
	}
}