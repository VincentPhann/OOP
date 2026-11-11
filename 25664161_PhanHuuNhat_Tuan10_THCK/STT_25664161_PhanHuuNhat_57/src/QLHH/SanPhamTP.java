package QLHH;

import java.time.LocalDate;

public class SanPhamTP extends SanPham{
	private LocalDate ngayHH;

	public LocalDate getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}

	public SanPhamTP(String maSP, String tenSP, LocalDate ngaySX, double giaNhap, int slTon, LocalDate ngayHH) {
		super(maSP, tenSP, ngaySX, giaNhap, slTon);
		this.ngayHH = ngayHH;
	}
	@Override
	public double giaBan() {
		if(ngayHH.isAfter(getNgaySX())) {
		return 0;
		}
		return giaNhap + (giaNhap * 0.05);
	}
	@Override
	public String getLoai() {
		return "Thuc Pham";
	}
	
}
