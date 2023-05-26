package sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void sort(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < i; j++) {
				if(numbers[i] < numbers[j]) {
					SortUtils.swap(numbers, i, j);
				}
			}
		}
	}
}
