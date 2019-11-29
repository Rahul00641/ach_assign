package abc2;
import java.util.Scanner;

class Nod
{
int data;
Nod left;
Nod right;
Nod(int d)
{
	data=d;
	left=right=null;
}
}

public class Leftview {

		Nod head;
		static int h;
		
		public void left(Nod current,int c_h)
		{
			if(current==null)
				return;
			else if(h<c_h)
		   {
			   System.out.println(current.data);
			   h=c_h;
		   }
			left(current.left,c_h+1);
			left(current.right,c_h+1);
		}
		
		public static void main(String[] args) {
			Leftview b=new Leftview();
			Scanner in=new Scanner(System.in);
			b.head=new Nod(1);
			b.head.left=new Nod(2);
			b.head.right=new Nod(8);
			b.head.left.left=new Nod(3);
			b.head.left.right=new Nod(6);
			b.head.right.left=new Nod(5);
			b.head.right.right=new Nod(9);
			b.left(b.head,1);
		}

	}
