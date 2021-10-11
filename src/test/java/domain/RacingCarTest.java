package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RacingCarTest {

	Car car;
	Step step;

	@BeforeEach
	void setUp() {
		car = new Car("씽씽");
		step = new Step();
		step.addRandomNumber(6);
	}

	@Test
	void testSetMap() {
		// given & when
		RacingCar racingCar = new RacingCar();
		racingCar.setMap(car, step);
		// then
		assertThat(racingCar).isInstanceOf(RacingCar.class);
	}

	@Test
	void testGetStep() {
		// given
		RacingCar racingCar = new RacingCar();
		racingCar.setMap(car, step);
		// when
		Step getStep = racingCar.getSteps(car);
		// then
		assertEquals(step, getStep);

	}

	@ParameterizedTest
	@CsvSource(value = {"씽씽, 9, 1", "붕붕, 2, 0"})
	void testGetResult(String name, int number, int result) {
		// given
		Car car = new Car(name);
		Step step = new Step();
		step.addRandomNumber(number);
		RacingCar racingCar = new RacingCar();
		racingCar.setMap(car, step);
		// when
		int resultNumber = racingCar.getResult(car);
		// then
		assertEquals(result, resultNumber);
	}
}