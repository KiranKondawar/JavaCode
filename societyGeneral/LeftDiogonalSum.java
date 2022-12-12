package societyGeneral;

import java.util.Scanner;

public class LeftDiogonalSum {
	
	public static int leftDiogonalSum(int arr[][],int m,int n) {
	int sum=0;
	
	int large=Math.max(m, n);
	int nr=m;
	int nc=n;
	if(large==nr) {
		nc=nr;
	}else {
		nr=nc;
	}
	
	int a[][]=new int[nr][nr];
	for(int i=0;i<nr;i++) {
		for(int j=0;j<nr;j++) {
			if(i<m || j<n)
			a[i][j]=arr[i][j];
			else
				a[i][j]=1;
			
		}
	}
	for(int i=0;i<nr;i++) {
		sum += a[i][i];
	}	
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter row and cloumn");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]= new int[m][];
		for(int i=0;i<m;i++) {
			arr[i]=new int[n];
			
		}for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("entyer no");
				arr[i][j]=sc.nextInt();
				
			}
			System.out.print("SUm of left diagonal digit is");
			System.out.println(leftDiogonalSum(arr,m,n));
		}

	}

}
