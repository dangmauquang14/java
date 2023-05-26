package string;

import java.util.Arrays;

import utils.CompareStringHelper;
import utils.Utils;

public class SortArrayOfDifferentElements {
	public static void main(String[] args) {
		String[] sequences = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		System.out.println(Arrays.toString(sequences));
		
		// ASC
		Utils.sort(sequences, new CompareStringHelper() {
			@Override
			public int compare(String s1, String s2) {
				// B1: Null first
				if (s1 == null) {
					return 1;
				}

				// s1 != null
				if (s2 == null) {
					return -1;
				}
				
				if(s1.matches("-?\\d+(\\.\\d+)?") && s2.matches("-?\\d+(\\.\\d+)?")){
					return Integer.parseInt(s1) - Integer.parseInt(s2);
				}
				
				return s1.compareTo(s2);
			}
		});

		System.out.println(Arrays.toString(sequences));
		
		
		//DESC
		Utils.sort(sequences, new CompareStringHelper() {
			@Override
			public int compare(String s1, String s2) {
				// B1: Null first
				if (s1 == null) {
					return -1;
				}

				// s1 != null
				if (s2 == null) {
					return 1;
				}
				
				if(s1.matches("-?\\d+(\\.\\d+)?") && s2.matches("-?\\d+(\\.\\d+)?")){
					return Integer.parseInt(s2) - Integer.parseInt(s1);
				}
				
				return s2.compareTo(s1);
			}
		});
		
		System.out.println(Arrays.toString(sequences));
	}
}