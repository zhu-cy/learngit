package damo1;

import java.util.Arrays;

public class arrays_2 {
	public static void main(String [] ags) {
		int [][]a1 =new int [2] [3];
		System.out.println(Arrays.toString(a1[0]));
		System.out.println(Arrays.toString(a1[1]));
		a1[0][1]=1001;
		System.out.println(Arrays.toString(a1[0]));
	}
}
