package HackerRank;

import java.util.Arrays;

public class BiggestPrefix {
	public static String findLongestPrefix(String[] str){
		
		StringBuilder sb=new StringBuilder();
		
		Arrays.sort(str);
		char[] first=str[0].toCharArray();
		char[] last=str[str.length-1].toCharArray();
		
		
		for(int i=0;i<first.length;i++) {
			if(first[i]!=last[i])
				break;
		sb.append(first[i]);
		}
		
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String[] str= {"clje","cluk","clukr"};
		System.out.println(findLongestPrefix(str));

	}

}
