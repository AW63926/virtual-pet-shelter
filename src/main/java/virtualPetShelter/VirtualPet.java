package virtualPetShelter;

public class VirtualPet {
	private int hungerCounter;
	private int thirstCounter;
	private int boredomCount;
	private int healthCount;
	private int excretionCounter;

	public int increaseHungerLevel(int hungerValue) {
		this.hungerCounter += hungerValue;
		return this.hungerCounter;
	}

	public int getHungerLevel() {
		// TODO Auto-generated method stub
		return this.hungerCounter;
	}

	public int decreaseHungerLevel(int hungerValue) {
		this.hungerCounter -= hungerValue;
		return this.hungerCounter;
		
	}

	public int increaseThirstValue(int thirstValue) {
		this.thirstCounter += thirstValue;
		return this.thirstCounter;
	}

	public int getThirstLevel() {
		return this.thirstCounter;
	}

	public void decreaseThirstValue(int thirstValue) {
		this.thirstCounter -= thirstValue;
	}

	public void increaseBoredomCounter(int boredomValue) {
		this.boredomCount += boredomValue;
		
	}

	public int getBoredomCount() {
		return this.boredomCount;
	}

	public void decreaseBoredomCounter(int boredomValue) {
		this.boredomCount -= boredomValue;
		
	}

	public void increaseHealthCounter(int healthValue) {
		this.healthCount += healthValue;
		
	}

	public int getHealthCount() {
		return this.healthCount;
	}

	public void decreaseHealthCounter(int healthValue) {
		this.healthCount -= healthValue;
		
	}

	public void increaseExcretionCounter(int excretionValue) {
		this.excretionCounter += excretionValue;
		
	}

	public int getExcretionCount() {
		return this.excretionCounter;
	}

	public void decreaseExcretionCounter(int excretionValue) {
		this.excretionCounter -= excretionValue;
		
	}

	public void eat(int hungerValue) {
		this.hungerCounter -= hungerValue;
		
	}

	public void drink(int thirstValue) {
		this.thirstCounter -= thirstValue;
		
	}

}
