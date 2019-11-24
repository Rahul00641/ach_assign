package abc2;

import java.util.Scanner;

public class Assignmnet11 {

	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data=d;
			next=prev=null;
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
			current.next.prev=current;
		}
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
	
	void reverse()
	{
		Node current=head;
		while(current.next!=null)
			current=current.next;
		head=current;
		while(current!=null)
		{
			Node next=current.next;
			current.next=current.prev;
			current.prev=next;
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		Assignmnet11 li=new Assignmnet11();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			li.insert(in.nextInt());
		}
		li.reverse();
		li.display();

	}

}
