import java.util.*;
public class stackByQueues {
	
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		 int current_size;
		stackByQueues(){
			current_size=0;
		}                   
		//making push operation costly
		public void push(int x) {
			current_size++;
			q2.add(x);
			while(!q1.isEmpty()) {
				q2.add(q1.peek());
				q1.remove();
			}
			Queue<Integer> q;
			q=q1;
			q1=q2;
			q2=q;	
		}
		
		public void pop() {
			if(q1.isEmpty())
				return ;
			 q1.remove();
			current_size--;
			
		}
		public int top() {

            if (q1.isEmpty()) 
                return -1; 
			return q1.peek();
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackByQueues s = new stackByQueues();
		//System.out.println(s.current_size);
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
