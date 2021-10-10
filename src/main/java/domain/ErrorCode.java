package domain;

public enum ErrorCode {
	NAME_ERROR("[ERROR] 이름은 5자 이하만 가능합니다."),
	NUMBER_ERROR("[ERROR] 숫자는 0에서 9사이어야 합니다.");

	private final String message;

	ErrorCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
