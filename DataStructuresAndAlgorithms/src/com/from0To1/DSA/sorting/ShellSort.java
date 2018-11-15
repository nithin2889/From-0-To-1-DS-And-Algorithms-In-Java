package com.from0To1.DSA.sorting;

public class ShellSort {

	public static void insertionSort(int[] listToSort, int startIndex, int increment) {
		for (int i = startIndex; i < listToSort.length - 1; i = i + increment) {
			for (int j = Math.min(i + increment, listToSort.length - 1); j - increment > 0; j = j - increment) {
				if (listToSort[j] < listToSort[j - increment]) {
					swap(listToSort, j, j - increment);
				} else {
					break;
				}
				print(listToSort);
			}
		}
	}

	public static void shellSort(int[] listToSort) {
		int increment = listToSort.length / 2;

		while (increment >= 1) {
			for (int startIndex = 0; startIndex < increment; startIndex++) {
				insertionSort(listToSort, startIndex, increment);
			}
			increment = increment / 2;
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