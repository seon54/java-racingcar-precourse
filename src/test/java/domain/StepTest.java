package domain;

import static domain.ErrorCode.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StepTest {
	@DisplayName("숫자는 0-9 사이어야 한다.")
	@ParameterizedTest
	@ValueSource(ints = {0, 9})
	void testNumberRange(int value) {
		// given
		Step step = new Step(value);

		// when
		int number = step.getNumber();

		// then
		assertEquals(value, number);

	}

	@DisplayName("숫자가 0-9 범위가 아니면 예외 발생")
	@ParameterizedTest
	@ValueSource(ints = {-1, 10})
	void testFailWithInvalidNumber(int number) {
		// given & when
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Step(number));

		// then
		assertEquals(NUMBER_ERROR.getMessage(), exception.getMessage());
	}

	@DisplayName("4 이상 9 이하의 숫자는 움직일 수 있다")
	@ParameterizedTest
	@ValueSource(ints = {4, 9})
	void testMove(int number) {
		// given
		Step step = new Step(number);

		// when
		boolean result = step.isMovable();

		// then
		assertTrue(result);
	}

	@DisplayName("0-3 사이의 숫자는 움직일 수 없다")
	@ParameterizedTest
	@ValueSource(ints = {0, 3})
	void testMoveFail(int number) {
		// given
		Step step = new Step(number);

		// when
		boolean result = step.isMovable();

		// then
		assertFalse(result);
	}
}
