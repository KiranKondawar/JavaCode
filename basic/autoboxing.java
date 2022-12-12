package basic;

public class autoboxing {

	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);//initialyy this happening
		Integer j=a;//lagter on valueof eill call internally
		System.out.println(a+" "+i+" "+j);

	}

}
