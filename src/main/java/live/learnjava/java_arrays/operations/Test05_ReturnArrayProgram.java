package live.learnjava.java_arrays.operations;

public class Test05_ReturnArrayProgram {
	public static void main(String[] args) {
		int[] result = addSub(2,3);
		System.out.println("Add: " + result[0]);
		System.out.println("Substract: " + result[1]);
		
	}
	
	public static int[] addSub(int a, int b) {
		return new int[]{a+b, a-b};
	}
}
