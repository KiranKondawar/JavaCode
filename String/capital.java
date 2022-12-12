package String;

public class capital {

	public static void main(String[] args) {
	     String st="i am kiran kondwar";
	     String[] ch=st.split(" ");
	     for(String w: ch) {
	    	 System.out.print(w.substring(0,1).toUpperCase()+w.substring(1,w.length())+" ");
	    	 
	     }

	}

}
