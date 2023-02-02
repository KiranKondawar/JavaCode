package crossCountry;

public class duplicateRemoval {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,3,2};
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				
				if(a[i]==a[j]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(a[i]);
			}
		}
		

	}

	
}
