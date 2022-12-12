package CustomException;

@MyAnno(myValue = 11, myName = "KKiran")
public class Demo {

	public static void main(String[] args) {

		Demo d = new Demo();
		
		Class c=d.getClass();
		
		System.out.println(c);
		
	MyAnno my=(MyAnno)c.getAnnotation(MyAnno.class);
System.out.println(my);
	}

}
