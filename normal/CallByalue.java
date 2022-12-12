package normal;

public class CallByalue {
	
	int data=100;
	void change(int i) {
		data=i+10;
	}
	
	public static void main(String [] args) 
	{
	CallByalue c1=new CallByalue();
	System.out.println("before change"+" "+c1.data);
	c1.change(100);
	System.out.println("after change"+" "+c1.data);
	
	}

}
