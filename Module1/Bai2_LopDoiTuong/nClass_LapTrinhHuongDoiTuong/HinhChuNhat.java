package nClass_LapTrinhHuongDoiTuong;

public class HinhChuNhat {
	// Khai bao thuoc tinh.
	private int n_chieuday;
	private int m_chieurong;

	public int getN_chieuday() {
		return n_chieuday;
	}

	public void setN_chieuday(int n_chieuday) {
		this.n_chieuday = n_chieuday;
	}

	public int getM_chieurong() {
		return m_chieurong;
	}

	public void setM_chieurong(int m_chieurong) {
		this.m_chieurong = m_chieurong;
	}

	// Phuong thuc khoi tao.
	public HinhChuNhat() {
		n_chieuday = m_chieurong = 0;
	}

	public HinhChuNhat(int n, int m) {
		this.n_chieuday = n;
		this.m_chieurong = m;
	}

	// Phuong thuc xu ly
	public double ChuViHinhChuNhat() {
		return (n_chieuday + m_chieurong) / 2;
	}

	public double DienTichHinhChuNhat() {
		return (n_chieuday * m_chieurong);
	}
}
