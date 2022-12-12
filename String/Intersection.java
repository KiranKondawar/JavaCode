package String;
import java.util.*;

public class Intersection {
	public static void printIntersection(int[] arr1,int[] arr2){
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(!set.contains(arr2[i])) {
				
				System.out.println(arr2[i]);
				
			}
		}
	}
	

	public static void main(String[] args) {
		int[] arr1= {4,1,2,3};
		int[] arr2= {5,4,2,8};
		printIntersection(arr1,arr2);
		

	}

}
