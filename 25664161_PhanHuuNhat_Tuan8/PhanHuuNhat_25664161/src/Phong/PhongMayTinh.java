package Phong;

public class PhongMayTinh extends PhongHoc {
	public int somayTinh;

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int sobongDen, int somayTinh) {
		super(maPhong, dayNha, dienTich, sobongDen);
		this.somayTinh = somayTinh;
	}

	public int getSomayTinh() {
		return somayTinh;
	}

	public boolean datChuan() {
		return duAnhSang()  && somayTinh > 0 && dienTich >= 1.5;
	}

	

	
	
}
