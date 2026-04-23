package live.learnjava.java_arrays.operations;

public class Test09_SumProductofArrayElements {
	public static void main(String[] args) {
		int[] ia = {3, 4, 5, 6, 7, 10};
		
		int[] outcome = sumProduct(ia);
		System.out.println("sum: "+outcome[0]);
		System.out.println("product: "+outcome[1]);
	}
	public static int[] sumProduct(int[] ia) {
		int sum = 0;
		int product = 1;
		int[] result = new int[2];
		
		for(int i = 0; i < ia.length; i++) {
			if(ia[i] % 2 == 0) {
				sum = sum + ia[i];
				product = product * ia[i];
			}
		}
		
		result[0] = sum;
		result[1] = product;
		return result;
	}
}
