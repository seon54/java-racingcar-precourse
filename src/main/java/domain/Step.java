package domain;

import static domain.Constant.*;
import static domain.ErrorCode.*;

import java.util.Collections;

public class Step {

	private int result;

	public Step() {
		result = 0;
	}

	public void addRandomNumber(int number) {
		validate(number);
		if (isMovable(number)) {
			result++;
		}
	}

	private void validate(int number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException(NUMBER_ERROR.getMessage());
		}
	}

	private boolean isMovable(int number) {
		return number >= MOVABLE_NUMBER;
	}

	public String getResult() {
		return String.join("", Collections.nCopies(result, "-"));
	}
}
