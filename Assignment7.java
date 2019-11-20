package abc2;

import java.util.Scanner;

public class Assignment7 {

	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	void insert(int d)
	{
		if(head==null)
		{
			head=new Node(d);
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=new Node(d);
		}
	}
	
	    int length()
		{
			Node current=head;
			int c=0;
			while(current!=null)
			{
				current=current.next;
				c++;
			}
			return c;
		}
	
	 void display()
	 {
		 Node current=head;
		 while(current!=null)
		 {
			 System.out.println(current.data);
			 current=current.next;
		 }
	 }
	 
	 void rotate(int k)
	 {
		 Node current=head;
		 Node last=head;
		 k=length()-k;
		 while(k>1)
		 {
			 current=current.next;
			 k--;
		 }
		 head=current.next;
		 current.next=null;
		 current=head;
		 while(current.next!=null)
		 {
			 current=current.next;
		 }
		 current.next=last;
	 }
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		Assignment7 a=new Assignment7();
		for(int i=0;i<n;i++)
		{
			a.insert(in.nextInt());
		}
		int k=in.nextInt();
        a.rotate(k);
        a.display();
	}

}
