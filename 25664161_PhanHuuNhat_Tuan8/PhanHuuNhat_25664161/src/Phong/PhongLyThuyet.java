package Phong;

public class PhongLyThuyet extends PhongHoc{
	public boolean comayChieu;

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int sobongDen, boolean comayChieu) {
		super(maPhong, dayNha, dienTich, sobongDen);
		this.comayChieu = comayChieu;
	}
	public boolean datChuan() {
		return duAnhSang() && comayChieu;
	}
	
}
