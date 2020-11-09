import java.util.*;
//class Student{
//		int rollNo;
//		String name;
//		int age;
//		Student(int rollNo, String name, int age){
//			this.rollNo=rollNo;
//			this.name= name;
//			this.age = age;
//		}
//	}

	public class collection1 {
	public static void main(String[] args) {
//		Student s1 = new Student(100,"anak", 21);
//		Student s2 = new Student(101,"anam", 23);
//		Student s3 = new Student(102,"aman", 29);
//		
//		List<Student> li = new ArrayList<Student>();
//		li.add(s1);
//		li.add(s2);
//		li.add(s3);
//		 
//		Iterator itr = li.iterator();
//		while(itr.hasNext()) {
//			Student st = (Student)itr.next();
//			System.out.println(st.rollNo+ " "+ st.name+ " "+ st.age);
//			
		
		//How to convert Array to List
		String Array[]= {"ISHA","savi","bavi","arsh","kamal"};
		List<String> li = new ArrayList<String>();
		for(String a: Array) {
			li.add(a);
		}
		System.out.println(li);
		
		System.out.println(Arrays.toString(Array));
		
		//How to convert List To Array
		List <String> ll = new ArrayList<String> ();
		ll.add("PINK");
		ll.add("RED");
		ll.add("yellow");
		ll.add("black");
		ll.add("orange");
//		String arr[] = new String[ll.size()];
//		arr = ll.toArray(arr);
		
		Object[] arr = ll.toArray();
		System.out.println(Arrays.toString(arr));
		
//		for(Student s:li) {
//			System.out.println(s.rollNo);
//		}
	}
}
		// TODO Auto-generated method stub
//     PriorityQueue<String> q = new PriorityQueue<String>();
//     q.add("ram");
//     q.add("shaam");
//     q.add("raj");
//     q.add("lakshman");
//     Iterator<String> itr = q.iterator();
//     while(itr.hasNext()) {
//    	 System.out.println(itr.next());
//     }
//     System.out.println(q.peek());
//     System.out.println(q.element());
//     System.out.println(q.remove());
//     System.out.println(q.element());
//     System.out.println(q.poll());
//     System.out.println("On iterating");
////     Iterator<String> itr = q.iterator();
////     while(itr.hasNext()) {
//    	 System.out.println(q);
////     }
		
//		List<String> q = new ArrayList<String>();
//		q.add("ramma");
//		q.add("shamma");
//		q.add("ravan");
//		q.add("monster");
//		
//     	Iterator<String> itr = q.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println(q);
//		
//		for(String str: q) {
//			System.out.println(str);
//		}
//		
//		ListIterator<String> li =q.listIterator(q.size());
//		while(li.hasPrevious()) { 
//			System.out.println(li.previous());
//		}
//		
//		q.forEach(a -> {
//			System.out.println(a);
//		});
//		
//		
//	itr.forEachRemaining(a -> {
//		System.out.println(a);
//	});
	

