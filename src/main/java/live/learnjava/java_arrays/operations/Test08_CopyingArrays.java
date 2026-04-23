package live.learnjava.java_arrays.operations;

import java.util.Arrays;


public class Test08_CopyingArrays {
	public static void main(String[] args) {
		int[] ia = {3,4,5,6,7,8};
		int[] ia1 = ia;
		String toPrint = Arrays.toString(ia1);
		System.out.println(toPrint);
		
		int[] ia2 = new int[ia.length];
		
		for(int i = 0; i < ia.length; i++) {
			ia2[i] = ia[i];
		}
		
		System.out.println("Printing ia");
		System.out.println(Arrays.toString(ia));
		System.out.println("Printing ia2");
		System.out.println(Arrays.toString(ia2));
		System.out.println(ia == ia2);
	}
}
