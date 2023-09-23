/**
 * 
 */
package in.wordofgod.utils.romanize;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 */
public class TamilAlphabets {

	public static Map<String, String> alphabets = new LinkedHashMap<String, String>();
	public static Map<String, String> specialLetters = new LinkedHashMap<String, String>();
	public static Map<String, String> numbers = new LinkedHashMap<String, String>();

	static {

		// Numbers
		numbers.put("௧", "1");
		numbers.put("௨", "2");
		numbers.put("௩", "3");
		numbers.put("௪", "4");
		numbers.put("௫", "5");
		numbers.put("௬", "6");
		numbers.put("௭", "7");
		numbers.put("௮", "8");
		numbers.put("௯", "9");
		numbers.put("௰", "10");
		numbers.put("௱", "100");
		numbers.put("௲", "1000");

		// Special letters
		specialLetters.put("ஸ்ரீ", "shri");
		specialLetters.put("௳", "naal");
		specialLetters.put("௴", "maadham");
		specialLetters.put("௵", "varudam");
		specialLetters.put("௶", "patru");
		specialLetters.put("௷", "varavu");
		specialLetters.put("௸", "maelullabadi");
		specialLetters.put("௹", "ruubaai");
		specialLetters.put("௺", "enn");
		// specialLetters.put("ள", "neram");
		// specialLetters.put("வ", "ennikkai");

		// Alphabets
		alphabets.put(" அ ", "a");
		alphabets.put(" ஆ ", "aa");
		alphabets.put(" இ ", "i");
		alphabets.put(" ஈ ", "ii");
		alphabets.put(" உ ", "u");
		alphabets.put(" ஊ ", "uu");
		alphabets.put(" எ ", "e");
		alphabets.put(" ஏ ", "ae");
		alphabets.put(" ஐ ", "ai");
		alphabets.put(" ஒ ", "o");
		alphabets.put(" ஓ ", "oo");
		alphabets.put(" ஔ ", "au");
		alphabets.put(" ஃ ", "akku");

		alphabets.put("அ ", "a");
		alphabets.put("ஆ ", "aa");
		alphabets.put("இ ", "i");
		alphabets.put("ஈ ", "ii");
		alphabets.put("உ ", "u");
		alphabets.put("ஊ ", "uu");
		alphabets.put("எ ", "e");
		alphabets.put("ஏ ", "ae");
		alphabets.put("ஐ ", "ai");
		alphabets.put("ஒ ", "o");
		alphabets.put("ஓ ", "oo");
		alphabets.put("ஔ ", "au");
		alphabets.put("ஃ ", "akku");

		// Selected words or joint alphabets for special cases
		alphabets.put("பூமி", "buumi");
		alphabets.put("வாடி", "vaadi");
		// alphabets.put("டாக", "daaga");

		// Joint alphabets
		alphabets.put(" தேவா", "devaa");
		alphabets.put(" தேவி", "devi");
		alphabets.put(" தேவீ", "devii");
		alphabets.put(" தேவு", "devu");
		alphabets.put(" தேவூ", "devuu");
		alphabets.put(" தேவெ", "deve");
		alphabets.put(" தேவே", "devae");
		alphabets.put(" தேவை", "devai");
		alphabets.put(" தேவொ", "devo");
		alphabets.put(" தேவோ", "devoo");
		alphabets.put(" தேவௌ", "devau");
		alphabets.put(" தேவ்", "dev");
		alphabets.put(" தேவ", " Deva");
		
		alphabets.put("ங்கா", "ngaa");
		alphabets.put("ங்கி", "ngi");
		alphabets.put("ங்கீ", "ngii");
		alphabets.put("ங்கு", "ngu");
		alphabets.put("ங்கூ", "nguu");
		alphabets.put("ங்கெ", "nge");
		alphabets.put("ங்கே", "ngae");
		alphabets.put("ங்கை", "ngai");
		alphabets.put("ங்கொ", "ngo");
		alphabets.put("ங்கோ", "ngoo");
		alphabets.put("ங்கௌ", "ngau");
		alphabets.put("ங்க்", "ng");

		alphabets.put("ஞ்சா", "njaa");
		alphabets.put("ஞ்சி", "nji");
		alphabets.put("ஞ்சீ", "njii");
		alphabets.put("ஞ்சு", "nju");
		alphabets.put("ஞ்சூ", "njuu");
		alphabets.put("ஞ்செ", "nje");
		alphabets.put("ஞ்சே", "njae");
		alphabets.put("ஞ்சை", "njai");
		alphabets.put("ஞ்சொ", "njo");
		alphabets.put("ஞ்சோ", "njoo");
		alphabets.put("ஞ்சௌ", "njau");
		alphabets.put("ஞ்ச்", "nj");

		alphabets.put("ண்டா", "ndaa");
		alphabets.put("ண்டி", "ndi");
		alphabets.put("ண்டீ", "ndii");
		alphabets.put("ண்டு", "ndu");
		alphabets.put("ண்டூ", "nduu");
		alphabets.put("ண்டெ", "nde");
		alphabets.put("ண்டே", "ndae");
		alphabets.put("ண்டை", "ndai");
		alphabets.put("ண்டொ", "ndo");
		alphabets.put("ண்டோ", "ndoo");
		alphabets.put("ண்டௌ", "ndau");
		alphabets.put("ண்ட்", "nd");

		alphabets.put("ந்தா", "ndhaa");
		alphabets.put("ந்தி", "ndhi");
		alphabets.put("ந்தீ", "ndhii");
		alphabets.put("ந்து", "ndhu");
		alphabets.put("ந்தூ", "ndhuu");
		alphabets.put("ந்தெ", "ndhe");
		alphabets.put("ந்தே", "ndhae");
		alphabets.put("ந்தை", "ndhai");
		alphabets.put("ந்தொ", "ndho");
		alphabets.put("ந்தோ", "ndhoo");
		alphabets.put("ந்தௌ", "ndhau");
		alphabets.put("ந்த்", "ndh");

		alphabets.put("ம்பா", "mbaa");
		alphabets.put("ம்பி", "mbi");
		alphabets.put("ம்பீ", "mbii");
		alphabets.put("ம்பு", "mbu");
		alphabets.put("ம்பூ", "mbuu");
		alphabets.put("ம்பெ", "mbe");
		alphabets.put("ம்பே", "mbae");
		alphabets.put("ம்பை", "mbai");
		alphabets.put("ம்பொ", "mbo");
		alphabets.put("ம்போ", "mboo");
		alphabets.put("ம்பௌ", "mbau");
		alphabets.put("ம்ப்", "mb");

		alphabets.put("ன்பா", "nbaa");
		alphabets.put("ன்பி", "nbi");
		alphabets.put("ன்பீ", "nbii");
		alphabets.put("ன்பு", "nbu");
		alphabets.put("ன்பூ", "nbuu");
		alphabets.put("ன்பெ", "nbe");
		alphabets.put("ன்பே", "nbae");
		alphabets.put("ன்பை", "nbai");
		alphabets.put("ன்பொ", "nbo");
		alphabets.put("ன்போ", "nboo");
		alphabets.put("ன்பௌ", "nbau");
		alphabets.put("ன்ப்", "nb");

		alphabets.put("ன்றா", "nRaa");
		alphabets.put("ன்றி", "nRi");
		alphabets.put("ன்றீ", "nRii");
		alphabets.put("ன்று", "nRu");
		alphabets.put("ன்றூ", "nRuu");
		alphabets.put("ன்றெ", "nRe");
		alphabets.put("ன்றே", "nRae");
		alphabets.put("ன்றை", "nRai");
		alphabets.put("ன்றொ", "nRo");
		alphabets.put("ன்றோ", "nRoo");
		alphabets.put("ன்றௌ", "nRau");
		alphabets.put("ன்ற்", "nR");

		alphabets.put("மாகா", "maagaa");
		alphabets.put("மாகி", "maagi");
		alphabets.put("மாகீ", "maagii");
		alphabets.put("மாகு", "maagu");
		alphabets.put("மாகூ", "maaguu");
		alphabets.put("மாகெ", "maage");
		alphabets.put("மாகே", "maagae");
		alphabets.put("மாகை", "maagai");
		alphabets.put("மாகொ", "maago");
		alphabets.put("மாகோ", "maagoo");
		alphabets.put("மாகௌ", "maagau");

		alphabets.put("மகா", "magaa");
		alphabets.put("மகி", "magi");
		alphabets.put("மகீ", "magii");
		alphabets.put("மகு", "magu");
		alphabets.put("மகூ", "maguu");
		alphabets.put("மகெ", "mage");
		alphabets.put("மகே", "magae");
		alphabets.put("மகை", "magai");
		alphabets.put("மகொ", "mago");
		alphabets.put("மகோ", "magoo");
		alphabets.put("மகௌ", "magau");

		alphabets.put("பாகா", "paagaa");
		alphabets.put("பாகி", "paagi");
		alphabets.put("பாகீ", "paagii");
		alphabets.put("பாகு", "paagu");
		alphabets.put("பாகூ", "paaguu");
		alphabets.put("பாகெ", "paage");
		alphabets.put("பாகே", "paagae");
		alphabets.put("பாகை", "paagai");
		alphabets.put("பாகொ", "paago");
		alphabets.put("பாகோ", "paagoo");
		alphabets.put("பாகௌ", "paagau");

		alphabets.put("பகா", "pagaa");
		alphabets.put("பகி", "pagi");
		alphabets.put("பகீ", "pagii");
		alphabets.put("பகு", "pagu");
		alphabets.put("பகூ", "paguu");
		alphabets.put("பகெ", "page");
		alphabets.put("பகே", "pagae");
		alphabets.put("பகை", "pagai");
		alphabets.put("பகொ", "pago");
		alphabets.put("பகோ", "pagoo");
		alphabets.put("பகௌ", "pagau");

		alphabets.put("ஆகா", "aagaa");
		alphabets.put("ஆகி", "aagi");
		alphabets.put("ஆகீ", "aagii");
		alphabets.put("ஆகு", "aagu");
		alphabets.put("ஆகூ", "aaguu");
		alphabets.put("ஆகெ", "aage");
		alphabets.put("ஆகே", "aagae");
		alphabets.put("ஆகை", "aagai");
		alphabets.put("ஆகொ", "aago");
		alphabets.put("ஆகோ", "aagoo");
		alphabets.put("ஆகௌ", "aagau");

		// Additional joint alphabets with English letter variations for easy reading
		alphabets.put("ட்டா", "ttaa");
		alphabets.put("ட்டி", "tti");
		alphabets.put("ட்டீ", "ttii");
		alphabets.put("ட்டு", "ttu");
		alphabets.put("ட்டூ", "ttuu");
		alphabets.put("ட்டெ", "tte");
		alphabets.put("ட்டே", "ttae");
		alphabets.put("ட்டை", "ttai");
		alphabets.put("ட்டொ", "tto");
		alphabets.put("ட்டோ", "ttoo");
		alphabets.put("ட்டௌ", "ttau");

		alphabets.put("த்தா", "tthaa");
		alphabets.put("த்தி", "tthi");
		alphabets.put("த்தீ", "tthii");
		alphabets.put("த்து", "tthu");
		alphabets.put("த்தூ", "tthuu");
		alphabets.put("த்தெ", "tthe");
		alphabets.put("த்தே", "tthae");
		alphabets.put("த்தை", "tthai");
		alphabets.put("த்தொ", "ttho");
		alphabets.put("த்தோ", "tthoo");
		alphabets.put("த்தௌ", "tthau");

		alphabets.put("ச் ", "ch");
		alphabets.put("ச்சா", "chaa");
		alphabets.put("ச்சி", "chi");
		alphabets.put("ச்சீ", "chii");
		alphabets.put("ச்சு", "chu");
		alphabets.put("ச்சூ", "chuu");
		alphabets.put("ச்செ", "che");
		alphabets.put("ச்சே", "chae");
		alphabets.put("ச்சை", "chai");
		alphabets.put("ச்சொ", "cho");
		alphabets.put("ச்சோ", "choo");
		alphabets.put("ச்சௌ", "chau");

		alphabets.put("ண்ணா", "nnaa");
		alphabets.put("ண்ணி", "nni");
		alphabets.put("ண்ணீ", "nnii");
		alphabets.put("ண்ணு", "nnu");
		alphabets.put("ண்ணூ", "nnuu");
		alphabets.put("ண்ணெ", "nne");
		alphabets.put("ண்ணே", "nnae");
		alphabets.put("ண்ணை", "nnai");
		alphabets.put("ண்ணொ", "nno");
		alphabets.put("ண்ணோ", "nnoo");
		alphabets.put("ண்ணௌ", "nnau");

		alphabets.put("ஃஜா", "zaa");
		alphabets.put("ஃஜி", "zi");
		alphabets.put("ஃஜீ", "zii");
		alphabets.put("ஃஜு", "zu");
		alphabets.put("ஃஜூ", "zuu");
		alphabets.put("ஃஜெ", "ze");
		alphabets.put("ஃஜே", "zae");
		alphabets.put("ஃஜை", "zai");
		alphabets.put("ஃஜொ", "zo");
		alphabets.put("ஃஜோ", "zoo");
		alphabets.put("ஃஜௌ", "zau");
		alphabets.put("ஃஜ்", "z");

		alphabets.put("ஃகா", "khaa");
		alphabets.put("ஃகி", "khi");
		alphabets.put("ஃகீ", "khii");
		alphabets.put("ஃகு", "khu");
		alphabets.put("ஃகூ", "khuu");
		alphabets.put("ஃகெ", "khe");
		alphabets.put("ஃகே", "khae");
		alphabets.put("ஃகை", "khai");
		alphabets.put("ஃகொ", "kho");
		alphabets.put("ஃகோ", "khoo");
		alphabets.put("ஃகௌ", "khau");
		alphabets.put("ஃக்", "kh");

		alphabets.put("ஃபா", "faa");
		alphabets.put("ஃபி", "fi");
		alphabets.put("ஃபீ", "fii");
		alphabets.put("ஃபு", "fu");
		alphabets.put("ஃபூ", "fuu");
		alphabets.put("ஃபெ", "fe");
		alphabets.put("ஃபே", "fae");
		alphabets.put("ஃபை", "fai");
		alphabets.put("ஃபொ", "fo");
		alphabets.put("ஃபோ", "foo");
		alphabets.put("ஃபௌ", "fau");
		alphabets.put("ஃப்", "f");

		alphabets.put("ஃவா", "vaa");
		alphabets.put("ஃவி", "vi");
		alphabets.put("ஃவீ", "vii");
		alphabets.put("ஃவு", "vu");
		alphabets.put("ஃவூ", "vuu");
		alphabets.put("ஃவெ", "ve");
		alphabets.put("ஃவே", "vae");
		alphabets.put("ஃவை", "vai");
		alphabets.put("ஃவொ", "vo");
		alphabets.put("ஃவோ", "voo");
		alphabets.put("ஃவௌ", "vau");
		alphabets.put("ஃவ்", "v");

		alphabets.put("ஃஷா", "kshaa");
		alphabets.put("ஃஷி", "kshi");
		alphabets.put("ஃஷீ", "kshii");
		alphabets.put("ஃஷு", "kshu");
		alphabets.put("ஃஷூ", "kshuu");
		alphabets.put("ஃஷெ", "kshe");
		alphabets.put("ஃஷே", "kshae");
		alphabets.put("ஃஷை", "kshai");
		alphabets.put("ஃஷொ", "ksho");
		alphabets.put("ஃஷோ", "kshoo");
		alphabets.put("ஃஷௌ", "kshau");
		alphabets.put("ஃஷ்", "ksh");

		alphabets.put("ஃஸா", "kSaa");
		alphabets.put("ஃஸி", "kSi");
		alphabets.put("ஃஸீ", "kSii");
		alphabets.put("ஃஸு", "kSu");
		alphabets.put("ஃஸூ", "kSuu");
		alphabets.put("ஃஸெ", "kSe");
		alphabets.put("ஃஸே", "kSae");
		alphabets.put("ஃஸை", "kSai");
		alphabets.put("ஃஸொ", "kSo");
		alphabets.put("ஃஸோ", "kSoo");
		alphabets.put("ஃஸௌ", "kSau");
		alphabets.put("ஃஸ்", "kS");

		alphabets.put("ஃஹா", "Haa");
		alphabets.put("ஃஹி", "Hi");
		alphabets.put("ஃஹீ", "Hii");
		alphabets.put("ஃஹு", "Hu");
		alphabets.put("ஃஹூ", "Huu");
		alphabets.put("ஃஹெ", "He");
		alphabets.put("ஃஹே", "Hae");
		alphabets.put("ஃஹை", "Hai");
		alphabets.put("ஃஹொ", "Ho");
		alphabets.put("ஃஹோ", "Hoo");
		alphabets.put("ஃஹௌ", "Hau");
		alphabets.put("ஃஹ்", "H");

		alphabets.put("ஃதா", "Thaa");
		alphabets.put("ஃதி", "Thi");
		alphabets.put("ஃதீ", "Thii");
		alphabets.put("ஃது", "Thu");
		alphabets.put("ஃதூ", "Thuu");
		alphabets.put("ஃதெ", "The");
		alphabets.put("ஃதே", "Thae");
		alphabets.put("ஃதை", "Thai");
		alphabets.put("ஃதொ", "Tho");
		alphabets.put("ஃதோ", "Thoo");
		alphabets.put("ஃதௌ", "Thau");
		alphabets.put("ஃத்", "Th");

		alphabets.put("ற்றா", "tRaa");
		alphabets.put("ற்றி", "tRi");
		alphabets.put("ற்றீ", "tRii");
		alphabets.put("ற்று", "tRu");
		alphabets.put("ற்றூ", "tRuu");
		alphabets.put("ற்றெ", "tRe");
		alphabets.put("ற்றே", "tRae");
		alphabets.put("ற்றை", "tRai");
		alphabets.put("ற்றொ", "tRo");
		alphabets.put("ற்றோ", "tRoo");
		alphabets.put("ற்றௌ", "tRau");

		alphabets.put("ஃத", "Tha");
		alphabets.put("ஃஹ", "Ha");
		alphabets.put("ஃஸ", "kSa");
		alphabets.put("ஃஷ", "ksha");
		alphabets.put("ஃவ", "va");
		alphabets.put("ஃப", "fa");
		alphabets.put("ஃக", "kha");
		alphabets.put("ஃஜ", "za");
		alphabets.put("ச்ச", "cha");
		alphabets.put("த்த", "ttha");
		alphabets.put("ன்ற", "nRa");
		alphabets.put("ம்ப", "mba");
		alphabets.put("ன்ப", "mba");
		alphabets.put("ந்த", "ndha");
		alphabets.put("ண்ட", "nda");
		alphabets.put("ஞ்ச", "nja");
		alphabets.put("ங்க", "nga");

		alphabets.put("கா", "kaa");
		alphabets.put("கி", "ki");
		alphabets.put("கீ", "kii");
		alphabets.put("கு", "ku");
		alphabets.put("கூ", "kuu");
		alphabets.put("கெ", "ke");
		alphabets.put("கே", "kae");
		alphabets.put("கை", "kai");
		alphabets.put("கொ", "ko");
		alphabets.put("கோ", "koo");
		alphabets.put("கௌ", "kau");
		alphabets.put("க்", "k");

		alphabets.put("ஙா", "ngaa");
		alphabets.put("ஙி", "ngi");
		alphabets.put("ஙீ", "ngii");
		alphabets.put("ஙு", "ngu");
		alphabets.put("ஙூ", "nguu");
		alphabets.put("ஙெ", "nge");
		alphabets.put("ஙே", "ngae");
		alphabets.put("ஙை", "ngai");
		alphabets.put("ஙொ", "ngo");
		alphabets.put("ஙோ", "ngoo");
		alphabets.put("ஙௌ", "ngau");
		alphabets.put("ங்", "ng");

		alphabets.put("ஞா", "njaa");
		alphabets.put("ஞி", "nji");
		alphabets.put("ஞீ", "njii");
		alphabets.put("ஞு", "nju");
		alphabets.put("ஞூ", "njuu");
		alphabets.put("ஞெ", "nje");
		alphabets.put("ஞே", "njae");
		alphabets.put("ஞை", "njai");
		alphabets.put("ஞொ", "njo");
		alphabets.put("ஞோ", "njoo");
		alphabets.put("ஞௌ", "njau");
		alphabets.put("ஞ்", "nj");

		alphabets.put("டா", "daa");
		alphabets.put("டி", "di");
		alphabets.put("டீ", "dii");
		alphabets.put("டு", "du");
		alphabets.put("டூ", "duu");
		alphabets.put("டெ", "de");
		alphabets.put("டே", "dae");
		alphabets.put("டை", "dai");
		alphabets.put("டொ", "do");
		alphabets.put("டோ", "doo");
		alphabets.put("டௌ", "dau");
		alphabets.put("ட்", "t");

		alphabets.put("ணா", "Naa");
		alphabets.put("ணி", "Ni");
		alphabets.put("ணீ", "Nii");
		alphabets.put("ணு", "Nu");
		alphabets.put("ணூ", "Nuu");
		alphabets.put("ணெ", "Ne");
		alphabets.put("ணே", "Nae");
		alphabets.put("ணை", "Nai");
		alphabets.put("ணொ", "No");
		alphabets.put("ணோ", "Noo");
		alphabets.put("ணௌ", "Nau");
		alphabets.put("ண்", "N");

		alphabets.put("நா", "na");
		alphabets.put("நி", "ni");
		alphabets.put("நீ", "nii");
		alphabets.put("நு", "nu");
		alphabets.put("நூ", "nuu");
		alphabets.put("நெ", "ne");
		alphabets.put("நே", "nae");
		alphabets.put("நை", "nai");
		alphabets.put("நொ", "no");
		alphabets.put("நோ", "noo");
		alphabets.put("நௌ", "nau");
		alphabets.put("ந்", "n");

		// alphabets.put("நா", "nha");
		// alphabets.put("நி", "nhi");
		// alphabets.put("நீ", "nhii");
		// alphabets.put("நு", "nhu");
		// alphabets.put("நூ", "nhuu");
		// alphabets.put("நெ", "nhe");
		// alphabets.put("நே", "nhae");
		// alphabets.put("நை", "nhai");
		// alphabets.put("நொ", "nho");
		// alphabets.put("நோ", "nhoo");
		// alphabets.put("நௌ", "nhau");
		// alphabets.put("ந்", "nh");

		alphabets.put("னா", "naa");
		alphabets.put("னி", "ni");
		alphabets.put("னீ", "nii");
		alphabets.put("னு", "nu");
		alphabets.put("னூ", "nuu");
		alphabets.put("னெ", "ne");
		alphabets.put("னே", "nae");
		alphabets.put("னை", "nai");
		alphabets.put("னொ", "no");
		alphabets.put("னோ", "noo");
		alphabets.put("னௌ", "nau");
		alphabets.put("ன்", "n");

		alphabets.put("தா", "thaa");
		alphabets.put("தி", "thi");
		alphabets.put("தீ", "thii");
		alphabets.put("து", "thu");
		alphabets.put("தூ", "thuu");
		alphabets.put("தெ", "the");
		alphabets.put("தே", "thae");
		alphabets.put("தை", "thai");
		alphabets.put("தொ", "tho");
		alphabets.put("தோ", "thoo");
		alphabets.put("தௌ", "thau");
		alphabets.put("த்", "th");

		alphabets.put("பா", "paa");
		alphabets.put("பி", "pi");
		alphabets.put("பீ", "pii");
		alphabets.put("பு", "pu");
		alphabets.put("பூ", "puu");
		alphabets.put("பெ", "pe");
		alphabets.put("பே", "pae");
		alphabets.put("பை", "pai");
		alphabets.put("பொ", "po");
		alphabets.put("போ", "poo");
		alphabets.put("பௌ", "pau");
		alphabets.put("ப்", "p");

		alphabets.put("மா", "maa");
		alphabets.put("மி", "mi");
		alphabets.put("மீ", "mii");
		alphabets.put("மு", "mu");
		alphabets.put("மூ", "muu");
		alphabets.put("மெ", "me");
		alphabets.put("மே", "mae");
		alphabets.put("மை", "mai");
		alphabets.put("மொ", "mo");
		alphabets.put("மோ", "moo");
		alphabets.put("மௌ", "mau");
		alphabets.put("ம்", "m");

		alphabets.put("யா", "yaa");
		alphabets.put("யி", "yi");
		alphabets.put("யீ", "yii");
		alphabets.put("யு", "yu");
		alphabets.put("யூ", "yuu");
		alphabets.put("யெ", "ye");
		alphabets.put("யே", "yae");
		alphabets.put("யை", "yai");
		alphabets.put("யொ", "yo");
		alphabets.put("யோ", "yoo");
		alphabets.put("யௌ", "yau");
		alphabets.put("ய்", "i");

		alphabets.put("லா", "laa");
		alphabets.put("லி", "li");
		alphabets.put("லீ", "lii");
		alphabets.put("லு", "lu");
		alphabets.put("லூ", "luu");
		alphabets.put("லெ", "le");
		alphabets.put("லே", "lae");
		alphabets.put("லை", "lai");
		alphabets.put("லொ", "lo");
		alphabets.put("லோ", "loo");
		alphabets.put("லௌ", "lau");
		alphabets.put("ல்", "l");

		alphabets.put("ழா", "zhaa");
		alphabets.put("ழி", "zhi");
		alphabets.put("ழீ", "zhii");
		alphabets.put("ழு", "zhu");
		alphabets.put("ழூ", "zhuu");
		alphabets.put("ழெ", "zhe");
		alphabets.put("ழே", "zhae");
		alphabets.put("ழை", "zhai");
		alphabets.put("ழொ", "zho");
		alphabets.put("ழோ", "zhoo");
		alphabets.put("ழௌ", "zhau");
		alphabets.put("ழ்", "zh");

		alphabets.put("ளா", "Laa");
		alphabets.put("ளி", "Li");
		alphabets.put("ளீ", "Lii");
		alphabets.put("ளு", "Lu");
		alphabets.put("ளூ", "Luu");
		alphabets.put("ளெ", "Le");
		alphabets.put("ளே", "Lae");
		alphabets.put("ளை", "Lai");
		alphabets.put("ளொ", "Lo");
		alphabets.put("ளோ", "Loo");
		alphabets.put("ளௌ", "Lau");
		alphabets.put("ள்", "L");

		alphabets.put("வா", "vaa");
		alphabets.put("வி", "vi");
		alphabets.put("வீ", "vii");
		alphabets.put("வு", "vu");
		alphabets.put("வூ", "vuu");
		alphabets.put("வெ", "ve");
		alphabets.put("வே", "vae");
		alphabets.put("வை", "vai");
		alphabets.put("வொ", "vo");
		alphabets.put("வோ", "voo");
		alphabets.put("வௌ", "vau");
		alphabets.put("வ்", "v");

		alphabets.put("ரா", "raa");
		alphabets.put("ரி", "ri");
		alphabets.put("ரீ", "rii");
		alphabets.put("ரு", "ru");
		alphabets.put("ரூ", "ruu");
		alphabets.put("ரெ", "re");
		alphabets.put("ரே", "rae");
		alphabets.put("ரை", "rai");
		alphabets.put("ரொ", "ro");
		alphabets.put("ரோ", "roo");
		alphabets.put("ரௌ", "rau");
		alphabets.put("ர்", "r");

		alphabets.put("றா", "Raa");
		alphabets.put("றி", "Ri");
		alphabets.put("றீ", "Rii");
		alphabets.put("று", "Ru");
		alphabets.put("றூ", "Ruu");
		alphabets.put("றெ", "Re");
		alphabets.put("றே", "Rae");
		alphabets.put("றை", "Rai");
		alphabets.put("றொ", "Ro");
		alphabets.put("றோ", "Roo");
		alphabets.put("றௌ", "Rau");
		alphabets.put("ற்", "R");

		alphabets.put("சா", "saa");
		alphabets.put("சி", "si");
		alphabets.put("சீ", "sii");
		alphabets.put("சு", "su");
		alphabets.put("சூ", "suu");
		alphabets.put("செ", "se");
		alphabets.put("சே", "sae");
		alphabets.put("சை", "sai");
		alphabets.put("சொ", "so");
		alphabets.put("சோ", "soo");
		alphabets.put("சௌ", "sau");
		alphabets.put("ச்", "ch");

		alphabets.put("ஶா", "saa");
		alphabets.put("ஶி", "si");
		alphabets.put("ஶீ", "sii");
		alphabets.put("ஶு", "su");
		alphabets.put("ஶூ", "suu");
		alphabets.put("ஶெ", "se");
		alphabets.put("ஶே", "sae");
		alphabets.put("ஶை", "sai");
		alphabets.put("ஶொ", "so");
		alphabets.put("ஶோ", "soo");
		alphabets.put("ஶௌ", "sau");
		alphabets.put("ஶ்", "s");

		alphabets.put("ஜா", "jaa");
		alphabets.put("ஜி", "ji");
		alphabets.put("ஜீ", "jii");
		alphabets.put("ஜு", "ju");
		alphabets.put("ஜூ", "juu");
		alphabets.put("ஜெ", "je");
		alphabets.put("ஜே", "jae");
		alphabets.put("ஜை", "jai");
		alphabets.put("ஜொ", "jo");
		alphabets.put("ஜோ", "joo");
		alphabets.put("ஜௌ", "jau");
		alphabets.put("ஜ்", "j");

		alphabets.put("ஷா", "shaa");
		alphabets.put("ஷி", "shi");
		alphabets.put("ஷீ", "shii");
		alphabets.put("ஷு", "shu");
		alphabets.put("ஷூ", "shuu");
		alphabets.put("ஷெ", "she");
		alphabets.put("ஷே", "shae");
		alphabets.put("ஷை", "shai");
		alphabets.put("ஷொ", "sho");
		alphabets.put("ஷோ", "shoo");
		alphabets.put("ஷௌ", "shau");
		alphabets.put("ஷ்", "sh");

		alphabets.put("ஸா", "Saa");
		alphabets.put("ஸி", "Si");
		alphabets.put("ஸீ", "Sii");
		alphabets.put("ஸு", "Su");
		alphabets.put("ஸூ", "Suu");
		alphabets.put("ஸெ", "Se");
		alphabets.put("ஸே", "Sae");
		alphabets.put("ஸை", "Sai");
		alphabets.put("ஸொ", "So");
		alphabets.put("ஸோ", "Soo");
		alphabets.put("ஸௌ", "Sau");
		alphabets.put("ஸ்", "S");

		alphabets.put("ஹா", "haa");
		alphabets.put("ஹி", "hi");
		alphabets.put("ஹீ", "hii");
		alphabets.put("ஹு", "hu");
		alphabets.put("ஹூ", "huu");
		alphabets.put("ஹெ", "he");
		alphabets.put("ஹே", "hae");
		alphabets.put("ஹை", "hai");
		alphabets.put("ஹொ", "ho");
		alphabets.put("ஹோ", "hoo");
		alphabets.put("ஹௌ", "hau");
		alphabets.put("ஹ்", "h");

		alphabets.put("க்ஷா", "kshaa");
		alphabets.put("க்ஷி", "kshi");
		alphabets.put("க்ஷீ", "kshii");
		alphabets.put("க்ஷு", "kshu");
		alphabets.put("க்ஷூ", "kshuu");
		alphabets.put("க்ஷெ", "kshe");
		alphabets.put("க்ஷே", "kshae");
		alphabets.put("க்ஷை", "kshai");
		alphabets.put("க்ஷொ", "ksho");
		alphabets.put("க்ஷோ", "kshoo");
		alphabets.put("க்ஷௌ", "kshau");
		alphabets.put("க்ஷ்", "ksh");

		// Keep these in the bottom, otherwise it will messup with top replacements

		alphabets.put("பாக", "paaga");
		alphabets.put("பக", "paga");
		alphabets.put("தேவ", "deva");
		alphabets.put("மாக", "maaga");
		alphabets.put("மக", "maga");
		alphabets.put("ஆக", "aaga");

		alphabets.put("க்ஷ", "ksha");
		alphabets.put("ஹ", "ha");
		alphabets.put("ஸ", "Sa");
		alphabets.put("ஷ", "sha");
		alphabets.put("ஜ", "ja");
		alphabets.put("ஶ", "sa");
		alphabets.put("ச", "sa");
		alphabets.put("ற", "Ra");
		alphabets.put("ர", "ra");
		alphabets.put("வ", "va");
		alphabets.put("ள", "La");
		alphabets.put("ழ", "zha");
		alphabets.put("ல", "la");
		alphabets.put("ய", "ya");
		alphabets.put("ம", "ma");
		alphabets.put("ப", "pa");
		alphabets.put("த", "tha");
		alphabets.put("ன", "na");
		alphabets.put("ந", "na");
		alphabets.put("ண", "Na");
		alphabets.put("ட", "da");
		alphabets.put("ஞ", "nja");
		alphabets.put("ங", "nga");
		alphabets.put("க", "ka");

		alphabets.put("அ", "a");
		alphabets.put("ஆ", "aa");
		alphabets.put("இ", "i");
		alphabets.put("ஈ", "ii");
		alphabets.put("உ", "u");
		alphabets.put("ஊ", "uu");
		alphabets.put("எ", "e");
		alphabets.put("ஏ", "ae");
		alphabets.put("ஐ", "ai");
		alphabets.put("ஒ", "o");
		alphabets.put("ஓ", "oo");
		alphabets.put("ஔ", "au");
		alphabets.put("ஃ", "akku");

	}

}
