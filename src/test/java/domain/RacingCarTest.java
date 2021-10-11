package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}