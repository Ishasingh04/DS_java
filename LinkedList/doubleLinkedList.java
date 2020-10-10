package datastructures;

public class doubleLinkedList {
	static class Node{
		int data;
		Node next;
		Node previous;
		Node(int d)
		{
			data=d;
		}
	}
	Node head,tail=null;
	public void addNode(int d)
	{
		Node newNode= new Node(d);
		if(head==null)
	    {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
	    }
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
	}
	public void print()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		System.out.println("the nodes are : ");
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleLinkedList dlist=new doubleLinkedList();
		dlist.addNode(2);
		dlist.addNode(6);
		dlist.addNode(8);
		dlist.addNode(5);
		dlist.print();

	}

}
