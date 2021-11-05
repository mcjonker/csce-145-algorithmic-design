/*
 * Property of Mitchell Jonker
 */

public class StringHelper {
	
	public static boolean hasAllUniqueCharaters(String aS) {
		aS.trim();
		for(int i = 0; i < aS.length(); i++) {
			for(int j = i+1; j < aS.length(); j++) {
				if(aS.charAt(i) == aS.charAt(j)) {
					return false; // if any two characters are the same, return false;
				}
			}
		}
		return true;
	}
	public static String meshStrings(String aS, String bS) {
		aS.trim(); // strip whitespace off
		bS.trim();
		
		int maxL;
		int minL;
		int r = 0;
		
		String max = "", min = "";
		String out = "";
		
		if(aS.length() > bS.length()) { // Longest string gets maxterms, the shorter gets the minterms.
			maxL = aS.length();
			max = aS;
			minL = bS.length();
			min = bS;
			
		}
		else {
			maxL = bS.length();
			max = bS;
			minL = aS.length();
			min = aS;
		}
		int rem = maxL-minL;
		
		for(r = 0; r < minL; r++) { // for as many characters long as is the smaller string, print one to one 
			out = out+aS.charAt(r);
			out = out+bS.charAt(r);
		}
		for(int j = maxL-rem; j < maxL; j++) { // Print the remaining items from the longer string.
			if(maxL == minL) {
				break;
			}
			out = out+max.charAt(j);
		}
		return out;
	}
	public static String replaceVowelsWithOodle(String aS) {
		aS.trim();
		String out = aS;
		out.trim();
		out = out.replace("a", "¬∫√ç"); // Obscure character sequence is an insured placeholder. it is quite unlikely for one to type that entry in when expecting to Oodle their words.
		out = out.replace("e", "¬∫√ç");
		out = out.replace("i", "¬∫√ç");
		out = out.replace("o", "¬∫√ç");
		out = out.replace("u", "¬∫√ç");
		out = out.replace("A", "¬∫√ç");
		out = out.replace("E", "¬∫√ç");
		out = out.replace("I", "¬∫√ç");
		out = out.replace("O", "¬∫√ç");
		out = out.replace("U", "¬∫√ç");
		out = out.replace("¬∫√ç", "Oodle");
		return out;
	}
	public static double weight(String aS) {
		double weight = 0.0;
		for(int i = 0; i < aS.length(); i++) {
			if(aS.charAt(i) == 'a') { // If a vowel is entered, add 2.5 to weight.
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'e') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'i') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'o') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'u') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'A') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'E') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'I') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'O') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) == 'U') {
				weight = weight+2.5;
			}
			if(aS.charAt(i) != 'a' && // If a character that is not any of the vowels is entered, add 3.4.
				aS.charAt(i) != 'e' &&
				aS.charAt(i) != 'i' &&
				aS.charAt(i) != 'o' &&
				aS.charAt(i) != 'u' &&
				aS.charAt(i) != 'A' &&
				aS.charAt(i) != 'E' &&
				aS.charAt(i) != 'I' &&
				aS.charAt(i) != 'O' &&
				aS.charAt(i) != 'U') {
				weight = weight+3.4;
			}
		}
		double out = Math.round(weight*100D) / 100D;
		return out;
	}
}