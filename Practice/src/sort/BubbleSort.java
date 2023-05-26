package sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void sort(int[] numbers) {
		for(int round = 0; round < numbers.length; round ++) {
			for(int i = 0; i < numbers.length - round - 1; i++) {
				if(numbers[i] > numbers[i + 1]) {
					SortUtils.swap(numbers, i, i+1);
				}
			}
		}
	}
}

