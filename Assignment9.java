package abc2;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		int max=0;
		for(int i=0;i<n-k+1;i++)
		{max=0;
			for(int j=i;j<i+k;j++)
			{
				if(max<ar[j])
					max=ar[j];
			}
			System.out.print(max+"  ");
		}

	}

}
