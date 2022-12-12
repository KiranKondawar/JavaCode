package basic;
import java.util.*;

public class Enumara {

	public static void main(String[] args) {
		
		//all collection object can use iterator
		//
		List l1=new ArrayList();
		l1.add(10);
		l1.add("kiran");
		l1.add("kondawar");
		
		Iterator itr= l1.iterator();
		// 3 methods only
		//hasNext,next,remove
		while(itr.hasNext()) {
			System.out.println(itr.next());
		};
		System.out.println("-------------------");
		
		
		//only list collection object can use iterator
		ArrayList l2=new ArrayList();
		l1.add(20);
		l1.add("kiran");
		l1.add("kondawar");
		
		ListIterator itr2= l1.listIterator();
		// 6 methods only
		//hasNext,next,set,remove,add,previous,hasprevious
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		};
		System.out.println("-------------------");
		
		Set l3=new HashSet();
		l1.add(30);
		l1.add("kiran");
		l1.add("kondawar");
		
		Iterator itr3= l1.iterator();
		
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		};
		System.out.println("-------------------");
		
	
		
	
		Vector v=new Vector();
		//only legacy class
		// jdk1.0 version onwards
		v.add(10);
		v.add("kiran");
		v.add("kondawar");
		
		Enumeration e= v.elements();
		// 2 methods only
		// only forward direction
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
		}
	}

}
