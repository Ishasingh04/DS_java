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
    void postOrd(Node root)
    {
    	if(root==null)
    		return;
    	postOrd(root.left);
    	postOrd(root.right);
    	System.out.print(root.data+" ");
    
    }
}

public class Postorder {
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
        t1.postOrd(t1.root);
	}

}




