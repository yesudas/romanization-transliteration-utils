/**
 * 
 */
package in.wordofgod.utils.romanize;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 */
public class HebrewAlphabets {

	public static Map<String, String> alphabets = new LinkedHashMap<String, String>();
	public static Map<String, String> specialLetters = new LinkedHashMap<String, String>();
	public static Map<String, String> numbers = new LinkedHashMap<String, String>();

	static {

		// Numbers
		//numbers.put("௧", "1");

		// Special letters
		//specialLetters.put("ஸ்ரீ", "shri");

		// Alphabets
		//1 ஆலெப்
		alphabets.put(" אַ ", "அa");
		alphabets.put(" אָ ", "ஆ");
		alphabets.put(" אִ ", "இ");
		alphabets.put(" אִי ", "ஈ");
		alphabets.put(" אֻ ", "உ");
		alphabets.put(" אוּ ", "ஊ");
		alphabets.put(" אֶ ", "எ");
		alphabets.put(" אֵ ", "ஏ");
		alphabets.put(" אֵי ", "ஏய்");
		alphabets.put(" א̇ ", "ஒ");
		alphabets.put(" או̇ ", "ஓ");
		alphabets.put(" א ", "எ");
		alphabets.put(" אְ ", "எ");
		alphabets.put(" אֱ ", "எ");
		alphabets.put(" אֲ ", "அ");
		alphabets.put(" אֳ ", "ஆ");

		//1 ஆலெப்
		alphabets.put("אַ ", "அ");
		alphabets.put("אָ ", "ஆ");
		alphabets.put("אִ ", "இ");
		alphabets.put("אִי ", "ஈ");
		alphabets.put("אֻ ", "உ");
		alphabets.put("אוּ ", "ஊ");
		alphabets.put("אֶ ", "எ");
		alphabets.put("אֵ ", "ஏ");
		alphabets.put("אֵי ", "ஏய்");
		alphabets.put("א̇ ", "ஒ");
		alphabets.put("או̇ ", "ஓ");
		alphabets.put("א ", "எ");
		alphabets.put("אְ ", "எ");
		alphabets.put("אֱ ", "எ");
		alphabets.put("אֲ ", "அ");
		alphabets.put("אֳ ", "ஆ");

		// Selected words or joint alphabets for special cases
		//alphabets.put("பூமி", "buumi");

		// Joint alphabets
		//alphabets.put(" தேவா", "devaa");
		//alphabets.put("ங்கா", "ngaa");
		//alphabets.put("ஞ்சா", "njaa");
		//alphabets.put("ண்டா", "ndaa");
		//alphabets.put("ந்தா", "ndhaa");
		//alphabets.put("ம்பா", "mbaa");
		//alphabets.put("ன்பா", "nbaa");
		//alphabets.put("ன்றா", "nRaa");
		//alphabets.put("மாகா", "maagaa");
		//alphabets.put("மகா", "magaa");
		//alphabets.put("பாகா", "paagaa");
		//alphabets.put("பகா", "pagaa");
		//alphabets.put("ஆகா", "aagaa");

		// Additional joint alphabets with English letter variations for easy reading
		//alphabets.put("ட்டா", "ttaa");
		//alphabets.put("த்தா", "tthaa");
		//alphabets.put("ச் ", "ch");
		//alphabets.put("ண்ணா", "nnaa");
		//alphabets.put("ஃஜா", "zaa");
		//alphabets.put("ஃகா", "khaa");
		//alphabets.put("ஃபா", "faa");
		//alphabets.put("ஃவா", "vaa");
		//alphabets.put("ஃஷா", "kshaa");
		//alphabets.put("ஃஸா", "kSaa");
		//alphabets.put("ஃஹா", "Haa");
		//alphabets.put("ஃதா", "Thaa");
		//alphabets.put("ற்றா", "tRaa");
		//alphabets.put("ஃத", "Tha");


		//2 பேய்த்
		alphabets.put("בַּ", "ப");
		alphabets.put("בָּ", "பா");
		alphabets.put("בִּ", "பி");
		alphabets.put("בִּי", "பீ");
		alphabets.put("בֻּ", "பு");
		alphabets.put("בּוּ", "பூ");
		alphabets.put("בֶּ", "பெ");
		alphabets.put(" בֵּ", "பே");
		alphabets.put("בֵּי", "பேய்");
		alphabets.put("בּ̇", "பொ");
		alphabets.put("בּוׄ", "போ");
		alphabets.put("בּ", "பெ");
		alphabets.put("בְּ", "பெ");
		alphabets.put("בֱּ", "பெ");
		alphabets.put("בֲּ", "ப");
		alphabets.put("בֳּ", "பா");
		
		//2A வேய்த்
		alphabets.put("בַ", "வ");
		alphabets.put("בָ", "வா");
		alphabets.put("בִ", "வி");
		alphabets.put("בִי", "வீ");
		alphabets.put("בֻ", "வு");
		alphabets.put("בוּ", "வூ");
		alphabets.put("בֶ", "வெ");
		alphabets.put("בֵ", "வே");
		alphabets.put("בֵי", "வேய்");
		alphabets.put("בׄ", "வொ");
		alphabets.put("בו̇", "வோ");
		alphabets.put("ב", "வெ");
		alphabets.put("בְ", "வெ");
		alphabets.put("בֱ", "வெ");
		alphabets.put("בֲ", "வ");
		alphabets.put("בֳ", "வா");

		//3 க்கிம்மெல்
		alphabets.put("גַ", "க");
		alphabets.put("גָ", "கா");
		alphabets.put("גִ", "கி");
		alphabets.put("גִי", "கீ");
		alphabets.put("גֻ", "கு");
		alphabets.put("גוּ", "கூ");
		alphabets.put("גֶ", "கெ");
		alphabets.put("גֵ", "கே");
		alphabets.put("גֵי", "கேய்");
		alphabets.put("ג̇", "கொ");
		alphabets.put("גו̇", "கோ");
		alphabets.put("ג", "கெ");
		alphabets.put("גְ", "கெ");
		alphabets.put("גֱ", "கெ");
		alphabets.put("גֲ", "க");
		alphabets.put("גֳ", "கா");

		//4 ட்டாலெத்
		alphabets.put("דַ", "ட");
		alphabets.put("דָ", "டா");
		alphabets.put("דִ", "டி");
		alphabets.put("דִי", "டீ");
		alphabets.put("דֻ", "டு");
		alphabets.put("דוּ", "டூ");
		alphabets.put("דֶ", "டெ");
		alphabets.put("דֵ", "டே");
		alphabets.put("דֵי", "டேய்");
		alphabets.put("ד̇", "டொ");
		alphabets.put("דו̇", "டோ");
		alphabets.put("ד", "டெ");
		alphabets.put("דְ", "டெ");
		alphabets.put("דֱ", "டெ");
		alphabets.put("דֲ", "ட");
		alphabets.put("דֳ", "டா");

		//5 ஹே
		alphabets.put("הַ", "ஹ");
		alphabets.put("הָ", "ஹா");
		alphabets.put("הִ", "ஹி");
		alphabets.put("הִי ", "ஹீ");
		alphabets.put("הֻ", "ஹு");
		alphabets.put("הוּ", "ஹூ");
		alphabets.put("הֶ", "ஹெ");
		alphabets.put("הֵ", "ஹே");
		alphabets.put("הֵי", "ஹேய்");
		alphabets.put("ה̇", "ஹொ");
		alphabets.put("הו̇", "ஹோ");
		alphabets.put("ה", "ஹெ");
		alphabets.put("הְ", "ஹெ");
		alphabets.put("הֱ", "ஹெ");
		alphabets.put("הֲ", "ஹ");
		alphabets.put("הֳ", "ஹா");

		//6 வாவ்
		alphabets.put("וַ", "வ");
		alphabets.put("וָ", "வா");
		alphabets.put("וִ", "வி");
		alphabets.put("וִי", "வீ");
		alphabets.put("וֻ", "வு");
		alphabets.put("ווּ", "வூ");
		alphabets.put("וֶ", "வெ");
		alphabets.put("וֵ", "வே");
		alphabets.put("וֵי", "வேய்");
		alphabets.put("ו̇", "வொ");
		alphabets.put("וו̇", "வோ");
		alphabets.put("ו", "வெ");
		alphabets.put("וְ", "வெ");
		alphabets.put("וֱ", "வெ");
		alphabets.put("וֲ", "வ");
		alphabets.put("וֳ", "வா");

		//7 ஜயின்
		alphabets.put("னா", "ஜ");
		alphabets.put("னி", "ஜா");
		alphabets.put("னீ", "ஜி");
		alphabets.put("னு", "ஜீ");
		alphabets.put("னூ", "ஜு");
		alphabets.put("னெ", "ஜூ");
		alphabets.put("னே", "ஜெ");
		alphabets.put("னை", "ஜே");
		alphabets.put("னொ", "ஜேய்");
		alphabets.put("னோ", "ஜொ");
		alphabets.put("னௌ", "ஜோ");
		alphabets.put("ன்", "ஜெ");
		alphabets.put("ன்", "ஜெ");
		alphabets.put("ன்", "ஜெ");
		alphabets.put("ன்", "ஜ");
		alphabets.put("ன்", "ஜா");

		//8 க்கேய்த்
		alphabets.put("தா", "க்க");
		alphabets.put("தி", "க்கா");
		alphabets.put("தீ", "க்கி");
		alphabets.put("து", "க்கீ");
		alphabets.put("தூ", "க்கு");
		alphabets.put("தெ", "க்கூ");
		alphabets.put("தே", "க்கெ");
		alphabets.put("தை", "க்கே");
		alphabets.put("தொ", "க்கேய்");
		alphabets.put("தோ", "க்கொ");
		alphabets.put("தௌ", "க்கோ");
		alphabets.put("த்", "க்கெ");
		alphabets.put("த்", "க்கெ");
		alphabets.put("த்", "க்கெ");
		alphabets.put("த்", "க்க");
		alphabets.put("த்", "க்கா");

		//9 டேய்த்
		alphabets.put("பா", "ட");
		alphabets.put("பி", "டா");
		alphabets.put("பீ", "டி");
		alphabets.put("பு", "டீ");
		alphabets.put("பூ", "டு");
		alphabets.put("பெ", "டூ");
		alphabets.put("பே", "டெ");
		alphabets.put("பை", "டே");
		alphabets.put("பொ", "டேய்");
		alphabets.put("போ", "டொ");
		alphabets.put("பௌ", "டோ");
		alphabets.put("ப்", "டெ");
		alphabets.put("ப்", "டெ");
		alphabets.put("ப்", "டெ");
		alphabets.put("ப்", "ட");
		alphabets.put("ப்", "டா");

		//10 யோட்
		alphabets.put("மா", "ய");
		alphabets.put("மி", "யா");
		alphabets.put("மீ", "யி");
		alphabets.put("மு", "யீ");
		alphabets.put("மூ", "யு");
		alphabets.put("மெ", "யூ");
		alphabets.put("மே", "யெ");
		alphabets.put("மை", "யே");
		alphabets.put("மொ", "யேய்");
		alphabets.put("மோ", "யொ");
		alphabets.put("மௌ", "யோ");
		alphabets.put("ம்", "யெ");
		alphabets.put("ம்", "யெ");
		alphabets.put("ம்", "யெ");
		alphabets.put("ம்", "ய");
		alphabets.put("ம்", "யா");

		//11 க்கஃப்
		alphabets.put("ய்", "க");
		alphabets.put("ய்", "கா");
		alphabets.put("ய்", "கி");
		alphabets.put("ய்", "கீ");
		alphabets.put("ய்", "கு");
		alphabets.put("ய்", "கூ");
		alphabets.put("ய்", "கெ");
		alphabets.put("ய்", "கே");
		alphabets.put("ய்", "கேய்");
		alphabets.put("ய்", "கொ");
		alphabets.put("ய்", "கோ");
		alphabets.put("ய்", "கெ");
		alphabets.put("ய்", "கெ");
		alphabets.put("ய்", "கெ");
		alphabets.put("ய்", "க");
		alphabets.put("ய்", "கா");

		//12 லா மெட்
		alphabets.put("ல்", "ல");
		alphabets.put("ல்", "லா");
		alphabets.put("ல்", "லி");
		alphabets.put("ல்", "லீ");
		alphabets.put("ல்", "லு");
		alphabets.put("ல்", "லூ");
		alphabets.put("ல்", "லெ");
		alphabets.put("ல்", "லே");
		alphabets.put("ல்", "லேய்");
		alphabets.put("ல்", "லொ");
		alphabets.put("ல்", "லோ");
		alphabets.put("ல்", "லெ");
		alphabets.put("ல்", "லெ");
		alphabets.put("ல்", "லொ");
		alphabets.put("ல்", "ல");
		alphabets.put("ல்", "லா");

		//13 மேம்
		alphabets.put("ழா", "ம");
		alphabets.put("ழா", "மா");
		alphabets.put("ழா", "மி");
		alphabets.put("ழா", "மீ");
		alphabets.put("ழா", "மு");
		alphabets.put("ழா", "மூ");
		alphabets.put("ழா", "மெ");
		alphabets.put("ழா", "மே");
		alphabets.put("ழா", "மேய்");
		alphabets.put("ழா", "மொ");
		alphabets.put("ழா", "மோ");
		alphabets.put("ழா", "மெ");
		alphabets.put("ழா", "மெ");
		alphabets.put("ழா", "மெ");
		alphabets.put("ழா", "ம");
		alphabets.put("ழா", "மா");

		//14 நூன்
		alphabets.put("ள்", "ந");
		alphabets.put("ள்", "நா");
		alphabets.put("ள்", "நி");
		alphabets.put("ள்", "நீ");
		alphabets.put("ள்", "நு");
		alphabets.put("ள்", "நூ");
		alphabets.put("ள்", "நெ");
		alphabets.put("ள்", "நே");
		alphabets.put("ள்", "நேய்");
		alphabets.put("ள்", "நொ");
		alphabets.put("ள்", "நோ");
		alphabets.put("ள்", "நெ");
		alphabets.put("ள்", "நெ");
		alphabets.put("ள்", "நெ");
		alphabets.put("ள்", "ந");
		alphabets.put("ள்", "நா");

		//15 சாமெக்
		alphabets.put("வ்", "ச");
		alphabets.put("வ்", "சா");
		alphabets.put("வ்", "சி");
		alphabets.put("வ்", "சீ");
		alphabets.put("வ்", "சு");
		alphabets.put("வ்", "சூ");
		alphabets.put("வ்", "செ");
		alphabets.put("வ்", "சே");
		alphabets.put("வ்", "சேய்");
		alphabets.put("வ்", "சொ");
		alphabets.put("வ்", "சோ");
		alphabets.put("வ்", "செ");
		alphabets.put("வ்", "செ");
		alphabets.put("வ்", "செ");
		alphabets.put("வ்", "ச");
		alphabets.put("வ்", "சா");

		//16 அயின்
		alphabets.put("ர்", "அ");
		alphabets.put("ர்", "ஆ");
		alphabets.put("ர்", "இ");
		alphabets.put("ர்", "ஈ");
		alphabets.put("ர்", "உ");
		alphabets.put("ர்", "ஊ");
		alphabets.put("ர்", "எ");
		alphabets.put("ர்", "ஏ");
		alphabets.put("ர்", "ஏய்");
		alphabets.put("ர்", "ஒ");
		alphabets.put("ர்", "ஓ");
		alphabets.put("ர்", "எ");
		alphabets.put("ர்", "எ");
		alphabets.put("ர்", "எ");
		alphabets.put("ர்", "அ");
		alphabets.put("ர்", "ஆ");

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

		//1 ஆலெப்
		alphabets.put("אַ", "அ");
		alphabets.put("אָ", "ஆ");
		alphabets.put("אִ", "இ");
		alphabets.put("אִי", "ஈ");
		alphabets.put("אֻ", "உ");
		alphabets.put("אוּ", "ஊ");
		alphabets.put("אֶ", "எ");
		alphabets.put("אֵ", "ஏ");
		alphabets.put("אֵי", "ஏய்");
		alphabets.put("א̇", "ஒ");
		alphabets.put("או̇", "ஓ");
		alphabets.put("א", "எ");
		alphabets.put("אְ", "எ");
		alphabets.put("אֱ", "எ");
		alphabets.put("אֲ", "அ");
		alphabets.put("אֳ", "ஆ");

	}

}
