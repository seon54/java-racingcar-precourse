package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	void testAddCar() {
		// given
		Cars cars = new Cars();
		// when
		cars.addCar(new Car("붕붕"));
		// then
		assertEquals(1, cars.getCars());
	}

	@Test
	void testGetCarNames() {
		// given
		Cars cars = new Cars();
		cars.addCar(new Car("붕붕"));
		cars.addCar(new Car("씽씽"));
		// when & then
		assertThat(cars.getNames()).containsAll(Arrays.asList("붕붕", "씽씽"));
	}
}
