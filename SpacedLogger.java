package Week05CodingAssignment;

/**
 * Added 'implements Logger' to use the Logger interface and confirmed creating 
 * required log and error methods.
 */
public class SpacedLogger implements Logger {

	/*
	 * I created a method called addSpaces to manage formatting the printout of the
	 * message in the form 'H e l l o' by adding a space between each letter in the
	 * message. This log method prints the returned formatted message.
	 */
	@Override
	public void log(String message) {
		System.out.println(addSpaces(message));
	}

	/*
	 * I created a method called addSpaces to manage formatting the printout of the
	 * message in the form 'H e l l o' by adding a space between each letter in the
	 * message. The error method adds a preceding "error" to the returned formatted
	 * message.
	 */
	@Override
	public void error(String message) {
		System.out.println("ERROR: " + addSpaces(message));
	}

	/*
	 * Since the printout for each message specified the same format of 'H e l l o'
	 * by adding a space between each letter in the message, I created this method
 	 * which returns the formatted message, from which I also trimmed the extra spaces
	 * start and end.
	 */
	private String addSpaces(String message) {
		return message.replaceAll("", " ").trim();
	}
}
