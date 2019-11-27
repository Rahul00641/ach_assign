package abc2;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		int n,n2;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		n2=in.nextInt();
		int k=in.nextInt();
		int[] ar=new int[n];
		int[] ar2=new int[n2];
		for(int i=0;i<n;i++)
			ar[i]=in.nextInt();
		for(int i=0;i<n2;i++)
			ar2[i]=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(ar[i]+ar2[j]==k)
				{
					System.out.println(ar[i]+" "+ar2[j]);
				}
			}
		}

	}

}
