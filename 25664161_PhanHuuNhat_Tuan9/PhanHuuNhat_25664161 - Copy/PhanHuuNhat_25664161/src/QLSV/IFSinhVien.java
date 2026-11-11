package QLSV;
import java.util.List;
public interface IFSinhVien {
	boolean them(SinhVien sv);
	boolean sua(String maSV,SinhVien svMoi);
	boolean xoa(String maSV);
	boolean xoatatCa();
	
	List<SinhVien> layTatCa();
	SinhVien timTheoMa(String maSV);
	List<SinhVien> timTheoTen(String tuKhoa);
	List<SinhVien> timTheoLop(String tuKhoa);
	List<SinhVien> timTheoLoai(String tuKhoa);
	List<SinhVien> timTheoMon(String tuKhoa);
	int tongSoLuong();
	double tongThanhTien();
	List<SinhVien> sapXepTheoTen();
	List<SinhVien> sapXepTheoThanhTienGiamDan();
}
