/**
 * Класс исключений, возникающих при вводе некорректного выражения
 */
public class IncorrectInputException extends Exception {

	public IncorrectInputException() {
	}

	public IncorrectInputException(String message) {
		super(message);
	}

	public IncorrectInputException(Throwable cause) {
		super(cause);
	}

	public IncorrectInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectInputException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
