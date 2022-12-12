package GFG;


public class GFG {
	 
 
    static int vowel_calc(String s)
    {
        int n = s.length();
        int arr[] = new int[n];
 
        for (int i = 0; i < n; i++) {
 
            if (i == 0)
               
                arr[i] = n;
 
            else
              
                arr[i] = (n - i) + arr[i - 1] - i;
        }
 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
           
            if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u')
                sum += arr[i];
        }
 
    
        return sum;
    }
 

    public static void main(String args[])
    {
        String s = "abc";
        System.out.println(vowel_calc(s));
    }
}