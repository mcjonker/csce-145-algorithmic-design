/*
 * Property of Mitchell Jonker
 */
import java.util.Scanner;
public class binaryadder {

	public static void main(String[] args) {
		@SuppressWarnings("resource") //Java kept yelling at me for a resource leak.. so I added this suppression.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nProvide two 4-bit binary values, in two separate inputs.\nThey will be added and converted into decimal!\n");
		int a1 = 0;
		
		for(String entry1 = keyboard.next(); a1 >= 0; entry1 = keyboard.next()) {
			System.out.print(" +\n");//The for statement begins by prompting the user to enter a value, which gets stored as entry1 (this is condition1). Every time the for statement is run (each cycle), the for statement will run condition3, which too prompts the user to enter a value (to be stored as entry1). The values of previous cycles can be disregarded, so they are simply overwritten with each cycle.
			
			String entry2 = keyboard.next();
		
				a1 = Integer.parseInt(entry1.charAt(0)+"")*2*2*2;//This block of code turns the String value of the first entry into integers that can then be translated into binary. The stacking of multiples of two is the binary conversion.
				int a2 = Integer.parseInt(entry1.charAt(1)+"")*2*2;
				int a3 = Integer.parseInt(entry1.charAt(2)+"")*2;
				int a4 = Integer.parseInt(entry1.charAt(3)+"");
		
				int b1 = Integer.parseInt(entry2.charAt(0)+"")*2*2*2;//This block of code turns the String value of the second entry into integers that can then be translated into binary. The stacking of multiples of two is the binary conversion.
				int b2 = Integer.parseInt(entry2.charAt(1)+"")*2*2;
				int b3 = Integer.parseInt(entry2.charAt(2)+"")*2;
				int b4 = Integer.parseInt(entry2.charAt(3)+"");
		
			System.out.println(" =");//This is the beginning of a line of System output. Since the math would be incorrect when text was between the integers, the following are .print(). and not .println().
			System.out.print(a1+a2+a3+a4+" + ");
			System.out.print(b1+b2+b3+b4+" in decimal\n =\n");
			System.out.print(a1+a2+a3+a4+b1+b2+b3+b4+" in decimal\n\nEnter two 4-bit binary values again to continue calculating.\n\n");//This is the output of the value, which is calculated by adding all of the integers a1-4, and b1-4 together.
		}
	}
}