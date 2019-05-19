package virtualPetShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPet underTest = new VirtualPet();

	@Test
	public void hungerLevelShouldReturnOne() {
		int result = underTest.increaseHungerLevel(1);
		assertEquals(1, result);
	}

	@Test
	public void hungerLevelShouldReturnTwo() {
		int result = underTest.increaseHungerLevel(2);
		assertEquals(2, result);

	}

	@Test
	public void hungerLevelShouldBeIncreasedByAddingAmtsGiven() {
		underTest.increaseHungerLevel(2);
		underTest.increaseHungerLevel(2);
		int result = underTest.getHungerLevel();
		assertEquals(4, result);

	}

	@Test
	public void hungerLevelShouldReturnTen() {
		underTest.increaseHungerLevel(5);
		underTest.increaseHungerLevel(2);
		underTest.increaseHungerLevel(3);
		int result = underTest.getHungerLevel();
		assertEquals(10, result);
	}

	@Test
	public void hungerLevelShouldSubtractValueFromExistingTotal() {
		underTest.increaseHungerLevel(2);
		underTest.decreaseHungerLevel(1);
		int result = underTest.getHungerLevel();
		assertEquals(1, result);
	}

	@Test
	public void hungerLevelShouldReturnFiveAfterSubtraction() {
		underTest.increaseHungerLevel(10);
		underTest.decreaseHungerLevel(5);
		int result = underTest.getHungerLevel();
		assertEquals(5, result);
	}

	@Test
	public void shouldIncreaseThirstCounter() {
		int result = underTest.increaseThirstValue(1);
		assertEquals(1, result);
	}

	@Test
	public void shouldIncreaseThirstCountByFiveAndReturnFive() {
		underTest.increaseThirstValue(5);
		int result = underTest.getThirstLevel();
		assertEquals(5, result);
	}

	@Test
	public void shouldDecreaseThirstValueByOne() {
		underTest.increaseThirstValue(2);
		underTest.decreaseThirstValue(1);
		int result = underTest.getThirstLevel();
		assertEquals(1, result);
	}

	@Test
	public void shouldIncreaseThirstValueThenSubrtactFromThirstValue() {
		underTest.increaseThirstValue(10);
		underTest.decreaseThirstValue(5);
		int result = underTest.getThirstLevel();
		assertEquals(5, result);
	}

	@Test
	public void shouldIncreaseBoredomCounterByOne() {
		underTest.increaseBoredomCounter(1);
		int result = underTest.getBoredomCount();
		assertEquals(1, result);

	}

	@Test
	public void shouldDecreaseBoredomCounter() {
		underTest.increaseBoredomCounter(2);
		underTest.decreaseBoredomCounter(1);
		int result = underTest.getBoredomCount();
		assertEquals(1, result);
	}

	@Test
	public void shouldIncreaseHealthCounter() {
		underTest.increaseHealthCounter(1);
		int result = underTest.getHealthCount();
		assertEquals(1, result);
	}

	@Test
	public void shouldDecreasehealthCounter() {
		underTest.increaseHealthCounter(2);
		underTest.decreaseHealthCounter(1);
		int result = underTest.getHealthCount();
		assertEquals(1, result);
	}

	@Test
	public void shouldIncreaseExcretionCounter() {
		underTest.increaseExcretionCounter(1);
		int result = underTest.getExcretionCount();
		assertEquals(1, result);
	}

	@Test
	public void shouldDecreaseExcretionCounter() {
		underTest.increaseExcretionCounter(2);
		underTest.decreaseExcretionCounter(1);
		int result = underTest.getExcretionCount();
		assertEquals(1, result);
	}

	@Test
	public void shouldDecreaseHungerWhenPetEats() {
		underTest.increaseHungerLevel(5);
		underTest.eat(3);
		int result = underTest.getHungerLevel();
		assertEquals(2, result);
	}

	@Test
	public void shouldDecreaseThirstWhenPetDrinks() {
		underTest.increaseThirstValue(5);
		underTest.drink(3);
		int result = underTest.getThirstLevel();
		assertEquals(2, result);
	}

}
