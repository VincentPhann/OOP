package Phong;

public abstract class PhongHoc {
	protected String maPhong,dayNha;
	protected double dienTich;
	protected int sobongDen;
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSobongDen() {
		return sobongDen;
	}
	public void setSobongDen(int sobongDen) {
		this.sobongDen = sobongDen;
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int sobongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.sobongDen = sobongDen;
	}
	public PhongHoc() {
		super();
	}
	@Override
	public String toString() {
		return "PhongHoc [maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", sobongDen="
				+ sobongDen + "]";
	}
	public abstract boolean datChuan();
	public boolean duAnhSang() {
	    return sobongDen > 0 && dienTich / sobongDen <= 10;
	}
}
