package live.learnjava.java_arrays.growablearray;

import java.util.Arrays;

public class GrowableArrayDemoTest {
	public static void main(String[] args) {
		GrowableArrayDemo ga = new GrowableArrayDemo();
		Object[] ar = new Object[3];
		ga.add(1, ar);
		ga.add(3, ar);
		ga.add(6, ar);
		Object[] arr = ga.add(8, ar);
		Object[] arr2 = ga.add(10, arr);
		Object[] arr3 = ga.add(11, arr2);
		Object[] arr4 = ga.add(100, arr3);
		System.out.println(Arrays.toString(arr4));
		
		GrowableArrayDemo2 demo2 = new GrowableArrayDemo2();
		demo2.add(1);
		demo2.add(5);
		demo2.add(6);
		demo2.add(10);
		demo2.add(3);
		demo2.printItems();
		

	}
}
