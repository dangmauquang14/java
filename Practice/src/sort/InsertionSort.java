package sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void sort(int[] numbers) {
		for (int round = numbers.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (numbers[i] > numbers[round]) {
					int temp = numbers[i];
					numbers[i] = numbers[round];
					numbers[round] = temp;
				}
			}
		}
	}

}
