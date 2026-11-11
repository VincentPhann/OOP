package QLSV;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSinhVien implements IFSinhVien {
	private List<SinhVien> ds;

	public ListSinhVien() {
		this.ds = new ArrayList<>();
	}

	@Override
	public boolean them(SinhVien sv) {
		if (sv == null || timTheoMa(sv.getMaSV()) != null) {
			return false; // Không thêm nếu trùng mã SV
		}
		return ds.add(sv);
	}

	@Override
	public boolean sua(String maSV, SinhVien svMoi) {
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getMaSV().equalsIgnoreCase(maSV)) {
				ds.set(i, svMoi);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean xoa(String maSV) {
		SinhVien sv = timTheoMa(maSV);
		if (sv != null) {
			return ds.remove(sv);
		}
		return false;
	}

	@Override
	public boolean xoatatCa() {
		if (ds.isEmpty()) return false;
		ds.clear();
		return true;
	}

	@Override
	public List<SinhVien> layTatCa() {
		return new ArrayList<>(ds);
	}

	@Override
	public SinhVien timTheoMa(String maSV) {
		for (SinhVien sv : ds) {
			if (sv.getMaSV().equalsIgnoreCase(maSV)) {
				return sv;
			}
		}
		return null;
	}

	@Override
	public List<SinhVien> timTheoTen(String tuKhoa) {
		List<SinhVien> ketQua = new ArrayList<>();
		for (SinhVien sv : ds) {
			if (sv.getHoTen().toLowerCase().contains(tuKhoa.toLowerCase())) {
				ketQua.add(sv);
			}
		}
		return ketQua;
	}

	@Override
	public List<SinhVien> timTheoLop(String tuKhoa) {
		List<SinhVien> ketQua = new ArrayList<>();
		for (SinhVien sv : ds) {
			if (sv.getLop().equalsIgnoreCase(tuKhoa)) {
				ketQua.add(sv);
			}
		}
		return ketQua;
	}

	@Override
	public List<SinhVien> timTheoLoai(String tuKhoa) {
		List<SinhVien> ketQua = new ArrayList<>();
		for (SinhVien sv : ds) {
			if (sv.getLoai().toLowerCase().contains(tuKhoa.toLowerCase())) {
				ketQua.add(sv);
			}
		}
		return ketQua;
	}

	@Override
	public List<SinhVien> timTheoMon(String tuKhoa) {
		List<SinhVien> ketQua = new ArrayList<>();
		for (SinhVien sv : ds) {
			if (sv.getMonHoc().getTenMon().toLowerCase().contains(tuKhoa.toLowerCase())) {
				ketQua.add(sv);
			}
		}
		return ketQua;
	}

	@Override
	public int tongSoLuong() {
		return ds.size();
	}

	@Override
	public double tongThanhTien() {
		double tong = 0;
		for (SinhVien sv : ds) {
			tong += sv.thanhTien();
		}
		return tong;
	}

	@Override
	public List<SinhVien> sapXepTheoTen() {
		List<SinhVien> banSao = new ArrayList<>(ds);
		banSao.sort(Comparator.comparing(SinhVien::getHoTen, String.CASE_INSENSITIVE_ORDER));
		return banSao;
	}

	@Override
	public List<SinhVien> sapXepTheoThanhTienGiamDan() {
		List<SinhVien> banSao = new ArrayList<>(ds);
		banSao.sort((sv1, sv2) -> Double.compare(sv2.thanhTien(), sv1.thanhTien()));
		return banSao;
	}
}