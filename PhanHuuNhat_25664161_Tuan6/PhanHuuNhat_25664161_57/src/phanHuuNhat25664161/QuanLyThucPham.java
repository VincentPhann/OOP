package phanHuuNhat25664161;
import java.time.LocalDate;
public class QuanLyThucPham {
	private HangThucPham[] ds;
	private int soLuong;
	private int khaNang;
	private static final int BanDau = 5;
	public QuanLyThucPham() {
		this.khaNang = BanDau;
		this.ds = new HangThucPham[khaNang];
		this.soLuong = 0;
	}
	private void moRongMang() {
		int kichthuocMoi = khaNang *2;
		HangThucPham[] mangMoi = new HangThucPham[kichthuocMoi];
		for (int i=0;i<kichthuocMoi;i++) {
			mangMoi[i] = ds[i];
		}
		ds = mangMoi;
		khaNang = kichthuocMoi;
	}
	public int timViTriTheoMa(String maHang) {
		for (int i=0;i<soLuong;i++) {
			if (ds[i].getMaHang().equalsIgnoreCase(maHang))
				return i;
		}
		return -1;
	}
	public int timViTriTheoId(int id) {
		for (int i=0;i<soLuong;i++) {
			if(ds[i].getId() == id) return i;
		}
		return -1;
	}
	public boolean them(HangThucPham h) {
		if(timViTriTheoMa(h.getMaHang()) != -1) {
			System.out.println("Loi!! Ma hang da ton tai");
			return false;
			
		}
		if (soLuong == khaNang) moRongMang();
		ds[soLuong] = h;
		soLuong++;
		return true;
			
	}
	public boolean xoa(int id) {
		int viTri = timViTriTheoId(id);
		if(viTri == -1) {
			System.out.println("Khong tim thay hang co id " + id);
			return false;
		}
		for (int i = viTri;i<soLuong - 1;i++) {
			ds[i] = ds[i+1];
			
		}
		ds[soLuong -1] = null;
		soLuong--;
		return true;
		
	}
	public boolean sua(int id, String tenMoi, LocalDate ngaySxMoi, LocalDate ngayHhMoi, double giaMoi) {
		int viTri = timViTriTheoId(id);
		if(viTri == -1) {
			System.out.println("Khong tim thay hang co id "+id);
			return false;
		}
		HangThucPham h = ds[viTri];
		h.setTenHang(tenMoi);
		h.setNgaySx(ngaySxMoi);
		h.setNgayHh(ngayHhMoi);
		h.setGia(giaMoi);
		return true;
	}
	public void sapXepTheoNgayHh(boolean tangDan) {
		for (int i=0;i<soLuong - 1;i++) {
			for (int j= i+1;j<soLuong;j++) {
				boolean canDoi = tangDan ? ds[i].getNgayHh().isAfter(ds[j].getNgayHh()) :
					ds[i].getNgayHh().isBefore(ds[j].getNgayHh());
				if(canDoi) {
					HangThucPham t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}

		}
	}
	public HangThucPham timTheoId(int id) {
	    int viTri = timViTriTheoId(id);
	    return (viTri == -1) ? null : ds[viTri];
	}

	public void sapXepTheoGia(boolean tangDan) {
	    for (int i = 0; i < soLuong - 1; i++) {
	        for (int j = i + 1; j < soLuong; j++) {
	            boolean canDoi = tangDan
	                    ? ds[i].getGia() > ds[j].getGia()
	                    : ds[i].getGia() < ds[j].getGia();

	            if (canDoi) {
	                HangThucPham temp = ds[i];
	                ds[i] = ds[j];
	                ds[j] = temp;
	            }
	        }
	    }
	    System.out.println("Đã sắp xếp theo giá " + (tangDan ? "tăng dần" : "giảm dần"));
	}

	public void sapXepTheoNgaySanXuat(boolean tangDan) {
	    for (int i = 0; i < soLuong - 1; i++) {
	        for (int j = i + 1; j < soLuong; j++) {
	            boolean canDoi = tangDan
	                    ? ds[i].getNgaySx().isAfter(ds[j].getNgaySx())
	                    : ds[i].getNgaySx().isBefore(ds[j].getNgaySx());

	            if (canDoi) {
	                HangThucPham temp = ds[i];
	                ds[i] = ds[j];
	                ds[j] = temp;
	            }
	        }
	    }
	    System.out.println("Đã sắp xếp theo ngày SX " + (tangDan ? "tăng dần" : "giảm dần"));
	}

	public QuanLyThucPham timTheoTienTo(String tuKhoa) {
		QuanLyThucPham kq = new QuanLyThucPham();
		String tk = tuKhoa.toLowerCase();
		for (int i=0;i<soLuong;i++) {
			if (ds[i].getTenHang().toLowerCase().startsWith(tk));
			kq.them(ds[i]);
		}
		return kq;
	}
	public QuanLyThucPham timTheoHauTo(String tuKhoa) {
		QuanLyThucPham kq = new QuanLyThucPham();
		String tk = tuKhoa.toLowerCase();
		for (int i=0;i<soLuong;i++) {
			if(ds[i].getTenHang().toLowerCase().endsWith(tk));
			kq.them(ds[i]);
		}
		return kq;
	}
	public QuanLyThucPham timGanGiong(String tuKhoa) {
	    QuanLyThucPham kq = new QuanLyThucPham();
	    String tk = tuKhoa.toLowerCase();
	    for (int i = 0; i < soLuong; i++) {
	        if (ds[i].getTenHang().toLowerCase().contains(tk))
	            kq.them(ds[i]);
	    }
	    return kq;
	}

	public QuanLyThucPham trichLocTheoNgaySanXuat(LocalDate tuNgay, LocalDate denNgay) {
	    QuanLyThucPham kq = new QuanLyThucPham();
	    for (int i = 0; i < soLuong; i++) {
	        LocalDate ngaySX = ds[i].getNgaySx();
	        if (!ngaySX.isBefore(tuNgay) && !ngaySX.isAfter(denNgay))
	            kq.them(ds[i]);
	    }
	    return kq;
	}

	public QuanLyThucPham trichLocTheoNgayHetHan(LocalDate tuNgay, LocalDate denNgay) {
	    QuanLyThucPham ketQua = new QuanLyThucPham();
	    for (int i = 0; i < soLuong; i++) {
	        LocalDate ngayHH = ds[i].getNgayHh();
	        if (!ngayHH.isBefore(tuNgay) && !ngayHH.isAfter(denNgay))
	            ketQua.them(ds[i]);
	    }
	    return ketQua;
	}

	public int tinhTongSoLuong() {
	    return soLuong;
	}

	public double tinhTongGiaTri() {
	    double tong = 0;
	    for (int i = 0; i < soLuong; i++)
	        tong += ds[i].getGia();
	    return tong;
	}

	public void thongKeTheoThang() {
	    if (soLuong == 0) {
	        System.out.println("Danh sách trống.");
	        return;
	    }

	    int[] demTheoThang = new int[13];

	    for (int i = 0; i < soLuong; i++) {
	        int thang = ds[i].getNgaySx().getMonthValue();
	        demTheoThang[thang]++;
	    }

	    System.out.println("THỐNG KÊ SẢN PHẨM THEO THÁNG SẢN XUẤT:");

	    for (int t = 1; t <= 12; t++)
	        if (demTheoThang[t] > 0)
	            System.out.println("Tháng " + t + ": " + demTheoThang[t] + " sản phẩm");
	}

	public void hienThiDanhSach() {
	    if (soLuong == 0) {
	        System.out.println("Danh sách trống.");
	        return;
	    }

	    System.out.println("\n+--------------------------------------------------------------------------------+");
	    System.out.println("|   ID   |  Mã hàng  |       Tên hàng       |   Ngày SX   |   Ngày HH   |  Giá  |");
	    System.out.println("+--------------------------------------------------------------------------------+");

	    for (int i = 0; i < soLuong; i++)
	        System.out.println(ds[i]);

	    System.out.println("+--------------------------------------------------------------------------------+");
	    System.out.println("Tổng: " + soLuong + " sản phẩm.");
	}

	public int laySoLuong() {
	    return soLuong;
	}

}
