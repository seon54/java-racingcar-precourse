package domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StepsTest {
	@ParameterizedTest
	@CsvSource({"4, 6", "2, 9"})
	void testGetStepNumbers(int num1, int num2) {
		// given
		Steps steps = new Steps(Arrays.asList(new Step(num1), new Step(num2)));
		// when
		List<Integer> numbers = steps.getStepNumbers();
		// then
		assertThat(numbers).containsAll(Arrays.asList(num1, num2));
	}
}
