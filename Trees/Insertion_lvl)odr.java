package datastructures;
import java.util.LinkedList;
import java.util.Queue;
public class Insertion_lvl_odr {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	static Node root;
	static Node temp=root;
	
	static void inorder(Node temp)
	{
		if(temp==null)
		{
			return;
		}
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	
	static void insertion_lvl(Node temp,int data)
	{
		Queue<Node> q= new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty())
		{
			temp=q.peek();
			q.remove();	
			
			if(temp.left==null)
			{
				temp.left=new Node(data);
				break;
			}
			else 
				q.add(temp.left);
			if(temp.right==null)
			{
				temp.right=new Node(data);
				break;
			}
			else 
				q.add(temp.right);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   root = new Node(22); 
	        root.left = new Node(15); 
	        root.left.left = new Node(13); 
	        root.right = new Node(25); 
	        root.right.left = new Node(23); 
	        root.right.right = new Node(27);
	        System.out.print( "Inorder traversal before insertion:\n"); 
	        inorder(root); 
	        
	        int data=12;
	        insertion_lvl(root,data);
	        
	        System.out.print( "\nInorder traversal after insertion:\n"); 
	        inorder(root); 
		

	}

}
