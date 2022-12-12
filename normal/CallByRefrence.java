package normal;

public class CallByRefrence {
	
	int data=100;
	
	void Change(CallByRefrence op) {
		op.data=op.data+100;
	}
      public static void main(String [] args) {
	CallByRefrence op=new CallByRefrence();
	System.out.println("before change"+" "+op.data);
	op.Change(op);
	System.out.println("after change"+" "+op.data);
}
}
