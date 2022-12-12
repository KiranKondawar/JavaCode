package Diwali;

public class removeDupInSortedArray {
	

	    public static int removeDuplicates(int[] nums) {
	        // Length of the updated array
	        int count = 0;
	        // Loop for all the elements in the array
	        for (int i = 0; i < nums.length; i++) {
	            // If the current element is equal to the next element, we skip
	            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
	                continue;
	            }
	            // We will update the array in place
	            nums[count] = nums[i];
	            count++;
	        }
	        return count;
	    }
	

	public static void main(String[] args) {
int arr[]= {10,20,30,30,40,50,10};
		int res=removeDuplicates(arr);
System.out.println(res);
	}

}
