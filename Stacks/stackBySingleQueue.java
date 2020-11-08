import java.util.*;
public class stackBySingleQueue {
	Queue<Integer> q = new LinkedList<Integer>(); 
	
	public void push(int val) { //the motive is to always keep the new element to the rear side
		
		int size = q.size();
		
		q.add(val);
		
		for(int i=0;i<size;i++)
		{
			int x = q.remove();
			q.add(x);
		}
		
	}
	
	public int pop() {
		int y = q.remove();
		return y;
	}
	public int top() {
		int z = q.peek();
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackBySingleQueue q = new stackBySingleQueue();
		q.push(6);
		q.push(7);
		q.push(8);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		

	}

}
