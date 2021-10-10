package domain;

import static domain.ErrorCode.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	@DisplayName("자동차 이름은 5자 이하만 가능하다.")
	void testNameLength() {
		// given
		Car car = new Car("새미");

		// when
		String name = car.getName();

		// then
		assertEquals("새미", name);
	}

	@Test
	@DisplayName("자동차 이름이 5 초과일 경우 에러 발생")
	void testFailWithInvalidName() {
		// given & when
		IllegalArgumentException exception = assertThrows(
			IllegalArgumentException.class, () -> new Car("엄청빠른자동차")
		);

		// then
		assertEquals(NAME_ERROR.getMessage(), exception.getMessage());
	}
}
