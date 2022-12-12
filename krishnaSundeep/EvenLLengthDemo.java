package krishnaSundeep;

public class EvenLLengthDemo {

	public static void main(String[] args) {
		
		String str="kiran kondawar Go To";
		
		for(String s: str.split(" ")) {
			if(s.length() % 2==0 ) {
				System.out.println(s);
			}
		}

	}

}
