package Phong;

public class PhongThiNghiem extends PhongHoc{
	public String chuyenNganh;
	public int sucChua;
	public boolean coBonRua;
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int sobongDen, String chuyenNganh,
			int sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, sobongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	

	public boolean datChuan() {
		return duAnhSang() && coBonRua;
	}
}
