package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CarsTest {

	Cars cars;

	@BeforeEach
	void setUp() {
		cars = new Cars();
	}

	@Test
	void testAddCar() {
		// when
		Car newCar = new Car("붕붕이");
		cars.addCar(newCar);
		// then
		assertThat(cars.getCar(0)).isEqualTo(newCar);
	}

	@ParameterizedTest
	@CsvSource(value = {"붕붕, 씽씽, 2"})
	void testGetCarsSize(String name1, String name2, int size) {
		// given
		cars.addCar(new Car(name1));
		cars.addCar(new Car(name2));
		// when
		int carsSize = cars.getCarsSize();
		// then
		assertEquals(size, carsSize);
	}

	@ParameterizedTest
	@CsvSource(value = {"붕붕, 씽씽, 2"})
	void getGetCar(String name1, String name2, int size) {
		// given
		Car firstCar = new Car(name1);
		Car secondCar = new Car(name2);
		cars.addCar(firstCar);
		cars.addCar(secondCar);
		// when
		Car car1 = cars.getCar(0);
		Car car2 = cars.getCar(1);
		// then
		assertEquals(firstCar, car1);
		assertEquals(secondCar, car2);
	}
}