package Test;

class UnderAgeException extends RuntimeException{
	UnderAgeException(){
		super("You are not eligible for vote");
	}
	UnderAgeException(String mesg){
		super(mesg);
	}
}

public class voting {

	public static void main(String[] args) {
		int age=17;
		try {
		if(age<18) {
			throw new UnderAgeException();
		}else {
			System.out.println("you can vote");
		}
		}
		catch(UnderAgeException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
