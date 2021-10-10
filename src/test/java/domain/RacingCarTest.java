package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RacingCarTest {

	@ParameterizedTest
	@CsvSource({"붕붕이, 5, 2, 7"})
	void name(String carName, int num1, int num2, int num3) {
		// given
		Car car = new Car(carName);
		Steps steps = new Steps(Arrays.asList(new Step(num1), new Step(num2), new Step(num3)));
		RacingCar racingCar = new RacingCar(car, steps);

		String name = racingCar.getCarName();
		List<Integer> stepNumbers = racingCar.getStepNumbers();

		assertEquals(carName, name);
		assertThat(stepNumbers).containsAll(Arrays.asList(num1, num2, num3));

	}
}
