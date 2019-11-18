package abc2;

import java.util.Scanner;

public class Assignment5 {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
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
	
	void duplicate()
	{
		Node current=head;
		Node next;
		while(current.next!=null)
		{
			next=current;
			while(next.next!=null)
			{
				if(current.data==next.next.data)
				{
					next.next=next.next.next;
					continue;
				}
				next=next.next;
			}
			current=current.next;
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
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		Assignment5 a=new Assignment5();
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			a.insert(in.nextInt());
		}
		a.duplicate();
		a.display();
	}

}
