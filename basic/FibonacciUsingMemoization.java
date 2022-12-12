package basic;
import java.util.Scanner;
public class FibonacciUsingMemoization {
static int array[]=new int[1000];

public static int fib(int num) {
	if (num==0)
		return array[0];
	
	if (num==1)
		return array[1];
	else {
		array[num-1] = fib(num - 1)+fib(num - 2);
		return array[num-1];
	}
}

public static void main(String [] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter how many no you want to print");
	n=sc.nextInt();
	array[0]=0;
	array[1]=1;
	
	for(int i=0; i<n;i++) {
		System.out.print(fib(i)+" ");
	}
	sc.close();
}
}
