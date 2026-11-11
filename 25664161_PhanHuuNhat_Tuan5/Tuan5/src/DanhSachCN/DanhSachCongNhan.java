package DanhSachCN;

import java.util.Scanner;
public class DanhSachCongNhan {
	private CongNhan[] ds;
	private int n;
	
	public DanhSachCongNhan(int n) {
		this.ds = new CongNhan[n];
	}
	public void themCN() {
		Scanner sc = new Scanner(System.in);
		if ( n > ds.length) {
			System.out.println("Dach sach day!");
			return;
		}
		CongNhan cn = new CongNhan();
		System.out.print("Nhap ma CN: ");
		cn.setMaCN(sc.nextInt());

		sc.nextLine();
		System.out.print("Nhap ho: ");
		cn.setmHo(sc.nextLine());

		System.out.print("Nhap ten: ");
		cn.setmTen(sc.nextLine());

		System.out.print("Nhap so SP: ");
		cn.setmSoSP(sc.nextInt());

		ds[n] = cn;
		n++;
	}
	public void inDS() {
		CongNhan.tieuDe();
		for (int i=0;i<n;i++) {
			System.out.println(ds[i]);
		}
	}
	public int demCN() {
		int count = 0;
		for (int i=0;i<n;i++) {
			count++;
		}
		System.out.println(count);
		return count;
	}
	
	public void inSP200() {

		for (int i=0;i<n;i++) {
			if (ds[i].getmSoSP() < 200) {
				break;
			}
				else if(ds[i].getmSoSP() > 200) {
				System.out.println(ds[i]);
			}
			}
		}
	public void sapXep() {
		for (int i=0;i<n-1;i++) {
			for (int j = i;j<n;j++) {
				if (ds[i].getmSoSP() < ds[j].getmSoSP()) {
					CongNhan t = this.ds[i];
					this.ds[i] = this.ds[j];
					this.ds[j] = t;
				}
			}
		}
	}
}
