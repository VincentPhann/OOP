package QLHH;

import java.time.LocalDate;

public abstract class SanPham {
	protected String maSP;
	protected String tenSP;
	protected LocalDate ngaySX;
	protected double giaNhap;
	protected int slTon;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public int getSlTon() {
		return slTon;
	}
	public void setSlTon(int slTon) {
		this.slTon = slTon;
	}
	public SanPham(String maSP, String tenSP, LocalDate ngaySX, double giaNhap, int slTon) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.ngaySX = ngaySX;
		this.giaNhap = giaNhap;
		this.slTon = slTon;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", ngaySX=" + ngaySX + ", gia=" + giaNhap + "VND, slTon=" + slTon
				+ "]";
	}
	public String getLoai() {
		
		return null; 
	}
	public double giaBan() {
		
		return 0;
	}
	public SanPham() {
		super();
	}
}
