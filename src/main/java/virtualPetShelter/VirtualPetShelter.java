package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class VirtualPetShelter {
	
	Map<String, VirtualPet> pets = new HashMap<>();

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
	
	

	
	
	
	
	
}
