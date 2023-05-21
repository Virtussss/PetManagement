package petmanagement;

public class PetOwner {
	public void feedPet(Feedable pet) {
		System.out.println("Pet owner is feeding " + pet.getClass().getSimpleName());
		pet.feed();
	}
}
