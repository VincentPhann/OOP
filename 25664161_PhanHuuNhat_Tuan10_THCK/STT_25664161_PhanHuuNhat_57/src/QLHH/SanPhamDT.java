package QLHH;

import java.time.LocalDate;

public class SanPhamDT extends SanPham{
	private LocalDate baoHanh;

	public LocalDate getBaoHanh() {
		return baoHanh;
	}

	public void setBaoHanh(LocalDate baoHanh) {
		this.baoHanh = baoHanh;
	}

	public SanPhamDT(String maSP, String tenSP, LocalDate ngaySX, double gia, int slTon, LocalDate baoHanh) {
		super(maSP, tenSP, ngaySX, gia, slTon);
		this.baoHanh = baoHanh;
	}
	@Override
	public double giaBan() {
		return giaNhap + (giaNhap * 0.1) + (baoHanh.getMonthValue() * 50000);
	}
	@Override
	public String getLoai() {
		return "Dien Tu";
	}
	
	
}
