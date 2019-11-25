import java.util.*;
	public class PreFixToPostFix 
    {
		static boolean isCharacter(char c)
        {
			return ((c >= 'a' && c <= 'z') ||(c >= 'A' && c <= 'Z') ||(c >= '0' && c <= '9'));
		}
		public static String preTopost(String str)
        {
			Stack<String> s = new Stack<String>();
			String res=new String("");
			int n=str.length();
			for(int i=n-1;i>=0;i--){
				char c=str.charAt(i);
				if(isCharacter(c)){
					s.push(c+"");
				}
				else
                {
					String a=s.pop();
					String b=s.pop();
					res=a+b+c;
					s.push(res);
				}
			}
			return res;
		}
		public static void main(String args[]){
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the String in Prefix:");
			String str=scan.next();
			System.out.println("String in PostFix: "+preTopost(str));
		}
	}