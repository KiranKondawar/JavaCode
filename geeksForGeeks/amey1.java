package geeksForGeeks;

public class amey1 {

}
public String removeDuplicates(String s) {
    int i = 0, n = s.length(), count[] = new int[n];
    char[] stack = s.toCharArray();
    for (int j = 0; j < n; ++j, ++i) {
        stack[i] = stack[j];
        count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
        if (count[i] == s.length()) i -= s.length();
    }
    return new String(stack, 0, i);
}