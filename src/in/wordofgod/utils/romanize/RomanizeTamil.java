/**
 * 
 */
package in.wordofgod.utils.romanize;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;

/**
 * 
 */
public class RomanizeTamil {

	public static void romanize() {
		System.out.println("Romanization or Translitration for Tamil language is started...");
		String fileContent = null;
		try {
			fileContent = FileUtils.readFileToString(new File(Romanize.inputFilePath), "UTF-8");
			System.out.println("Given file loaded successfully...");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("Applying rules for numbers...");
		for (Entry<String, String> item : TamilAlphabets.numbers.entrySet()) {
			fileContent = fileContent.replaceAll(item.getKey(), item.getValue());
		}
		System.out.println("Applying rules for special letters/alphabets...");
		for (Entry<String, String> item : TamilAlphabets.specialLetters.entrySet()) {
			fileContent = fileContent.replaceAll(item.getKey(), item.getValue());
		}
		System.out.println("Applying rules for alphabets...");
		for (Entry<String, String> item : TamilAlphabets.alphabets.entrySet()) {
			fileContent = fileContent.replaceAll(item.getKey(), item.getValue());
		}
		String[] lines = fileContent.split("\n");
		StringBuilder sb = new StringBuilder();
		for (String line : lines) {
			sb.append(capitalizeFirstLetter(line)).append("\n");
		}
		System.out.println(sb.toString());
		File file = new File(Romanize.outputFilePath);
		try {
			FileUtils.write(file, sb.toString(), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Romanization or Translitration for Tamil language is completed...");
		System.out.println("Result is stored at: " + Romanize.outputFilePath);
	}

	public static String capitalizeFirstLetter(String str) {

		if (str == null || str.length() == 0)
			return str;

		return str.substring(0, 1).toUpperCase() + str.substring(1);

	}
}
