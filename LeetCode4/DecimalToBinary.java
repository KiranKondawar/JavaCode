package LeetCode4;
import java.util.Stack;
public class DecimalToBinary {
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		System.gc();
        int a = 7;
		int r;
		while (a > 0) {
			r = a % 2;// 111
			st.push(r);// 111
			a = a / 2;// 310
			}
while (!st.isEmpty()) {
			System.out.println(st.pop());
		}}}
