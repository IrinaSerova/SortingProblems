package SortingProblems;

import java.util.Arrays;
public class BubbleSort {
	public void sort(int a[]) { 
		int n = a.length;
		int totalSwaps = 0;
		for (int i = 0; i < n; i++) {
		  // Track number of elements swapped during a single array traversal
		  int numberOfSwaps = 0;
  		  for (int j = 0; j < n - 1; j++) {
		       // Swap adjacent elements if they are in decreasing order
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				numberOfSwaps++;
				totalSwaps++;
			}
		  }
		// If no elements were swapped during a traversal, array is sorted
		if (numberOfSwaps == 0) {
			break;
		}
	    }
	  System.out.println("Array was sorted in " + totalSwaps + " swaps.");
	}
	public static void main(String arg[]) {
		BubbleSort bs = new BubbleSort();
		int[] a = {9, -3, 3, 2, 1, 0};
		System.out.println(Arrays.toString(a));
		bs.sort(a);
		System.out.println(Arrays.toString(a));
	}
}