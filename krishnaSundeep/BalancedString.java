package krishnaSundeep;
import java.util.Stack;
public class BalancedString {

	public static void main(String[] args) {
		String str="({[]})";
		Stack st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(st.empty()) {
				st.push(c);
			}else if(c == '(' || c=='{' || c=='[') {
				st.push(c);
			}else if(c == ')' && (char)st.peek()=='(') {
				st.pop();
			}else if(c == '}' && (char)st.peek()=='{') {
				st.pop();
			}else if(c == ']' && (char)st.peek()=='[') {
				st.pop();
			}
		}
		if(st.empty()) {
			System.out.println("Balanced String");
		}else {
			System.out.println("String not Balanced");
		}
		
	}

}
