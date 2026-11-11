package DanhSachCN;

import java.util.Scanner;

public class TEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so luong cong nhan: ");
		int n = sc.nextInt();

		DanhSachCongNhan ds = new DanhSachCongNhan(n);

		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap cong nhan thu " + (i + 1));
			ds.themCN();
		}

		System.out.println("\nDanh sach cong nhan:");
		ds.inDS();

		System.out.println("\nSo luong cong nhan: " + ds.demCN());

		System.out.println("\nDanh sach cong nhan co so SP > 200:");
		ds.inSP200();
		ds.demCN();
		System.out.println("\nDanh sach sau khi sap xep giam dan theo so SP:");
		ds.sapXep();
		ds.inDS();

		sc.close();
	}
}
