package crossCountry;
import java.util.*; 
import java.io.*;


class timeConversion {

  public static String StringChallenge(int num) {
     String str="";
     int hr;
     int mm;
     
     hr=num/60;
     mm=num%60;
     mm=mm/10; 
if(!(mm==0)) {
	hr=0;
     str=hr+":"+mm;
     }else {
    	 mm=num-(hr*60);
    	 hr=0;
    	 str=" "+":"+mm;
     }
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int num=s.nextInt();
    System.out.print(StringChallenge(num)); 
  }

}