package live.learnjava.java_arrays.multidimensionalarrays;

public class Test10_MultiDimensionalArrayExample {
	public static void main(String[] args) {
		int[][] mda = new int[3][2];
		mda[0] = new int[]{1,2};
		mda[1] = new int[]{3,4};
		mda[2] = new int[]{10,2};
		
		int[][] mda1 = new int[3][2];
		mda1[0][0] = 0;
		mda1[0][1] = 01;
		mda1[1][0] = 10;
		mda1[1][1] = 11;
		mda1[2][0] = 20;
		mda1[2][1] = 21;
		
		int[][] mda2 = {{1,3},{3,4},{5,6}};
		
		for(int i = 0; i < mda2.length; i++) {
			int[] ia1 = mda2[i];
			for(int j = 0; j < ia1.length; j++) {
				System.out.println(ia1[j]);
			}
		}
		
	}
}
