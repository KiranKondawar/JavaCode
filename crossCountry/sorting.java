package crossCountry;

public class sorting {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,70,6,8};
		revere(a);
		

	}

	private static void revere(int[] a) {
		int n=a.length;
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<n-1-i;j++) {
        		if(a[j]>a[j+1]) {
        			int temp=a[j+1];
        			a[j+1]=a[j];
        			a[j]=temp;
        			
        		}
        	}
        }
        System.out.println(a[a.length-1]);
	}

	
		
	

}
