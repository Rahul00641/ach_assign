package abc2;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
        char[] c=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
        	while((c[i]<65||(c[i]>90&&c[i]<97)||c[i]>122))
        	{

        		i++;
        	}
        	while((c[j]<65||(c[j]>90&&c[j]<97)||c[j]>122))
        	{

        		j--;
        	}
        	char temp=c[i];
        	c[i]=c[j];
        	c[j]=temp;
        	i++;
        	j--;
        }
        s="";
         for(i=0;i<c.length;i++)
         {
        	 s=s+c[i];
         }
         System.out.println(s);
        
	}

}
