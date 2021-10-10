package domain;

public enum ErrorCode {
	NAME_ERROR("[ERROR] 이름은 5자 이하만 가능합니다.");

	private final String message;

	ErrorCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
