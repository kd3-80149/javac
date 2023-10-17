package com.sunbeam;

public class SortMain {

	public static void main(String[] args) {
		SelectionSort select = new SelectionSort();

		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		SelectionSort.selectionSort(arr2, select);

		for (Double ele : arr2) {
			System.out.println(ele);
		}

	}

}
