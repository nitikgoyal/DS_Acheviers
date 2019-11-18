import java.util.Scanner;
 class longestPallindrom{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String str1="";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
			String s=str.substring(i,j);
	        	//;System.out.println(s);
	        	char ch[]=s.toCharArray();
	        	int m=0,k=ch.length-1;
	        	while(m<k)
	        	{
	        		char temp=ch[m];
	        		ch[m]=ch[k];
	        		ch[k]=temp;
	        		m++;
	        		k--;
	        	}
	        	String rev=new String(ch);
	        	if(s.compareTo(rev)==0 && (s.length()>str1.length()))
	        	{
	        		str1=s;
	        	}
			}
		}        
        System.out.println("Longest Pallindrom Substring : "+str1);
	}
}
