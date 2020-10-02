class Node
{
    int data; Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class Tree
{
    Node root;
    Tree()
    {
        root=null;
    }    
    void inOrd(Node root)
    {
    	if(root==null)
    		return;
    	inOrd(root.left);
    	System.out.print(root.data+" ");
    	inOrd(root.right);
    }
}

public class Inorder {
	public static void main(String[] args)
	{
		Tree t1=new Tree();
		t1.root=new Node(11);
        t1.root.left=new Node(12);
        t1.root.right=new Node(13);
        t1.root.left.left=new Node(14);
        t1.root.left.right=new Node(15);
        t1.root.right.left=new Node(16);
        t1.root.right.left.right=new Node(17);
        t1.inOrd(t1.root);
	}

}

