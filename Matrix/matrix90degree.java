package Matrix;

import java.util.Scanner;

public class matrix90degree {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value");
		  int  N =sc.nextInt();
		  //static int y=N;
		
		int arr[][]= {{2,3,4},{7,8,10},{12,13,14}};
		System.out.println("before");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<N/2;i++) {
			for(int j=i;j<N-1-i;j++) {
			int temp=	arr[i][j];
			//2 0
			arr[i][j]=arr[N-1-j][i];
			//  2=>12
			arr[N-1-j][i]=arr[N-1-i][N-1-j];//14
			arr[N-1-i][N-1-j]=arr[j][N-1-i];
			arr[j][N-1-i]=temp;
			
			
				
			}}
		
		System.out.println("After");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}


}
