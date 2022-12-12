package Kiran;

import java.util.Arrays;
import java.util.List;

public class stream {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,10,4,15,6);
		System.out.println(values.stream().filter(i -> i%5==0).reduce(0,(c,e) ->c+e));

	}

}
