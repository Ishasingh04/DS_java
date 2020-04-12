package datastructures;

class Node{
	int data;
	Node left;
	Node right;
	Node(int d)
	{
		d=data;
		left=right=null;
		
	}
}
public class Tree_Basic {
	Node root;
	Tree_Basic(int data)
	{
		root=new Node(data);
	}
	Tree_Basic()
	{
		root=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Basic tree=new Tree_Basic();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);

	}

}
