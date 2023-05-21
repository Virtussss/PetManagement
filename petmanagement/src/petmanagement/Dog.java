package petmanagement;

public class Dog extends Pet implements Feedable{
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void makeSound() {
		System.out.println("The dog barks.");
	}
	
	public void feed() {
		System.out.println(getName() + " has been fed.");
	}
}
