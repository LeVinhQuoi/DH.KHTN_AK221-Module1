package nClass_LapTrinhHuongDoiTuong;

public class TamGiac {
	// Khai bao thuoc tinh.
	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;

	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	// Phuong thuc khoi tao.
	public TamGiac() {
		a = b = c = 0;
	}

	public TamGiac(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// phuong thuc xu ly.
	public boolean KiemTraTamGiac() {
		if ((a + b > c) && (a + c > b) && (c + b > a))
			return true;
		else
			return false;
	}

	public int ChuViTamGiac() {
		return (a + b + c);
	}

	public double DienTichTamGiac() {
		double p = ChuViTamGiac() / 2;
		return (p * (p - a) * (p - b) * (p - c));
	}
	
}
