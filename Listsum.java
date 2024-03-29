package abc2;

import java.util.Scanner;

public class Listsum {

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
	
	public void insert(int d)
	{
		if(head==null)
			head=new Node(d);
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
	
	public int sum(Node current)
	{
		if(current.next==null)
			return current.data;
		return sum(current.next)*10+current.data;
	}
	
	public static void main(String[] args) {
		Listsum ls=new Listsum();
		Listsum ls2=new Listsum();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			ls.insert(in.nextInt());
		}
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			ls2.insert(in.nextInt());
		}
		System.out.println(ls.sum(ls.head)+ls2.sum(ls2.head));

	}

}
