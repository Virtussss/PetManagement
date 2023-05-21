package petmanagement;

public class Cat extends Pet implements Feedable{
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void makeSound() {
		System.out.println("The cat meows.");
	}
	
	public void feed() {
		System.out.println(getName() + " has been fed.");
	}
}
