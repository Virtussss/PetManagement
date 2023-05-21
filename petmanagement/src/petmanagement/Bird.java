package petmanagement;

public class Bird extends Pet implements Feedable{
	public Bird(String name, int age) {
		super(name, age);
	}
	
	public void makeSound() {
		System.out.println("The bird chirps.");
	}
	
	public void feed() {
		System.out.println(getName() + " has been fed.");
	}
}
