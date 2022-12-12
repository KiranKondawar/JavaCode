package krishnaSundeep;
import java.util.Stack;
public class reverseWordInString {
	static void reverseWords(String str) {
		Stack stack=new Stack();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				stack.push(str.charAt(i));
			}else {
				while(stack.empty()==false) {
					System.out.println(stack.pop());
				}
			}
		}
		System.out.println(" ");
		while(stack.empty()==false) {
			System.out.println(stack.pop());
		}
		
	}

	public static void main(String[] args) {
		reverseWords("Hello World");

	}

}
