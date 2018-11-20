package com.from0To1.DSA.Sorting;

public class BubbleSort {

	public static void sort(int[] listToSort) {
		for (int i = 0; i < listToSort.length; i++) {
			boolean swapped = false;
			/**
			 * The variable swapped keeps track of whether any swap was performed in the
			 * second loop, if not, then the list is sorted and we can break out early.
			 */
			for (int j = listToSort.length - 1; j > i; j--) {
				if (listToSort[j] < listToSort[j - 1]) {
					swap(listToSort, j, j - 1);
					// Keeps track of whether a single swap was performed
					swapped = true;
				}
			}
			print(listToSort);
			if (!swapped) {
				break;
			}
		}
	}

	public static void print(int[] listToSort) {
		for (int el : listToSort) {
			System.out.println(el + ",");
		}
		System.out.println();
	}

	public static void swap(int[] listToSort, int iIndex, int jIndex) {
		int temp = listToSort[iIndex];
		listToSort[iIndex] = listToSort[jIndex];
		listToSort[jIndex] = temp;
	}

}