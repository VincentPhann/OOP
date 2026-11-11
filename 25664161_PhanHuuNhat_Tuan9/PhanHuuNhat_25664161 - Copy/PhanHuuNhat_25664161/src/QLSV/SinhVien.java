package QLSV;

import java.time.LocalDate;

public class SinhVien {
	protected String maSV;
	protected String hoTen;
	protected LocalDate ngaySinh;
	protected String lop;
	protected int sotinChi;
	protected MonHoc monHoc; // Đổi từ MonHoc -> monHoc cho đúng chuẩn

	public SinhVien(String maSV, String hoTen, LocalDate ngaySinh, String lop, int sotinChi, MonHoc monHoc) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.sotinChi = sotinChi;
		this.monHoc = monHoc;
	}

	public double thanhTien() {
		return sotinChi * monHoc.getDonGia();
	}

	public String getLoai() {
		return "Sinh Vien";
	}

	public String getThongTinRieng() {
		return "";
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public int getSotinChi() {
		return sotinChi;
	}

	public void setSotinChi(int sotinChi) {
		this.sotinChi = sotinChi;
	}

	public MonHoc getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}

	@Override
	public String toString() {
		return String.format("MaSV: %-6s | HoTen: %-18s | NgaySinh: %-10s | Lop: %-8s | TinChi: %-2d | Mon: %-38s | ThanhTien: %,.0f VND | Loai: %-10s",
				maSV, hoTen, ngaySinh, lop, sotinChi, monHoc, thanhTien(), getLoai());
	}
}