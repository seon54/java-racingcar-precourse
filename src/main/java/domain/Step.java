package domain;

import static domain.ErrorCode.*;

public class Step {

	private final int number;

	public Step(int number) {
		validate(number);
		this.number = number;
	}

	private void validate(int number) {
		if (number < 0 || number > 9) {
			throw new IllegalArgumentException(NUMBER_ERROR.getMessage());
		}
	}

	public int getNumber() {
		return number;
	}

	public boolean isMovable() {
		return this.number >= 4;
	}
}
