package Phong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLyPhongHoc extends PhongHoc{
	List<PhongHoc> ls;
	public QuanLyPhongHoc() {
		ls = new ArrayList<PhongHoc>();
	}
	
	public boolean them(PhongHoc p) {
		for (PhongHoc ph : ls) {
			if(ph.getMaPhong().toLowerCase().equalsIgnoreCase(p.maPhong)) {
				return false;
			}
		}
		ls.add(p);
		return true;
	}
	public List<PhongHoc> tim(String maPhong){
		List<PhongHoc> kq = new ArrayList<>();
		for (PhongHoc ph : ls) {
			if(ph.getMaPhong().equalsIgnoreCase(maPhong)) {
				kq.add(ph);
			}
		}
		return kq;
		
	}
	public List<PhongHoc> layThongTin(){
		return new ArrayList<>(ls);
	}
	public List<PhongHoc> layThongTinPhongDatChuan(){
		List<PhongHoc> kq = new ArrayList<>();
		for (PhongHoc ph : ls) {
			if (ph.datChuan()) {
				kq.add(ph);
			}
		}
		return kq;
	}
	public List<PhongHoc> sapxepTangDanDN(){
		List<PhongHoc> kq = new ArrayList<>(ls);
		kq.sort(Comparator.comparing(PhongHoc::getDayNha));
		return kq;
	}
	public List<PhongHoc> sapxepGiamDanDT(){
		List<PhongHoc> kq = new ArrayList<>(ls);
		kq.sort(Comparator.comparingDouble(PhongHoc::getDienTich).reversed());
		return kq;
	}
	public List<PhongHoc> sapxepGiamDanBD(){
		List<PhongHoc> kq = new ArrayList<>(ls);
		kq.sort(Comparator.comparingInt(PhongHoc::getSobongDen).reversed());
		return kq;
	}
	public boolean capNhat(String maPhong, PhongHoc pMoi) {
	    for (int i = 0; i < ls.size(); i++) {
	        if (ls.get(i).getMaPhong().equalsIgnoreCase(maPhong)) {
	            ls.set(i, pMoi);
	            return true;
	        }
	    }
	    return false;
	}
	public boolean xoa(String maPhong) {
		return ls.removeIf(ls -> ls.getMaPhong().equalsIgnoreCase(maPhong));
	}
	public int tongPhong() {
		return ls.size();
	}
	public List<PhongHoc> layThongTin60May(){
		List<PhongHoc> kq = new ArrayList<>();
		for (PhongHoc ph : ls) {
			if (ph instanceof PhongMayTinh) {
				PhongMayTinh pmt = (PhongMayTinh) ph;
				if(pmt.getSomayTinh() == 60) {
					kq.add(pmt);
				}
			}
		}
		return kq;
	}
	@Override
	public boolean datChuan() {
		
		return false;
	}
	
}
