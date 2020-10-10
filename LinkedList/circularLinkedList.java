package datastructures;

public class circularLinkedList {
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void add(int d)
	{
		Node newNode=new Node(d);
		if(head==null)
		{
			head=tail=newNode;
			tail.next=head;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			newNode.next=head;
		}
		
	}
	public void print()
	{
		Node current=head;
		if(head==null)
		{
			System.out.print("the list is empty");
			return;
		}
		System.out.print("the nodes of the circular linked list are : ");
		do {
			System.out.print(current.data+" ");
			current=current.next;
		}while(current!=head);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circularLinkedList clist=new circularLinkedList();
		clist.add(2);
		clist.add(5);
		clist.add(8);
		clist.print();
				

	}

}
