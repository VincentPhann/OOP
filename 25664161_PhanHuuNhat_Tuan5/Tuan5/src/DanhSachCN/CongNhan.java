package DanhSachCN;

public class CongNhan {
	private int maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		if (mSoSP < 0) {
			throw new IllegalArgumentException("So san phan < 0 !!");
		}
		this.mSoSP = mSoSP;
			
	}
	public CongNhan(){
		
	}
	public CongNhan(int maCN, String mHo, String mTen, int mSoSP){
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	public double tinhLuong(int mSoSP) {
		double tong = 0;
		if (mSoSP >= 1 && mSoSP <=199  ) {
			tong = mSoSP * 0.5;
		}
		else if (mSoSP >= 200 && mSoSP <=399) {
			tong = 199 * 0.5 + (mSoSP - 199) * 0.55;  
		}
		else if (mSoSP >= 400 && mSoSP <=599) {
			tong = 199 * 0.55 + 199 * 0.5 + (mSoSP - (199 * 2)) * 0.6;  
		}
		else if (mSoSP > 600 ) {
			tong = 199 * 0.6 + 199 * 0.55 + 199 * 0.5 + (mSoSP - (199* 3)) * 0.65;  
		}
		return tong;
	}
	public static void tieuDe() {
		System.out.println("In danh sach: ");
		String s = String.format("|%10s|%10s|%10s|%10s|","Ma CN","Ho","Ten","SoSP");
		System.out.println(s);
	}
	@Override
	public String toString() {
		return String.format("|%10d|%10s|%10s|%10d|",maCN,mHo,mTen,mSoSP);
	}
	
}
