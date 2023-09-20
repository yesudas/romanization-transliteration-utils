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
		System.out.println(fileContent);
		File file = new File(Romanize.outputFilePath);
		try {
			FileUtils.write(file, fileContent, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Romanization or Translitration for Tamil language is completed...");
		System.out.println("Result is stored at: " + Romanize.outputFilePath);
	}
}
