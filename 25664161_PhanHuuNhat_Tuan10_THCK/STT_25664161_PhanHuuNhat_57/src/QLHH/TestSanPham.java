package QLHH;

import java.time.LocalDate;
public class TestSanPham {

	public static void main(String[] args) {
		QuanLySanPham ql = new QuanLySanPham();
	      
        SanPham p1 = new SanPhamDT(
            "M101", "Phone", LocalDate.of(2028, 02, 01), 100000f,10,LocalDate.of(2028, 02, 01)
        );

        SanPham p2 = new SanPhamDT(
            "M102", "Laptop", LocalDate.of(2027, 03, 22), 120000f, 20,LocalDate.of(2028, 02, 01)
        );

        SanPham p3 = new SanPhamTP(
            "M103", "Banh mi", LocalDate.of(2022, 02, 21), 10000f, 30,LocalDate.of(2028, 02, 01)
        );
        SanPham p4 = new SanPhamTP(
                "M104", "Sua", LocalDate.of(2024, 01, 30), 15000f, 22,LocalDate.of(2028, 02, 01)
            );
        SanPham p5 = new SanPhamTP(
                "M105", "Kem", LocalDate.of(2026, 06, 28), 20000f, 55,LocalDate.of(2028, 02, 01)
            );
      
        System.out.println("=== THEM SAN PHAM ===");
        System.out.println("Them M101: " + ql.themSanPham(p1));
        System.out.println("Them M102: " + ql.themSanPham(p2));
        System.out.println("Them M103: " + ql.themSanPham(p3));
        System.out.println("Them M104: " + ql.themSanPham(p4));
        System.out.println("Them M105: " + ql.themSanPham(p5));

        System.out.println("\n=== DANH SACH SAN PHAM ===");
        for (SanPham p : ql.layThongTin()) {
            System.out.println(p);
        }
        System.out.println("\nXoa M102: " + ql.xoa("M102"));
        System.out.println("\n=== DANH SACH SAU KHI XOA M102 ===");
        for (SanPham p : ql.layThongTin()) {
            System.out.println(p);
        }
        ql.suaSoLuongTon("M105", 33);
        System.out.println("====SAU KHI SUA SLTON CUA M105");
        for (SanPham p : ql.layThongTin()) {
            System.out.println(p);
        }
        System.out.println("=====XUAT THEO DIEN TU=====");
        for (SanPham p : ql.xuatSanPhamTheoLoai("Dien tu")) {
        	System.out.println(p);
        }
	}
}
