package HackerRank;

import java.util.Stack;

public class StringReducer {
	public static String reducedString(String str) {
		StringBuilder sb=new StringBuilder();
		
		Stack<Character> stack=new Stack<>();
		for(char c: str.toCharArray()) {
			if(stack.isEmpty()) {
				stack.push(c);
			}else if(c==stack.peek()){
				stack.pop();
			}else {
				stack.push(c);
			}
			
		}
		
		for(char c:stack) {
			sb.append(c);
		}
		
		
		
		
		
		return sb.length()==0?"Empty String":sb.toString();
		
	}

	public static void main(String[] args) {
		String str="abcddcbaa";
		System.out.println(reducedString(str));
		
		

	}

}
