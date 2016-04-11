package nClass_LapTrinhHuongDoiTuong;

public class PhanSo {
	// Khai bao thuoc tinh.
	private int tu;
	private int mau;

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {

		this.mau = mau;

	}

	// Phuong thuc khoi tao.
	public PhanSo() {
		tu = 0;
		mau = 1;
	}

	public void xuat() {
		System.out.println(tu + "/" + mau);
	}

	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	// Phuong thuc xu ly
	public PhanSo TongPhanSo(PhanSo n, PhanSo m) {
		PhanSo p = new PhanSo();
		p.tu = ((n.tu * m.mau) + (m.tu * n.mau));
		p.mau = n.mau * m.mau;
		this.PhanSoToiGian();
		return p;
	}

	public PhanSo HieuPhanSo(PhanSo n, PhanSo m) {
		PhanSo p = new PhanSo();
		p.tu = (n.tu * m.mau) - (m.tu * n.mau);
		p.mau = n.mau * m.mau;
		this.PhanSoToiGian();
		return p;
	}

	public PhanSo TichPhanSo(PhanSo n, PhanSo m) {
		PhanSo p = new PhanSo();
		p.tu = n.tu * m.tu;
		p.mau = n.mau * m.mau;
		this.PhanSoToiGian();
		return p;
	}

	public PhanSo ThuongPhanSo(PhanSo n, PhanSo m) {
		PhanSo p = new PhanSo();
		p.tu = n.tu * m.mau;
		p.mau = n.tu * m.mau;
		this.PhanSoToiGian();
		return p;
	}

	public int UocSoLonNhat() {
		if (this.tu > this.mau) {
			for (int i = this.mau; i >= 1; i--) {
				if (this.tu % i == 0 && this.mau % i == 0)
					return i;
			}
		} else {
			for (int i = this.tu; i >= 1; i--) {
				if (this.tu % i == 0 && this.mau % i == 0)
					return i;
			}
		}
		return 1;
	}

	public PhanSo PhanSoToiGian() {
		int Uscln = UocSoLonNhat();
		this.tu = this.tu / Uscln;
		this.mau = this.mau / Uscln;
		return this;
	}
}
