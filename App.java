/**
 * 
 */
package Week05CodingAssignment;

/**
 * This app uses the Logger interface to enforce compliance of two classes,
 * asteriskLogger and spacedLogger.
 */
public class App {

	/**
	 * First, instantiate each class.
	 */
	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();

		/*
		 * Printing a line to identify the action, then sending the word "Hello" to the log
		 * method in the asteriskLogger class to be processed. That method formats and
		 * prints the log message.
		 */
		System.out.println("Testing AsteriskLogger:");
		asteriskLogger.log("Hello");

		/*
		 * I added a blank line just to make the printout easier to view, then invoked 
		 * the error method in the asteriskLogger class to get a printout of the formatted 
		 * error message.
		 */
		System.out.println("\n");
		asteriskLogger.error("Funny");

		/*
		 * I added a line return here, as well, for ease of reading the results. Then
		 * invoked the log method of the spacedLogger class to get a printout of
		 * the log message formatted with spaces between each letter.
		 */
		System.out.println("\nTesting SpacedLogger:");
		spacedLogger.log("Longword");

		/*
		 * Finally, I invoke the error method of the spacedLogger class to get a
		 * printout of the error message formatted with spaces between each letter and
		 * prefaced with "Error: ".
		 */
		spacedLogger.error("spaced");
	}
}
