package datastructures;
//insertion in sorted list
public class inertion_sorted {
	static Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void insert(inertion_sorted l,int d)
	{
		Node nn=new Node(d);
		nn.next=null;
		if(l.head==null)
		{
			l.head=nn;
		}
		else
		{
			nn.next=l.head;
			l.head=nn;
		}
		
	}
	public static void insert_sorted(inertion_sorted l,int d)
	{
		Node newNode=new Node(d);
		newNode.next=null;
		Node current=l.head;
		Node perv=l.head;
		if(l.head==null)
		{
			l.head=newNode;
		}
		else {
		while(current!=null)
		{
			if(l.head.data>newNode.data)
			{
				newNode.next=current;
				l.head=newNode;
				break;
			}
		else if(current.data>newNode.data)
			{
				newNode.next=current;
				perv.next=newNode;
				//perv=current;
				break;
			}
			
			else if(current.next==null)
			{
				current.next=newNode;
				break;
			}
			
			if(current!=l.head)
				perv=perv.next;
			current=current.next;
		}
		}
		
	}
	
	public static void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inertion_sorted l=new inertion_sorted();
		l.insert(l, 10);
		//l.insert(l, 8);
		//l.insert(l,6);
        l.insert_sorted(l,7);
		l.print();

	}

}
