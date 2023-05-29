package test;

/* 	Với n nhập từ bàn phím. Viết chương trình in ra 2 tam giác đối đỉnh bằng số tăng theo cột từ
	1 đến 2n-1.
	VD: Với n = 5. Hai tam giác sẽ đối đỉnh qua giá trị 3 */
import java.util.Scanner;

public class TamGiacDoiDinh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mot so bat ki: ");
		int n = sc.nextInt();
		int z = 2 * n - 1;

		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("%d", j);
			int kt = 2 * (n - i) - 1;
			for (int k = 1; k <= kt; k++)
				System.out.printf(" ");
			for (int t = z - i + 1; t <= z; t++)
				System.out.printf("%d", t);
			System.out.printf("\n");
		}

		for (int a = 1; a <= z; a++)
			System.out.printf("%d", a);
		System.out.printf("\n");
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.printf("%d", j);
			int kt = 2 * (n - i) - 1;
			for (int k = 1; k <= kt; k++)
				System.out.printf(" ");
			for (int t = z - i + 1; t <= z; t++)
				System.out.printf("%d", t);
			System.out.printf("\n");
		}
	}
}