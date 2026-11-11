package phanHuuNhat25664161;
import java.time.LocalDate;

public class HangThucPham implements Comparable<HangThucPham>{
	private int id;
	private final String maHang;
	private String tenHang;
	private LocalDate ngaySx;
	private LocalDate ngayHh;
	private double gia;
	private static int dem = 0;
	
	public HangThucPham() {
		this.id = ++dem;
		this.maHang = "MAC_DINH";
		this.tenHang = "Hang mac dinh";
		this.ngaySx = LocalDate.now();
		this.ngayHh = LocalDate.now().plusDays(7);
		this.gia = 1.0f;
}
	public HangThucPham(int id, String maHang, String tenHang, LocalDate ngaySx, LocalDate ngayHh, double gia) {
		
		this.id = ++dem;
		if (maHang == null || maHang.trim().isEmpty())
			throw new IllegalArgumentException("Ma hang khong duoc de trong!");
		if(tenHang == null || tenHang.trim().isEmpty())
			throw new IllegalArgumentException("Ten hang khong duoc de trong!!");
		if ( gia <= 0)
			throw new IllegalArgumentException("Gia phai lon hon 0");
		
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.ngaySx = ngaySx;
		this.ngayHh = ngayHh;
		this.gia = gia;
	}
	private boolean CheckNgaySx(LocalDate ngaySx) {
		return ngaySx != null && !ngaySx.isAfter(LocalDate.now());
	}
	private boolean CheckNgayHh(LocalDate ngaySx, LocalDate ngayHh) {
		return ngaySx != null && ngayHh != null && !ngayHh.isAfter(ngaySx);
	}
	public int getId() {
		return id;
	}
	
	public String getTenHang() {
		return tenHang;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setTenHang(String tenHang) {
		if(tenHang == null || tenHang.trim().isEmpty())
			throw new IllegalArgumentException("Ten hang khong duoc rong!");
		this.tenHang = tenHang;
	}
	
	public LocalDate getNgaySx() {
		
		return ngaySx;
	}
	public void setNgaySx(LocalDate ngaySx) {
		if(!CheckNgaySx(ngaySx))
			throw new IllegalArgumentException("Ngay san xuat khong duoc tuong lai");
		if(this.ngayHh != null && !CheckNgayHh(ngaySx,this.ngayHh))
			throw new IllegalArgumentException("Ngay SX phai truoc ngay HH");
		this.ngaySx = ngaySx;
	}
	public LocalDate getNgayHh() {
		return ngayHh;
	}
	public void setNgayHh(LocalDate ngayHh) {
		if(this.ngaySx == null)
			throw new IllegalArgumentException("Chua co ngay Sx");
		if(!CheckNgayHh(this.ngaySx, ngayHh))
			throw new IllegalArgumentException("Ngay HH phai sau ngay Sx");
		this.ngayHh = ngayHh;
	}
	public double getGia() {
		if ( gia <= 0)
			throw new IllegalArgumentException("Gia phai lon hon 0!");
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public boolean CheckHetHan(LocalDate ngayHh) {
		return LocalDate.now().isAfter(this.ngayHh);
	}
	public String TrangThai() {
		LocalDate homNay = LocalDate.now();
		if (homNay.isBefore(ngaySx)) return "Chua san xuat";
		if(homNay.isBefore(ngayHh)) return "Chua het han";
		if(homNay.isAfter(ngayHh)) return "Da het han";
		long con = ngayHh.toEpochDay() - homNay.toEpochDay();
		return "Con" + con + "ngay";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new IllegalArgumentException("Khong the sao chpe hang thuc pham!!");
	}
	@Override
	public int compareTo(HangThucPham o) {
		return Integer.compare(this.id, o.id);
	}
	@Override
	public String toString() {
		return "HangThucPham [id=" + id + ", maHang=" + maHang + ", tenHang=" + tenHang + ", ngaySx=" + ngaySx
				+ ", ngayHh=" + ngayHh + ", gia=" + gia + "]";
	}
	
}

