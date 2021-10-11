package domain;

import static domain.ErrorCode.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StepTest {

	@DisplayName("숫자는 0-9 사이어야 한다.")
	@ParameterizedTest
	@CsvSource(value = {"0", "9"})
	void testWithValidNumber(int number) {
		// given
		Step step = new Step();
		// when
		step.addRandomNumber(number);
		// then
		assertThat(step).isInstanceOf(Step.class);
	}

	@DisplayName("숫자가 0보다 작거나 9보다 크면 에러가 발생한다.")
	@ParameterizedTest
	@CsvSource(value = {"-1", "10"})
	void testWithInvalidNumber(int number) {
		// given
		Step step = new Step();
		// when & then
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
			() -> step.addRandomNumber(number));
		assertEquals(NUMBER_ERROR.getMessage(), exception.getMessage());
	}

	@Test
	@DisplayName("숫자가 4 이상일 경우 전진")
	void testGetResultPrint() {
		// given
		Step step = new Step();
		step.addRandomNumber(6);
		// when
		String result = step.getPrintResult();
		// then
		assertEquals("-", result);
	}
	@Test
	@DisplayName("숫자가 3 이하일 경우 멈춤")
	void testGetResultPrint2() {
		// given
		Step step = new Step();
		step.addRandomNumber(2);
		// when
		String result = step.getPrintResult();
		// then
		assertEquals("", result);
	}

	@ParameterizedTest
	@CsvSource(value = {"4, 1", "2, 0", "0, 0", "9, 1"})
	void testResultNumber(int number, int result) {
		// given
		Step step = new Step();
		step.addRandomNumber(number);
		// when
		int resultNumber = step.getResultNumber();
		// then
		assertEquals(result, resultNumber);
	}
}