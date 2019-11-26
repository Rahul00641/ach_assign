package abc2;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		for(int i=0;i<s.length()-1;i++)
		{
			int j;
			if(s.charAt(i)==s.charAt(i+1))
			{
				for(j=i+2;j<s.length();j++)
				{
					if(s.charAt(i)!=s.charAt(j))
						break;
				}
				s=s.substring(0,i)+s.substring(j,s.length());
				i=0;
			}
		}
		System.out.println(s);

	}

}
