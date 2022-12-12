package krishnaSundeep;
import java.util.*;


public class DuplicateIneteger {
	
	public static void DupNo(int [] arr) {
		HashSet hs=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!hs.contains(arr[i])) {
				hs.add(arr[i]);
			}else {
				System.out.println("dup Element"+arr[i]);
			}
		}
	
			System.out.println(hs+" ");
		ArrayList<Integer> al=new ArrayList<Integer>(hs);
		TreeSet<Integer> Ts=new TreeSet<Integer>(hs);
		
		Collections.sort(al);
		System.out.println(al+" ");
		System.out.println(Ts+" ");
	}

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,40,10,70};
		
		
		DupNo(arr);

	}

}
