package week3Array;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[]data= {3,2,11,4,6,7};
		Arrays.sort(data);
		int secondLargest =data[data.length-2];
		System.out.println(" Second largest element: "+secondLargest);

	}

}
