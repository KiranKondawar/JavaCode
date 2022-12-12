package Kiran;

import java.util.Arrays;

public class uday {
	
	public static void printSub(int[] arr) {
        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];

        Arrays.sort(arr);
        for (int n = 1, index = 0, i = arr.length - 1; i > 0; i -= 2, n++) {
            if (n % 2 != 0) {
                arr1[index] = arr[i];
                arr2[index++] = arr[i - 1];
            } else {
                arr2[index] = arr[i];
                arr1[index++] = arr[i - 1];
            }

        }
int a;
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]==arr1[i+1]) {
        		System.out.println( arr1[i]);
        		a=arr1[i];break;
        	}
        }
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int arr[] = {3,4,5,3,100,1,83,54,23,20}; 
        int n = arr.length; 
     printSub(arr); 
    } 

}
