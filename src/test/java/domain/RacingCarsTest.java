package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RacingCarsTest {

	Cars cars;
	RacingCar racingCar1;
	RacingCar racingCar2;

	@BeforeEach
	void setUp() {
		Car car1 = new Car("붕붕");
		Car car2 = new Car("씽씽");
		cars = new Cars();
		cars.addCar(car1);
		cars.addCar(car2);
		Step step1 = new Step();
		step1.addRandomNumber(5);
		step1.addRandomNumber(2);
		Step step2 = new Step();
		step2.addRandomNumber(7);
		step2.addRandomNumber(8);
		racingCar1 = new RacingCar();
		racingCar1.setMap(car1, step1);
		racingCar2 = new RacingCar();
		racingCar2.setMap(car2, step2);
	}

	@Test
	void testAddRacingCar() {
		// given
		RacingCars racingCars = new RacingCars();
		racingCars.addRacingCar(racingCar1);
		// when
		RacingCar racingCar = racingCars.getRacingCar(0);
		// then
		assertEquals(racingCar1, racingCar);
	}

	@Test
	void testGetWinner() {
		// given
		RacingCars racingCars = new RacingCars();
		racingCars.addRacingCar(racingCar1);
		racingCars.addRacingCar(racingCar2);
		// when
		String winners = racingCars.getWinners(cars);
		// then
		assertThat(winners).contains("씽씽");
	}
	@Test
	void testGetRacingCar() {
		// given
		RacingCars racingCars = new RacingCars();
		racingCars.addRacingCar(racingCar1);
		racingCars.addRacingCar(racingCar2);
		// when
		RacingCar racingCar = racingCars.getRacingCar(1);
		// then
		assertEquals(racingCar2, racingCar);
	}
}