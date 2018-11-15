package com.from0To1.DSA.sorting;

public class InsertionSort {

	public static void sort(int[] listToSort) {
		for (int i = 0; i < listToSort.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (listToSort[j] < listToSort[j - 1]) {
					swap(listToSort, j, j - 1);
				} else {
					break;
				}
				print(listToSort);
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