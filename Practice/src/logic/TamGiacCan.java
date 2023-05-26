package logic;

import java.util.Scanner;

public class TamGiacCan{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào chiều cao của tam giác: ");
		int h = scanner.nextInt();
		int x, output;

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= 2 * h; j++) {
				x = j - h;
				if (x < 0) {
					x *= -1;
				}
				output = i - x;

				if (output > 0) {
					System.out.printf("%3d", output);
				} else {
					System.out.printf("   ");
				}
			}
			System.out.println();

		}
	}
}
