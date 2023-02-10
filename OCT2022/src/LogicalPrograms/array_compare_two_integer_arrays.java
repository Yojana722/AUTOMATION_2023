package LogicalPrograms;

import java.util.Arrays;

public class array_compare_two_integer_arrays {

	public static void main(String[] args) {
		int ar1[] = { 10, 20, 30 };
		int ar2[] = { 10, 30, 20 };
		int ar3[] = { 10, 20, 30 };

		System.out.println(Arrays.equals(ar1, ar2));// false
		System.out.println(Arrays.equals(ar1, ar3));//true
		System.out.println(Arrays.deepEquals(args, args));//used to compare two multidimensional arrays
	}
}
