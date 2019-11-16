package abc2;

import java.util.Scanner;
import java.util.Stack;

public class Assigment3 {
	
      public static void main(String[] args)
      {
    	     Scanner in=new Scanner(System.in);
    	     System.out.println("Enter the String");
    	     String s=in.next();
    	     Stack<Character> st=new Stack<Character>();
    	     for(int i=0;i<s.length();i++)
    	     {
    	    	 if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
    	    	 {
    	    		 st.push(s.charAt(i));
    	    	 }
    	    	 else if(s.charAt(i)==')')
    	    	 {
    	    		 if(st.peek()=='(')
    	    		 {
    	    			 st.pop();
    	    		 }
    	    		 else
    	    		 {
    	    			 break;
    	    		 }
    	    	 }
    	    	 else if(s.charAt(i)==']')
    	    	 {
    	    		 if(st.peek()=='[')
    	    		 {
    	    			 st.pop();
    	    		 }
    	    		 else
    	    		 {
    	    			 break;
    	    		 }
    	    	 }
    	    	 else if(s.charAt(i)=='}')
    	    	 {
    	    		 if(st.peek()=='{')
    	    		 {
    	    			 st.pop();
    	    		 }
    	    		 else
    	    		 {
    	    			 break;
    	    		 }
    	    	 }
    	     }
    	     if(st.isEmpty())
    	     {
    	    	 System.out.println("Balanced");
    	     }
    	     else
    	     {
    	    	 System.out.println("Not balanced");
    	     }
      }
}
