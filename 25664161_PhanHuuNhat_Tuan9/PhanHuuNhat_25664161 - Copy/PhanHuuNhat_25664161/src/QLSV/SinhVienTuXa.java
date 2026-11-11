package QLSV;

import java.time.LocalDate;

public class SinhVienTuXa extends SinhVien {
	private String nentang;

	public SinhVienTuXa(String maSV, String hoTen, LocalDate ngaySinh, String lop, int sotinChi, QLSV.MonHoc monHoc,
			String nentang) {
		super(maSV, hoTen, ngaySinh, lop, sotinChi, monHoc);
		this.nentang = nentang;
	}

	public String getNentang() {
		return nentang;
	}

	public void setNentang(String nentang) {
		this.nentang = nentang;
	}
	@Override
	public String getLoai() {
		return "Tu xa";
	}
	@Override
	public String getThongTinRieng() {
		return "Hoc online qua: "+nentang;
	}
	@Override
	public double thanhTien() {
		return super.thanhTien()* 0.9;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + getThongTinRieng();
	}
	
}
