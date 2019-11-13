
//Given an Array of non negative Integers and a number. You need to print all the starting and ending indices of Subarrays having their sum equal to the given integer.
//For Example :-
//
//Input-int[] arr = {2, 3, 6, 4, 5};
//int num = 20
//Output-
//starting index : 0, Ending index : 4



import java.util.*;

public class Array_qu {

	static void SubArray(int a[] , int sum) {
		int len= a.length;
		
		for(int i=0;i<len;i++)
		{
			int count=0;	
			for(int j=i;j<len;j++) {
                count+=a[j];
				if(count==sum)
				{
					System.out.print("Starting index is : " + i + ",");
					System.out.print("Ending index is : " + j);
					break;
				}
			}
			
		}
	}
	
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter size :");
		int n= scan.nextInt();
        
		int a[] = new int[n];
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			
			a[i] = scan.nextInt();
		}
		
		System.out.println("Enter the sum ! ");
		int sum = scan.nextInt();
		SubArray(a,sum);
		
	}
	
	
}