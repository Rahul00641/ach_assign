package abc2;

import java.util.Scanner;
import java.util.Stack;

public class Assignment12 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		Stack<String> st=new Stack<String>();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)<65||(s.charAt(i)>90&&s.charAt(i)<97)||s.charAt(i)>122)
			{
				s1=s1+st.pop();
				s1=s1+st.pop();
				s1=s1+s.charAt(i);
				st.push(s1);
				s1="";
			}
			else
			{
				st.push(s.charAt(i)+"");
			}
		}
		System.out.println(st.pop());

	}

}
