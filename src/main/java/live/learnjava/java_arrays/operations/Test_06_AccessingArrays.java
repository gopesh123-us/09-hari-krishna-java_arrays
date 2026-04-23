package live.learnjava.java_arrays.operations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test_06_AccessingArrays {
	public static void main(String[] args) {
		int[] ia = {3,4,5,6,7};
		Arrays.stream(ia).forEach(element -> System.out.println(element));
		IntStream.range(0, ia.length).forEach(i->System.out.println("Index "+i + " = "+ia[i]));
	
	}
}
