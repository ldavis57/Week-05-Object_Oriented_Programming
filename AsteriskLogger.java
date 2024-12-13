package Week05CodingAssignment;

/**
 * Added 'implements Logger' to use the Logger interface and confirmed creating 
 * required log and error methods.
 */
public class AsteriskLogger implements Logger {

	/*
	 * Formatting the printout of the message with three asterisks before and after
	 * the message.
	 */ @Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

	/*
	 * Formatting the message with a line of asterisks the length of the message,
	 * the message preceded by three asterisks and the word 'Error: ' on a new line,
	 * followed by another border on a new line.
	 */ @Override
	public void error(String message) {
		String errorMessage = "***Error: " + message + "***";
		String border = "*".repeat(errorMessage.length());
		System.out.println(border);
		System.out.println(errorMessage);
		System.out.println(border);
	}
}
