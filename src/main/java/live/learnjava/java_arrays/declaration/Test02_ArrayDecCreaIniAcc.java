package live.learnjava.java_arrays.declaration;

import java.util.Arrays;

import live.learnjava.java_arrays.userDefined.Example;

public class Test02_ArrayDecCreaIniAcc {
	public static void main(String[] args) {
		//Arrays with Primitive Data Types
		int[] ia = new int[5];
		System.out.println(ia);
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		System.out.println();
		
		ia[0] = 3;
		ia[1] = 4;
		ia[2] = 5;
		ia[3] = 6;
		ia[4] = 7;
		
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		System.out.println();
		
		//Arrays with String  type
		String[] sa = new String[5];
		System.out.println(sa);
		System.out.println(sa[0]);
		System.out.println(sa[1]);
		System.out.println(sa[2]);
		System.out.println(sa[3]);
		System.out.println(sa[4]);
		
		sa[0]="a";
		sa[1]="b";
		sa[2]="c";
		sa[3]="d";
		sa[4]="e";
		
		System.out.println(sa[0]);
		System.out.println(sa[1]);
		System.out.println(sa[2]);
		System.out.println(sa[3]);
		System.out.println(sa[4]);
		System.out.println();
		
		//Arrays with user defined Example class;
		Example[] ea = new Example[5];
		Example e1 = new Example();
		System.out.println(ea);	
		System.out.println(e1);
		
		System.out.println(ea[0]);
		System.out.println(ea[1]);
		System.out.println(ea[2]);
		System.out.println(ea[3]);
		System.out.println(ea[4]);
		System.out.println();
		
		ea[0] = new Example();
		ea[1] = new Example(30,40);
		ea[2] = new Example();
		ea[3] = new Example(70, 80);
		ea[4] = new Example(100, 90);
		
		System.out.println(Arrays.toString(ea));
		
	}
}
