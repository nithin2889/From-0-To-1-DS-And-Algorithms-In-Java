package com.from0To1.DSA.sorting;

public class SelectionSort {

	public static void sort(int[] listToSort) {
		for (int i = 0; i < listToSort.length; i++) {
			/**
			 * Second loop starts from the element after i
			 */
			for (int j = i + 1; j < listToSort.length; j++) {
				/**
				 * If the element at index i is greater than the element at index j, swap the
				 * elements
				 */
				if (listToSort[i] > listToSort[j]) {
					swap(listToSort, i, j);
					print(listToSort);
				}
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