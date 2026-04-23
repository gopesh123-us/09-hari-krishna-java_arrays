package live.learnjava.java_arrays.scanner;

import java.util.Scanner;

public class Test03_ScannerProgram1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many values you want to enter?");
		int noOfValues = scanner.nextInt();
		int[] ints = new int[noOfValues];
		System.out.println("Array object is created with " + noOfValues + " locations!");
		//initializing array with dynamic values
		for(int i = 0; i< noOfValues; i++) {
			System.out.println(" Enter value " + (i+1) + ": \t");
			ints[i] = scanner.nextInt();
		}
		
		//print array object values with dynamic code
		System.out.println("You entered these value ");
		for(int i = 0; i < noOfValues; i++) {
			System.out.println(ints[i]);
		}
		scanner.close();
	}
}
