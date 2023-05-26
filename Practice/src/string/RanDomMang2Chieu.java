package string;

import java.util.Random;
import java.util.Scanner;

public class RanDomMang2Chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số hàng: ");
		int row = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập số cột: ");
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		printMatrx(matrix);
	}
	
	private static void printMatrx(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(new Random().nextInt(matrix.length) + " ");
			}
		}
	}
}

