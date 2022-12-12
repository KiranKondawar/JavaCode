package Test;

class Dog extends Animal{  
	public void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
	  Animal a=new Dog();  
	  a.eat();  
	 } 
}