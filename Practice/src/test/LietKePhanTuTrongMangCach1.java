package test;

import java.util.HashMap;
import java.util.Map;

public class LietKePhanTuTrongMangCach1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };

		Map<Integer, Integer> mapA = convertToMap(a);
		System.out.println(mapA);
		System.out.println("unique numbers : ");
		
		for (Integer key : mapA.keySet()) {
			if (mapA.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
		
//		mapA.forEach((number, count) -> {
//			if (count == 1)
//				System.out.print(number + " ");
//		});
		
		System.out.println();

		System.out.println("numbers appear more than 1 time");
		mapA.forEach((number, count) -> {
			if (count > 1)
				System.out.print(number + " ");
		});
	}

	public static Map<Integer, Integer> convertToMap(int[] a) {	
		Map<Integer, Integer> result = new HashMap<>();
		for (Integer i : a) {
			if (result.containsKey(i)) {
				result.put(i, result.get(i) + 1);
			} else {
				result.put(i, 1);
			}
		}
		return result;
	}
}
