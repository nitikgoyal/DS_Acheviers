import java.util.Scanner;

public class MergeArrays
{
		public static void main(String args[]) 
        {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of elemmnts of array1 ");
		int num = scan.nextInt();
		int ar[]=new int[num];
		System.out.println("Enter elements of array1");
		for(int i=0;i<num;i++)
		{
			ar[i]=scan.nextInt();
		}
		System.out.println("Enter size of array2");
		int num2 = scan.nextInt();
		int ar2[] =new int[num2];
		System.out.println("Enter elements of arry2");
		for(int i=0;i<num2;i++)
		{
			ar2[i]=scan.nextInt();
		}
		mergesortedarray(ar,ar2);
		}
		static void mergesortedarray(int ar1[],int ar2[])
		{
			int s1 = ar1.length;
			int s2 = ar2.length;
			int s = s1+s2;
			int arr[] =new int[s];
			int i=0,j=0,k=0;
			while(i<s1 && j<s2)
			{
				if(ar1[i]<=ar2[j])
				{
					arr[k]=ar1[i];
					i++;
					k++;
				}
				
				else 
				{
					arr[k]=ar2[j];
					j++;
					k++;
				}
			}
				while(i<s1)
				{
					arr[k]=ar1[i];
					i++;
					k++;
				}
				
				while(j<s2)
				{
					arr[k]=ar2[j];
					j++;
					k++;
				}
			
			for(int h=0;h<s;h++)
				System.out.println(arr[h]);
		
			
		}

}