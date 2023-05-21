package petmanagement;

interface Feedable{
	void feed();
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Doggy", 6);
		Cat cat = new Cat("Kitty", 10);
		Bird bird = new Bird("Birdy", 4);

        PetOwner petOwner = new PetOwner();
        dog.makeSound();
        petOwner.feedPet(dog);
        System.out.println();
        
        cat.makeSound();
        petOwner.feedPet(cat);
        System.out.println();
        
        bird.makeSound();
        petOwner.feedPet(bird);
        System.out.println();
	}

}

// Differences between Abstract and Interface
// - A class can only extend one abstract class, but it can implement multiple interfaces
// - Abstracts can have different access modifiers, while interfaces are public
