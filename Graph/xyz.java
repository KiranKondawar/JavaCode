package Graph;

public class xyz {


//public static void man(int n)
//{
//	String s="";
//	
//	while (n != 0)
//	{
//		
//		int number = n, m = 0, n1 = 1;
//		while(number != 0)
//		{
//			int rem = number % 10;
//			number = number / 10;
//
//			if (rem != 0) {
//				m += n1;
//				s+=Integer.toString(m);
//						}
//			
//
//			n1 *= 10;
//		}
//
//		
//		
//		
//		n = n - m;
//	}System.out.print(s.length());
//}
public static void main(String [] args) {
	


int n=23;
int specialOne = 0;
int specialTwo = 0;
if(n%11 > (n%11)/2){
    specialOne = n/11 +1;

    specialTwo = (specialOne * 11) - n;
    
} else{
    specialOne = n/11;
   
    specialTwo = -1* (specialOne * 11) - n;
    
    
}System.out.println(specialOne * 2+ specialTwo );
}}
