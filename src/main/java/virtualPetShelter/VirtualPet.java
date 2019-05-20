package virtualPetShelter;

public class VirtualPet {
	private int hungerCounter;
	private int thirstCounter;
	private int boredomCount;
	private int healthCount;
	private int excretionCounter;
	private int sleepyCounter;
	private String petName;
	private String petType;
	
	

	public VirtualPet(String petName, String petType) {
		this.petName = petName;
		this.petType = petType;
	}

	public int increaseHungerLevel(int hungerValue) {
		this.hungerCounter += hungerValue;
		return this.hungerCounter;
	}

	public int getHungerLevel() {
		// TODO Auto-generated method stub
		return this.hungerCounter;
	}

	public int increaseThirstValue(int thirstValue) {
		this.thirstCounter += thirstValue;
		return this.thirstCounter;
	}

	public int getThirstLevel() {
		return this.thirstCounter;
	}

	public void increaseBoredomCounter(int boredomValue) {
		this.boredomCount += boredomValue;

	}

	public int getBoredomCount() {
		return this.boredomCount;
	}

	public void increaseHealthCounter(int healthValue) {
		this.healthCount += healthValue;

	}

	public int getHealthCount() {
		return this.healthCount;
	}

	public void increaseExcretionCounter(int excretionValue) {
		this.excretionCounter += excretionValue;

	}

	public void eat(int hungerValue) {
		this.hungerCounter -= hungerValue;

	}

	public void drink(int thirstValue) {
		this.thirstCounter -= thirstValue;

	}

	public void bathroom(int excretionValue) {
		this.excretionCounter -= excretionValue;
	}

	public int getExcretionCount() {
		return this.excretionCounter;
	}

	public void play(int boredomValue) {
		this.boredomCount -= boredomValue;
	}

	public void increaseSleepyCounter(int sleepyValue) {
		this.sleepyCounter += sleepyValue;

	}

	public int getSleepyCount() {
		return this.sleepyCounter;
	}

	public void sleep(int sleepValue) {
		this.sleepyCounter -= sleepValue;
	}

	public void givePetName(String petName) {
		this.petName = petName;

	}

	public String getPetName() {
		return this.petName;
	}

	public void assignPetType(String petType) {
		this.petType = petType;

	}

	public String getPetType() {
		return this.petType;
	}

	public int generateRandomNumber() {
		int random = (int) (Math.random() * 10);
		// System.out.println(random);
		return random;
	}

	public void setInitialValuesToRandom() {
		int sleepValue = generateRandomNumber();
		increaseSleepyCounter(sleepValue);
		int boredom = generateRandomNumber();
		increaseBoredomCounter(boredom);
		int hunger = generateRandomNumber();
		increaseHungerLevel(hunger);
		int excretionValue = generateRandomNumber();
		increaseExcretionCounter(excretionValue);
		int health = generateRandomNumber();
		increaseHealthCounter(health);
	}

	public void printStatisticToConsole() {
		System.out.println("Name     |Hunger | Thirst | Boredom | Sleepy |");
		System.out.println("----------------------------------------------");
		System.out.println(getPetName() + "     |   " + getHungerLevel() + "   |  " + getThirstLevel() + "     |  "
				+ getBoredomCount() + "      |  " + getSleepyCount());
	}

	public void gamePlayVirtualPet() {
		setInitialValuesToRandom();
		printStatisticToConsole();
	}

	

}
