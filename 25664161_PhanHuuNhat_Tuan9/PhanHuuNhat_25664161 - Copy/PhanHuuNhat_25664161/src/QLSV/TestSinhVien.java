package QLSV;

import java.time.LocalDate;
import java.util.List;

public class TestSinhVien {
	public static void inDanhSach(List<SinhVien> list) {
		if (list.isEmpty()) {
			System.out.println("Danh sach trong!");
			return;
		}
		for (SinhVien sv : list) {
			System.out.println(sv);
		}
	}

	public static void main(String[] args) {
		IFSinhVien qlsv = new ListSinhVien();


		qlsv.them(new SinhVienChinhQui("SV01", "Nguyen Van An", LocalDate.of(2005, 5, 12), "DHKTPM19A", 3, MonHoc.LAP_TRINH_JAVA, "Phong H4.01"));
		qlsv.them(new SinhVienTuXa("SV02", "Tran Thi Binh", LocalDate.of(2004, 8, 20), "DHKTPM18B", 4, MonHoc.CO_SO_DU_LIEU, "Zoom"));
		qlsv.them(new SinhVienChinhQui("SV03", "Le Hoang Cuong", LocalDate.of(2005, 1, 15), "DHKTPM19A", 3, MonHoc.TRI_TUE_NHAN_TAO, "Phong A2.03"));
		qlsv.them(new SinhVienTuXa("SV04", "Pham Minh Dung", LocalDate.of(2003, 11, 30), "DHHTTT17A", 3, MonHoc.LAP_TRINH_WEB, "Google Meet"));

	
		System.out.println("=== DANH SACH SINH VIEN BAN DAU ===");
		inDanhSach(qlsv.layTatCa());

	
		System.out.println("\nTong so luong sinh vien: " + qlsv.tongSoLuong());
		System.out.printf("Tong thanh tien hoc phi: %,.0f VND\n", qlsv.tongThanhTien());


		System.out.println("\n=== TIM SINH VIEN THEO TEN 'Binh' ===");
		inDanhSach(qlsv.timTheoTen("Binh"));

		System.out.println("\n=== TIM SINH VIEN THEO LOAI 'Tu xa' ===");
		inDanhSach(qlsv.timTheoLoai("Tu xa"));

		
		System.out.println("\n=== SAP XEP THEO THANH TIEN GIAM DAN ===");
		inDanhSach(qlsv.sapXepTheoThanhTienGiamDan());

		
		System.out.println("\n=== SAU KHI XOA SV02 ===");
		qlsv.xoa("SV02");
		inDanhSach(qlsv.layTatCa());
	}
}