/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class StringHelperTester {

	public static void main(String[] args) {

		System.out.println("Welcome to String Helper Tester!");

		System.out.println("\nTesting the Has All Unique Characters method with \"Water\"");
		System.out.println(StringHelper.hasAllUniqueCharaters("Water"));
		System.out.println("\nTesting the Has All Unique Characters method with \"Applebees\"");
		System.out.println(StringHelper.hasAllUniqueCharaters("Applebees"));
		
		System.out.println("\nTesting the Mesh Strings method with \"orange\" and \"guitar\"");
		System.out.println(StringHelper.meshStrings("orange", "guitar"));
		System.out.println("\nTesting the Mesh Strings method with \"alphabet\" and \"texas\"");
		System.out.println(StringHelper.meshStrings("alphabet", "texas"));
		
		System.out.println("\nTesting the Replace Vowels with Oodle method with \"Noodle\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("Noodle"));
		System.out.println("\nTesting the Replace Vowels with Oodle method with \"Massachusetts\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("Massachusetts"));
		
		System.out.println("\nTesting the Weight method with \"Massive\"");
		System.out.println(StringHelper.weight("Massive"));
		System.out.println("\nTesting the Weight method with \"Axel\"");
		System.out.println(StringHelper.weight("Axel"));
	}

}
