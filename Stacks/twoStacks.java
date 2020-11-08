public class twoStacks {
	int top1, top2;
	int arr[];
	int size;
	
	twoStacks(int n){
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}
	public void push1(int a) {
		if(top2-top1>1) {
			top1++;
			arr[top1] = a;
		}else {
			System.out.println("Overflow");
		}
	}
	public void push2(int a) {
		if(top2-top1>1) {
			top2--;
			arr[top2] = a;
		}else {
			System.out.println("Overflow");
		}
	}
	public int pop1() {
		if(top1>=0) {
			int x = arr[top1];
			top1--;
			return x;
		}else {
			System.out.println("Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2() {
		if(top2<=size) {
			int x = arr[top2];
			top2++;
			return x;
		}else {
			System.out.println("Underflow");
			System.exit(1);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoStacks ts = new twoStacks(5);
		ts.push1(7);
		ts.push1(6);
		int x = ts.pop1();
		ts.push2(8);
		ts.push2(1);
		System.out.println("top element of stack1 is: "+ x);
		ts.push2(11);
		int y = ts.pop2();
		System.out.println("top element of stack2 is: "+ y);
		

	}

}
