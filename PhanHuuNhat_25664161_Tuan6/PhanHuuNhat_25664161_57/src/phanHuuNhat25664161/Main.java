package phanHuuNhat25664161;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static QuanLyThucPham ql = new QuanLyThucPham();
    static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        duLieuMau();

        int chon = -1;

        do {
            menu();

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
                continue;
            }

            switch (chon) {
                case 1:
                    themThucPham();
                    break;

                case 2:
                    xoaThucPham();
                    break;

                case 3:
                    suaThucPham();
                    break;

                case 4:
                    ql.hienThiDanhSach();
                    break;

                case 5:
                    sapXepMenu();
                    break;

                case 6:
                    timKiemMenu();
                    break;

                case 7:
                    trichLocTheoNgay();
                    break;

                case 8:
                    thongKe();
                    break;

                case 0:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }

    static void menu() {
        System.out.println("\n========== QUAN LY THUC PHAM ==========");
        System.out.println("1. Them thuc pham");
        System.out.println("2. Xoa theo id");
        System.out.println("3. Sua theo id");
        System.out.println("4. Hien thi danh sach");
        System.out.println("5. Sap xep");
        System.out.println("6. Tim kiem theo ten");
        System.out.println("7. Trich loc theo khoang ngay");
        System.out.println("8. Thong ke");
        System.out.println("0. Thoat");
        System.out.println("=======================================");
        System.out.print("Chon: ");
    }

    static void duLieuMau() {

        ql.them(new HangThucPham(
                0,
                "TP001",
                "Sua tuoi Vinamilk",
                LocalDate.of(2026, 1, 15),
                LocalDate.of(2026, 2, 15),
                25000
        ));

        ql.them(new HangThucPham(
                0,
                "TP002",
                "Banh quy Oreo",
                LocalDate.of(2026, 3, 5),
                LocalDate.of(2026, 6, 5),
                15000
        ));

        ql.them(new HangThucPham(
                0,
                "TP003",
                "Nuoc ngot Coca",
                LocalDate.of(2026, 1, 20),
                LocalDate.of(2026, 9, 20),
                12000
        ));

        ql.them(new HangThucPham(
                0,
                "TP004",
                "Sua chua TH True",
                LocalDate.of(2026, 5, 10),
                LocalDate.of(2026, 5, 25),
                8000
        ));

        ql.them(new HangThucPham(
                0,
                "TP005",
                "Banh mi Kinh Do",
                LocalDate.of(2026, 8, 1),
                LocalDate.of(2026, 8, 15),
                20000
        ));

        System.out.println("Da nap 5 san pham mau.");
    }

    static void themThucPham() {
        try {
            System.out.print("Ma hang: ");
            String ma = sc.nextLine();

            System.out.print("Ten hang: ");
            String ten = sc.nextLine();

            System.out.print("Ngay SX (dd/MM/yyyy): ");
            LocalDate sx = LocalDate.parse(sc.nextLine(), df);

            System.out.print("Ngay HH (dd/MM/yyyy): ");
            LocalDate hh = LocalDate.parse(sc.nextLine(), df);

            System.out.print("Gia: ");
            double gia = Double.parseDouble(sc.nextLine());

            HangThucPham h = new HangThucPham(
                    0,
                    ma,
                    ten,
                    sx,
                    hh,
                    gia
            );

            if (ql.them(h)) {
                System.out.println("Them thanh cong!");
            }

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    static void xoaThucPham() {
        try {
            System.out.print("Nhap id can xoa: ");
            int id = Integer.parseInt(sc.nextLine());

            if (ql.xoa(id)) {
                System.out.println("Da xoa id " + id);
            }

        } catch (NumberFormatException e) {
            System.out.println("id phai la so!");
        }
    }

    static void suaThucPham() {
        try {
            System.out.print("Nhap id can sua: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Ten moi: ");
            String ten = sc.nextLine();

            System.out.print("Ngay SX moi (dd/MM/yyyy): ");
            LocalDate sx = LocalDate.parse(sc.nextLine(), df);

            System.out.print("Ngay HH moi (dd/MM/yyyy): ");
            LocalDate hh = LocalDate.parse(sc.nextLine(), df);

            System.out.print("Gia moi: ");
            double gia = Double.parseDouble(sc.nextLine());

            if (ql.sua(id, ten, sx, hh, gia)) {
                System.out.println("Da sua id " + id);
            }

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    static void sapXepMenu() {
        System.out.println("\n========== SAP XEP ==========");
        System.out.println("a. Gia tang");
        System.out.println("b. Gia giam");
        System.out.println("c. Ngay SX tang");
        System.out.println("d. Ngay SX giam");
        System.out.println("e. Ngay HH tang");
        System.out.println("f. Ngay HH giam");
        System.out.print("Chon: ");

        String c = sc.nextLine().toLowerCase();

        switch (c) {
            case "a":
                ql.sapXepTheoGia(true);
                break;

            case "b":
                ql.sapXepTheoGia(false);
                break;

            case "c":
                ql.sapXepTheoNgaySanXuat(true);
                break;

            case "d":
                ql.sapXepTheoNgaySanXuat(false);
                break;

            case "e":
                ql.sapXepTheoNgayHh(true);
                break;

            case "f":
                ql.sapXepTheoNgayHh(false);
                break;

            default:
                System.out.println("Khong hop le!");
                return;
        }

        ql.hienThiDanhSach();
    }

    static void timKiemMenu() {
        System.out.println("\n========== TIM KIEM ==========");
        System.out.println("a. Tien to");
        System.out.println("b. Hau to");
        System.out.println("c. Gan giong");
        System.out.print("Chon: ");

        String c = sc.nextLine().toLowerCase();

        System.out.print("Nhap tu khoa: ");
        String tk = sc.nextLine();

        QuanLyThucPham kq;

        switch (c) {
            case "a":
                kq = ql.timTheoTienTo(tk);
                break;

            case "b":
                kq = ql.timTheoHauTo(tk);
                break;

            case "c":
                kq = ql.timGanGiong(tk);
                break;

            default:
                System.out.println("Khong hop le!");
                return;
        }

        System.out.println("Tim thay " + kq.laySoLuong() + " ket qua:");
        kq.hienThiDanhSach();
    }

    static void trichLocTheoNgay() {
        try {
            System.out.println("\n========== TRICH LOC ==========");
            System.out.println("a. Theo ngay SX");
            System.out.println("b. Theo ngay HH");
            System.out.print("Chon: ");

            String c = sc.nextLine().toLowerCase();

            System.out.print("Tu ngay (dd/MM/yyyy): ");
            LocalDate tu = LocalDate.parse(sc.nextLine(), df);

            System.out.print("Den ngay (dd/MM/yyyy): ");
            LocalDate den = LocalDate.parse(sc.nextLine(), df);

            QuanLyThucPham kq;

            if (c.equals("a")) {
                kq = ql.trichLocTheoNgaySanXuat(tu, den);

            } else if (c.equals("b")) {
                kq = ql.trichLocTheoNgayHetHan(tu, den);

            } else {
                System.out.println("Khong hop le!");
                return;
            }

            System.out.println(
                    "Trich loc duoc " + kq.laySoLuong() + " ket qua:"
            );

            kq.hienThiDanhSach();

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    static void thongKe() {
        System.out.println("\n========== THONG KE ==========");

        int tongSoLuong = ql.tinhTongSoLuong();
        double tongGiaTri = ql.tinhTongGiaTri();

        System.out.println("Tong so san pham: " + tongSoLuong);

        System.out.printf(
                "Tong gia tri: %,.0f VNĐ%n",
                tongGiaTri
        );

        if (tongSoLuong > 0) {
            System.out.printf(
                    "Gia trung binh: %,.0f VNĐ%n",
                    tongGiaTri / tongSoLuong
            );
        }

        ql.thongKeTheoThang();
    }
}
