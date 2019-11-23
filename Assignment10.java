package abc2;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] ar=new int[n];
		int count=0;
		int max=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n+1;j++)
			{max=0;
				for(int l=i;l<j;l++)
				{
					if(max<ar[l])
						max=ar[l];
				}
				if(max>k)
					count++;
			}
		}
		System.out.println(count);

	}

}
