package Test;

public class BabyDog extends Dog{
public void eat() {
	System.out.println("baby dog crying");
}

public static void main(String [] args) {
	Dog a=new BabyDog();
	BabyDog babyDog = new BabyDog();
	babyDog.eat();
}
}