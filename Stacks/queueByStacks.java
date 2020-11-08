import java.util.*;
public class queueByStacks {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	 public void enqueue(int x) {
		 while(!(stack1.isEmpty())) {
			 stack2.push(stack1.pop());
		 }
		 stack1.push(x);
		 while(!(stack2.isEmpty()))
		 stack1.push(stack2.pop());
	 }
	 
	 public int dequeue()
	 {       int x = stack1.pop();
			 return x;
	 }
	 
	 public int Empty()
	 {
		 while(!stack1.isEmpty())
		 {
			 int x = stack1.pop();
			 System.out.println(x);
		 }
		 return 0;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueByStacks q = new queueByStacks();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		//q.Empty();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	    //q.Empty();

	}

}
