/*
 * Property of Mitchell Jonker
 */

import java.util.Scanner;
import java.util.Random;
public class matrixflip {

	public static int NUM_MAX = 9;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random num = new Random();
		
		int ax = 10, ay = 10; //These values can be altered to change the dimensions of the matrices.
		
		int[][] matrixa = new int[ax][ay]; //Init matrices 
		int[][] matrixb = new int[ax][ay];
		
		for(int ix = 0; ix < ax; ix++) { //Fills matrixa with randomly generated values from 0 to 9.
			for(int iy = 0; iy < ay; iy++) {
				matrixa[ix][iy] = num.nextInt(NUM_MAX);
			}
		}
		for(int jx = 0; jx < ax; jx++) { //Horizontally flips the values of matrixa (storing the resulting matrix as matrixb).
			for(int jy = 0; jy < ay; jy++) {
				matrixb[jx][jy] = matrixa[jx][(ay-1)-jy];
			}
		}
		System.out.println("Randomly Generated Matrix:");
		for(int printax = 0; printax < ax; printax++) { //Print matrixa
			for(int printay = 0; printay < ay; printay++) {
				System.out.print(matrixa[printax][printay]+" ");
			}
			System.out.println();
		}
		System.out.println("Horizontally Flipped Version:");
		for(int printbx = 0; printbx < ax; printbx++) { //Print input matrixb
			for(int printby = 0; printby < ay; printby++) {
				System.out.print(matrixb[printbx][printby]+" ");
			}
			System.out.println();
		}
	}
}
