package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {
	Scanner input = new Scanner(System.in);
	Map<String, VirtualPet> pets = new HashMap<>();
	int welcomeCount = 0;

	public void addVirtualPet(VirtualPet petObject) {
		pets.put(petObject.getPetName(), petObject);

	}

	public VirtualPet findVirtualPet(String petName) {
		return pets.get(petName);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void removeAVirtualPet(VirtualPet petName) {
		pets.remove(petName.getPetName(), petName);

	}

	

	public void welcome() {
		System.out.println("Hello, Welcome to Adam\'s Pet Palace!");
		System.out.println("How can we help you?");
	}
	public void gamePlay() {
		menuItems();
		shelterSwitchStatement();
	}

	public void menuItems() {
		if (welcomeCount == 0) {
			welcome();
			welcomeCount++;
		}
		System.out.println("1.  Enter 1 to feed the pets?");
		System.out.println("2.  Enter 2 to give the pets a drink?");
		System.out.println("3.  Enter 3 to play with a pet?");
		System.out.println("4.  Enter 4 to Adopt a pet?");
		System.out.println("5.  Enter 5 to admit a pet?");
		System.out.println("6.  Enter 6 to take the pets on a bathroom break.");
		System.out.println("7.  Enter 7 to clean up after the pets.");
		System.out.println("8.  Enter 8 to check on all of the pets.");
		System.out.println("9.  Enter 9 to display the menu.");
		System.out.println("10.  Enter \"Quit\" to exit.");
	}

	public void shelterSwitchStatement() {
		boolean switchLoop = true;
		while (switchLoop) {

			String switchValue = input.next();
			switch (switchValue.toLowerCase()) {
			case "1":
				System.out.println("The pets are all being fed");
				// this will be where the eat method is called on all pets in the collection
				break;
			case "2":
				System.out.println("The pets are all getting a drink");
				// this will be where the drink method is called on all pets in the collection
				break;
			case "3":
				System.out.println("The pets are playing");
				System.out.println("Would you like to find a specific pet?  Enter the name");
				String petString = input.next();
				VirtualPet myPet = findVirtualPet(petString);
				System.out.println(myPet.getPetName() + ": Boredom Count " + myPet.getBoredomCount());
				// this will be where the play method is called on all pets in the collection
				break;
			case "4":
				System.out.println("Which pet would you like to adopt?");
				for(String key : pets.keySet()) {
					System.out.println(key);
				}
				String userChoice = input.next();
				VirtualPet userPet = findVirtualPet(userChoice);
				removeAVirtualPet(userPet);
				System.out.println("Thanks for adopting " + userChoice + "!!");
				// this will be where the remove method is called on a key item pet in the
				// collection using petname
				break;
			case "5":
				System.out.println("What is the name of the pet?");
				String petName = input.next();
				System.out.println("What kind of pet is the pet?");
				String petType = input.next();
				VirtualPet petObject = new VirtualPet(petName, petType);
				addVirtualPet(petObject);
				petObject.setInitialValuesToRandom();
				System.out.println("We will take good care of this pet and see that a home is found");
				// this will be where the add method adds a pet to the collection. The pet
				// object will still have to be initialized, so dont get crazy
				break;
			case "6":
				//take the pets on a bathroom break
				System.out.println("Taking the pets on a bathroom break");
				break;
			case "7":
				//this will clean up after the pets
				System.out.println("Cleaning up after the pets");
				break;
			case "8":
				//this will check on the pets
				
			case "9":
				// this will call menuItems()
				menuItems();
				break;
			case "quit":
				// this will exit the program
				System.exit(0);
			default:
				System.out.println("Sorry, you will have to enter a selection from the menu");
				break;

			}
		}

	}

}
