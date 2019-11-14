package abc2;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		System.out.println("Enter the elements");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int i,j,k;
		System.out.println("Enter the sum");
		int su=in.nextInt();
		int sum=0;
		boolean avail=false;
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				sum=0;
				for( k=i;k<=j;k++)
				{
					sum=sum+a[k];
				}
				if(sum==su)
				{
					System.out.println("Starting index : "+i+"  ending index : "+k);
					avail=true;
				}
			}
		}
		if(!avail)
		{
			System.out.println("No subarray has sum = "+su);
		}

	}

}
