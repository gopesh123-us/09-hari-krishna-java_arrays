package live.learnjava.java_arrays.operations;

public class Test06_AddSubAllProgram {
	public static void main(String[] args) {
		int noOfLocations = Integer.parseInt(IO.readln("How many values you want to enter: "));
		int[] inputs = new int[noOfLocations];
		System.out.println("Array with " + noOfLocations + " has been created");
		for(int i = 0; i < inputs.length; i ++) {
			inputs[i] = Integer.parseInt(IO.readln("Enter value " + (i+1) + ": "));
		}
		int[] result = addSubAll(inputs);
		System.out.println("Sum of all values: " + result[0]);
		System.out.println("Substraction of all values: " + result[1]);
	}
	
	public static int[] addSubAll(int[] numbers) throws ArrayOperationFailedException {
		
		if(numbers == null) {
			throw new ArrayOperationFailedException("Array cannot be null");
		}
		if(numbers.length == 0) {
			throw new ArrayOperationFailedException("Array cannot be of zero length");
		}
		int sum = 0;
		int sub = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		for(int i = 0; i < numbers.length; i++) {
			sub = sub - numbers[i];
		}
		return new int[]{sum, sub};
	}
}
