package QLSV;

import java.time.LocalDate;

public class SinhVienChinhQui extends SinhVien {
	private String hocTrucTiep;

	public SinhVienChinhQui(String maSV, String hoTen, LocalDate ngaySinh, String lop, int sotinChi, QLSV.MonHoc monHoc,
			String hocTrucTiep) {
		super(maSV, hoTen, ngaySinh, lop, sotinChi, monHoc);
		this.hocTrucTiep = hocTrucTiep;
	}

	public String getHocTrucTiep() {
		return hocTrucTiep;
	}

	public void setHocTrucTiep(String hocTrucTiep) {
		this.hocTrucTiep = hocTrucTiep;
	}
	@Override
	public String getLoai() {
		return "Chinh Quy";
	}
	@Override
	public String getThongTinRieng() {
		return "Hoc truc tiep tai: "+hocTrucTiep;
	}


	@Override
	public String toString() {
		return super.toString() + " | " + getThongTinRieng();
	}
	
}
