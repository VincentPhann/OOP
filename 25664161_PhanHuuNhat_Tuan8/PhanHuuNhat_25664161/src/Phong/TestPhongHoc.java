package Phong;

import java.util.List;

public class TestPhongHoc {
    public static void main(String[] args) {

        QuanLyPhongHoc ql = new QuanLyPhongHoc();

      
        PhongHoc p1 = new PhongLyThuyet(
            "P101", "A", 50, 10, true
        );

        PhongHoc p2 = new PhongLyThuyet(
            "P102", "B", 60, 12, false
        );

        PhongHoc p3 = new PhongMayTinh(
            "P103", "C", 70, 15, 60
        );

      
        System.out.println("=== THEM PHONG ===");
        System.out.println("Them P101: " + ql.them(p1));
        System.out.println("Them P102: " + ql.them(p2));
        System.out.println("Them P103: " + ql.them(p3));

      
        System.out.println("\n=== DANH SACH PHONG ===");
        for (PhongHoc p : ql.layThongTin()) {
            System.out.println(p);
        }


        System.out.println("\n=== TIM PHONG P102 ===");
        List<PhongHoc> dsTim = ql.tim("P102");

        for (PhongHoc p : dsTim) {
            System.out.println(p);
        }

 
        System.out.println("\n=== PHONG DAT CHUAN ===");
        for (PhongHoc p : ql.layThongTinPhongDatChuan()) {
            System.out.println(p);
        }

       
        System.out.println("\n=== SAP XEP TANG DAN DAY NHA ===");
        for (PhongHoc p : ql.sapxepTangDanDN()) {
            System.out.println(p);
        }

        System.out.println("\n=== SAP XEP GIAM DAN DIEN TICH ===");
        for (PhongHoc p : ql.sapxepGiamDanDT()) {
            System.out.println(p);
        }

      
        System.out.println("\n=== SAP XEP GIAM DAN SO BONG DEN ===");
        for (PhongHoc p : ql.sapxepGiamDanBD()) {
            System.out.println(p);
        }

        System.out.println("\n=== PHONG MAY TINH CO 60 MAY ===");
        for (PhongHoc p : ql.layThongTin60May()) {
            System.out.println(p);
        }

        System.out.println("\nTong so phong: " + ql.tongPhong());

  
        System.out.println("\nXoa P102: " + ql.xoa("P102"));

        System.out.println("Tong so phong sau khi xoa: "
                + ql.tongPhong());
    }
}