package oop.vehicle;

import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Vehicle vehicles[] = null;
		int a, n = 0;
		boolean flag = true;
		do {
			System.out.println("Hay dua ra lua chon: ");
			System.out.println("1. Nhap so luong xe.");
			System.out.println("2. In ra thue.");
			System.out.println("3. Exit");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
				n = sc.nextInt();
				vehicles = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Xe thứ " + (i + 1));
					vehicles[i] = new Vehicle();
					nhapXe(vehicles[i]);
				}
				break;
			case 2:
				for (Vehicle vehicle : vehicles) {
					System.out.println(vehicle);
				}
				break;
			default:
				System.out.println("exit program");
				flag = false;
				break;
			}
		} while (flag);
	}

	public static void nhapXe(Vehicle xe) {
		System.out.print("Nhập tên chủ xe: ");
		xe.setChuXe(sc.nextLine());
		sc.nextLine();
		System.out.print("Nhập loại xe: ");
		xe.setLoaiXe(sc.nextLine());
		System.out.print("Nhập dung tích xe: ");
		xe.setDungTich(sc.nextInt());
		System.out.print("Nhập giá trị xe: ");
		xe.setGiaTri(sc.nextDouble());
		;
		sc.nextLine();
	}
}