package QuanLySV;

import java.util.Scanner;

public class TestSinhVien {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // sv1: thông tin của mình
        SinhVien sv1 = new SinhVien(
                1001,
                "Nguyen Van A",
                8.5,
                9.0
        );

        // sv2: thông tin bạn thân
        SinhVien sv2 = new SinhVien(
                1002,
                "Tran Van B",
                7.5,
                8.0
        );

        // sv3: tạo bằng constructor mặc định
        SinhVien sv3 = new SinhVien();

        // Nhập thông tin cho sv3
        System.out.print("Nhap ma sinh vien: ");
        int ma = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap diem LT: ");
        double lt = sc.nextDouble();

        System.out.print("Nhap diem TH: ");
        double th = sc.nextDouble();

        // Dùng setter để gán dữ liệu
        sv3.setMaSinhVien(ma);
        sv3.setHoTen(ten);
        sv3.setDiemLT(lt);
        sv3.setDiemTH(th);

        // Xuất thông tin
        System.out.println("\nTHONG TIN SINH VIEN");
        System.out.println("Ma sinh vien     Ho ten                    Diem LT    Diem TH    Diem TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        sc.close();
    }
}
