package basic;



public class Break {  
//public static void main() {  
//    //using for loop  
//    for(int i=1;i<=10;i++){  
//        if(i==5){  
//            //breaking the loop  
//            continue;  
//        }  
//        System.out.println(i);  
//    }  
//}  
//}  

	int main() {
	   int k = 9999;
	   solve(k);
	   return 0;
	}

private void solve(int k) {
	 String s = Integer.toString(k);
	   int v[] = {0, 1, 3, 6, 10};
	   for(int i=0;i<s.length();i++) {
		   System.out.println((s.charAt(i)-'0')*10+v[s.length()]);
	   }
	   
	   
	   int specialOne = 0;
       int specialTwo = 0;
       if(n%11 > (n%11)/2){
    	   9
           specialOne = n/11 +1;
    	                 1+1=2
     
           specialTwo = (specialOne * 11) - n;
    	                 22-20=2
    	                		 return specialOne * 2+ specialTwo;
           
       } else{
           specialOne = n/11;
          
           specialTwo = -1* (specialOne * 11) - n;
           
           
       }
	   
	   
	   
	   
	   
	   
	  
	 
	
}
}
