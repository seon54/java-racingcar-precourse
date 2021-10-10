package domain;

import static domain.ErrorCode.*;

public class Car {

	private final String name;

	public Car(String name) {
		validate(name);
		this.name = name;

	}

	private void validate(String name) {
		if (name.length() < 1 || name.length() > 5) {
			throw new IllegalArgumentException(NAME_ERROR.getMessage());
		}
	}

	public String getName() {
		return this.name;
	}
}
