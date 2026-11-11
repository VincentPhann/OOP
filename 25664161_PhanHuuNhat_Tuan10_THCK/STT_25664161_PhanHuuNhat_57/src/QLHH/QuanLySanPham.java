package QLHH;

import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham extends SanPham{
	List<SanPham> danhSach;
	public QuanLySanPham() {
		danhSach = new ArrayList<SanPham>();
	}
	public SanPham timTheoMa(String maSp) {
		for (SanPham sp : danhSach) {
			if(sp.getMaSP().equalsIgnoreCase(maSp))
				return sp;
		}
		return null;
	}
	public List<SanPham> layThongTin(){
		return new ArrayList<>(danhSach);
	}
	public boolean themSanPham(SanPham sp) {
		if(sp == null) return false;
		if(timTheoMa(sp.getMaSP()) != null) return false;
		return danhSach.add(sp);
	}
	public boolean xoa(String maSp) {
		return danhSach.removeIf(sp -> sp.getMaSP().equalsIgnoreCase(maSp));
	}
	public boolean suaSoLuongTon(String maSp,int soLuongMoi) {
		for (SanPham sp : danhSach) {
			if(sp.getMaSP().equalsIgnoreCase(maSp)) {
				sp.setSlTon(soLuongMoi);
				return true;
			}
		}
		return false;
	}
	public List<SanPham> xuatSanPhamTheoLoai(String loai){
		List<SanPham> kq = new ArrayList<>();
		for (SanPham sp : danhSach) {
			
				if(sp.getLoai().equalsIgnoreCase(loai.toLowerCase())) {
					kq.add(sp);
				}
			}
		
		return kq;
	}
	
}
