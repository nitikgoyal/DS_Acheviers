import java.util.*;
public class element_freq
{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number of elements you want to enter in array:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++)
        
        {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
        {
			if(a[i]!=0){
				int count=1;
			for(int j=i+1;j<n;j++)
            {
				if(a[j]!=0)
                {
				 if(a[i]==a[j])
                  {
					count++;
					a[j]=0;
				   }
			    }
			}
			System.out.println(a[i]+"->"+count);
		}
		}
	}
}