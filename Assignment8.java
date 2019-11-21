package abc2;

public class Assignment8 {

	Node root;
	static int max;
	
	class Node
	{
		Node left;
		Node right;
		int data;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	
	void check()
	{
		boolean bst=true;
		bst=checkbst(root,true);
				if(bst)
				{
					System.out.print("It is bst");
				}
				else
				{
					System.out.print("It is not bst");
				}
	}

	static boolean checkbst(Node head,boolean ch)
	{
		if(head==null)
		{
			return true;
		}
		else
		{
		 ch=checkbst(head.left,ch);
		 if(!ch)
		 {
			 return false;
		 }
		 if(head.data<=max)
		 {
			 return false;
		 }
		 else if(head.data>max)
		 {
			 max=head.data;
		 }
		 if(!ch)
		 {
			 return false;
		 }
         ch=checkbst(head.right,ch);
         if(!ch)
         {
        	 return false;
         }
		}
		return ch;
	}
	
	void insert()
	{
		root=new Node(6);
		root.left=new Node(4);
		root.left.left=new Node(2);
		root.left.right=new Node(5);
		root.right=new Node(9);
		root.right.left=new Node(8);
		root.right.right=new Node(10);
	}
	
	public static void main(String[] args)
	{
		Assignment8 a =new Assignment8();
		a.insert();
		a.check();
	}
}
