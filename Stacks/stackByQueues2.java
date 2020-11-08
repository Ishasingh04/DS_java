import java.util.*;
public class stackByQueues2 {
	static class stack{
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();
		static int current_size;
		
		stack(){
			current_size=0;
		}
		
		public static void push(int x) {
			current_size++;
			q1.add(x);
		}
		
		public static void pop() {
			if(q1.isEmpty())
				return;
			
			while(q1.size()!=1) {
				q2.add(q1.peek());
				q1.remove();
			}
			
			q1.remove();
			current_size--;
			
			Queue<Integer> q=q1;
			q1=q2;
			q2=q;
		}
		
		
		public static int top() {
			if(q1.isEmpty()) {
				return -1;
			}
			while(q1.size()!=1) {
				q2.add(q1.peek());
				q1.remove();
			}
			
			int temp = q1.remove();
			
			q2.add(temp);
			Queue<Integer> q=q1;
			q1=q2;
			q2=q;
			return temp;
			
		}
		
		public static int size()
		{
			return current_size;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.pop();
		
		
		
		//System.out.println(s.current_size);

	}

}
