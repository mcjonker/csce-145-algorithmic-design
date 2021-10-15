/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
public class matrixarbiter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Matrix Adder!\nEnter the height and width of the first matrix (separate entries).");
		int ay = keyboard.nextInt();
		int ax = keyboard.nextInt();
		int[][] matrixa = new int[ax][ay]; //Creates the first matrix

		for(int ix = 0; ix < ax; ix++) {
			for(int iy = 0; iy < ay; iy++) {
				System.out.println("Enter the value at "+ix+" "+iy); //Intake values for matrixa
				matrixa[ix][iy] = keyboard.nextInt();
			}
		}
		
		System.out.println("Enter the height and width of the second matrix (separate entries).");
		int by = keyboard.nextInt();
		int bx = keyboard.nextInt();
		int[][] matrixb  = new int[bx][by]; //Creates the second matrix
		
		for(int jx = 0; jx < bx; jx++) {
			for(int jy = 0; jy < by; jy++) {
				System.out.println("Enter the value at "+jx+" "+jy); //Intake values for matrixb
				matrixb[jx][jy] = keyboard.nextInt();
			}
		}
		
		if(ax != bx || ay != by) { //Determines if the incompatible matrices are of the same dimensions
			System.err.println("Matrices are not of compatable dimensions. These cannot be added.");
			System.exit(0); //System errors and quits if the dimensions are not identical.
		}
		
		int[][] matrixc = new int[ax][ay]; //Creates the third matrix
		
		for(int printax = 0; printax < ax; printax++) { //Print input matrixa
			for(int printay = 0; printay < ay; printay++) {
				System.out.print(matrixa[printax][printay]+" ");
			}
			System.out.println();
		}
		
		System.out.println("+");
		for(int printbx = 0; printbx < bx; printbx++) { //Print input matrixb
			for(int printby = 0; printby < by; printby++) {
				System.out.print(matrixb[printbx][printby]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=");
		for(int addx = 0; addx < bx; addx++) {
			for(int addy = 0; addy < by; addy++) {
				matrixc[addx][addy] = matrixa[addx][addy] + matrixb[addx][addy]; //Add components for matrixc
			}
		}
		
		for(int printcx = 0; printcx < bx; printcx++) {
			for(int printcy = 0; printcy < by; printcy++) {
				System.out.print(matrixc[printcx][printcy]+" "); //Print values of resulting matrix
			}
			System.out.println();
		}	
	}
}