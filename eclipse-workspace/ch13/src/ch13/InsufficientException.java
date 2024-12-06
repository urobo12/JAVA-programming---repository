package ch13;

public class InsufficientException extends Exception{
	public InsufficientException() {
	}

	public InsufficientException(String message) {
		super(message);
	}
}
