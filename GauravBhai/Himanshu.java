package GauravBhai;

public class Himanshu {

	public static void main(String[] args) {
		//int a[]= {1,2,3,4,5};
		int a[]={4,59,84,-10};
		int x=0;
		for(int i=0;i<a.length;i++){
		    //System.out.println(a[i]);
		    if(a[i]%10==4 && a[i]<45 && a[i]>0)
		    	a[i]=-1;
		    else if(a[i]>45 && a[i]%10!=4 )
	    	a[i]=-7;
		    else if(a[i]>45 && a[i]%10==4)
		    	a[i]=-2;
		    else if(a[i]<0)
		    	a[i]=0;
		    }
		int b[]=new int[a.length-x-1];
		int j=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0) {
				b[j]=a[i];
			j++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}

	}

}









































  
