package damo1;

import java.util.Arrays;

public class class_1 {
	public static void main(String[] args) {
		int[] a1=new int[5];
		System.out.println(Arrays.toString(a1));
		System.out.println(a1[2]);
		System.out.println(a1);
		int[] a2 = new int[] {1,2,3,4,5,6};
		System.out.println(a2);
		System.out.println(Arrays.toString(a2));
		System.out.println(a2[4]);
		System.out.println(a1.length);
		int[] a3 = new int[0];
		System.out.println(Arrays.toString(a3));
		//int [] a4 = new int [-2];
		//System.out.println(Arrays.toString(a4));
		a2[0]=89;
		System.out.println(Arrays.toString(a2));
	}

}
