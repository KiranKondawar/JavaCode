package Advance;
import java.util.ArrayList;
import java.util.Collections;

public class Rayden {

	public static void main(String[] args) {
         ArrayList<String> al= new ArrayList<String>();
         al.add("a");
         al.add("b");
         al.add("a");
         al.add("b");
        int n =al.size();
         Collections.sort(al);
         String arr[] =new String[n];
        int i=0;
         for(String s : al) {
        	 if(s=="a") {
        		 arr[i]= "black";
        		 i++;
        		// System.out.println("black");
        	 }
        	 if(s=="b") {
        		 arr[i]= "white";
        		 i++;
        		// System.out.println("White");
        	 }
         }
         System.out.print("[");
         for(int k=0;k<arr.length;k++) {
        	 System.out.print(arr[k]+" ");
         }
         System.out.println("]");
         
         
	}

}
