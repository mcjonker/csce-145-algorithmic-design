/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class StringHelperTester {

	public static void main(String[] args) {
		//public static StringHelper helper = new StringHelper();
		
		//Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to String Helper Tester!");
		
		//String input = scanner.nextLine();
		//String input2 = scanner.nextLine();
		System.out.println("\nTesting the Has All Unique Characters method with \"Water\"");
		System.out.println(StringHelper.hasAllUniqueCharaters("Water"));
		System.out.println("\nTesting the Has All Unique Characters method with \"Applebees\"");
		System.out.println(StringHelper.hasAllUniqueCharaters("Applebees"));
		
		System.out.println("\nTesting the Mesh Strings method with \"orange\" and \"guitar\"");
		System.out.println(StringHelper.meshStrings("orange", "guitar"));
		
		System.out.println("\nTesting the Replace Vowels with Oodle method with \"Noodle\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("Noodle"));
		
		System.out.println("\nTesting the Weight method with \"Massive\"");
		System.out.println(StringHelper.weight("Massive"));
		
		
		
		
		System.out.println();
	}

}
