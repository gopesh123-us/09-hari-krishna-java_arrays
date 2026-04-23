package live.learnjava.java_arrays.operations;

/**
 * Develop a program to take an array of integers as argument
 * In this method, find the sun of all integers available in this 
 * array and return result
 */
public class Test04_ArrayOpsProgram {
	public static void main(String[] args) {
		
		int numOfValues = Integer.parseInt(IO.readln("How many values do you want to enter?"));
		
		int[] numbers = new int[numOfValues];
		System.out.println("Array with " + numOfValues + " locations created");
		for(int i = 0; i < numOfValues; i++) {
			numbers[i] = Integer.parseInt(IO.readln("Enter value " + (i+1) + ": "));
		}
		int result = sumOfArray(numbers);
		
		System.out.println("Sum of all given values: "+result);		
	}
	
	public static int sumOfArray(int[] numArray) throws ArrayOperationFailedException {
		
		if(numArray == null) {
			throw new ArrayOperationFailedException("Array cannot be null");
		}
		
		if(numArray.length == 0) {
			throw new ArrayOperationFailedException("Array length cannot be zero");
		}
		
		int sum = numArray[0];
		
		for(int i = 1 ; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}
		
		return sum;
	}
}
