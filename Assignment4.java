package abc2;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {
	
	public static boolean palindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				break;
			}
		}
		if(i>=j)
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=in.next();
		ArrayList<String> al=new ArrayList<String>();
		for(int  i=0;i<s.length();i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				al.add(s.substring(i, j));
			}
		}
		int max=0;
		String maxpal="";
		for(String a : al)
		{
			if(palindrome(a))
			{
				if(a.length()>max)
				{
					max=a.length();
					maxpal=a;
				}
			}
		}
		System.out.println(maxpal);

	}

}
