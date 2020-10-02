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
    void preOrd(Node root)
    {
    	if(root==null)
    		return;
    	preOrd(root.left);
    	preOrd(root.right);
    	System.out.print(root.data+" ");
    
    }
}

public class Preorder {
	public static void main(String[] args)
	{
		Tree t1=new Tree();
		t1.root=new Node(21);
        t1.root.left=new Node(22);
        t1.root.right=new Node(23);
        t1.root.left.left=new Node(24);
        t1.root.left.right=new Node(25);
        t1.root.right.left=new Node(26);
        t1.root.right.left.right=new Node(27);
        t1.preOrd(t1.root);
	}

}




