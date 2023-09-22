/**
 * 
 */
package in.wordofgod.utils.romanize;

/**
 * 
 */
public class Romanize {

	public static String languageCode;
	public static String inputFilePath;
	public static String outputFilePath;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (!validateInput(args)) {
			return;
		}

		switch (languageCode.toUpperCase()) {
		case Constants.LANGUAGE_CODE_TAMIL:
			RomanizeTamil.romanize();
			break;

		case Constants.LANGUAGE_NAME_TAMIL:
			RomanizeTamil.romanize();
			break;

		default:
			System.out.println("Given language or format is not supported...");
			printHelpMessage();
			break;
		}
	}

	private static boolean validateInput(String[] args) {
		if (args.length < 2) {
			System.out.println("Please give the required parameters...");
			printHelpMessage();
			return false;
		} else {
			languageCode = args[0];
			inputFilePath = args[1];

			outputFilePath = stripExtension() + "-romanized.txt";
		}
		return true;
	}

	private static String stripExtension() {
		return inputFilePath != null && inputFilePath.lastIndexOf(".") > 0
				? inputFilePath.substring(0, inputFilePath.lastIndexOf("."))
				: inputFilePath;
	}

	public static void printHelpMessage() {
		System.out.println("\nHelp on Usage of this program:");
		System.out.println("\nSupported languages:\n\t1. Tamil (use the language code ta)");
		System.out.println(
				"This program supports only plain text files, not word documents or not PDFs or not any other formats.");
		System.out.println("Just keep the text in plain text file using notepad or any other text editors.");
		System.out.println("Extenstion can be just .txt");
		System.out.println(
				"\nSyntax to run this program:\njava -jar romanization-transliteration-utils.jar <LANGUAGE-CODE> <INPUT-FILE-PATH-WITH-TEXT-TO-BE-CONVERTED>\n\n");
		System.out.println("Example: java -jar romanization-transliteration-utils.jar ta C:/sample-input-file.txt");
		System.out.println("In the above example \"ta\" represents Tamil language");
		System.out.println("Use / in the input file path. Do not use \\");
	}

}
