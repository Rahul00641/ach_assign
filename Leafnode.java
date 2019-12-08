package abc2;

import java.util.Scanner;

public class Leafnode {

	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	
	public void insert1(Node current,int d)
	{
		root=insert(current,d);
	}
	
	public Node insert(Node root,int d)
	{
		if(root==null)
		{
			root=new Node(d);
			return root;
		}
		else if(d<root.data)
		{
			root.left=insert(root.left,d);
		}
		else if(d>root.data)
		{
			root.right=insert(root.right,d);
		}
		return root;
	}
	
	public void display(Node current)
	{
		if(current==null)
			return ;
		display(current.left);
		System.out.println(current.data);
		display(current.right);
	}
	
	public void dis_leaf(Node current)
	{
		if(current==null)
			return ;
		dis_leaf(current.left);
		if(current.left==null&&current.right==null)
			System.out.println(current.data);
		dis_leaf(current.right);
	}
	
	public static void main(String[] args) {
		Leafnode l=new Leafnode();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			l.insert1(l.root, in.nextInt());
		}
		l.dis_leaf(l.root);

	}

}
