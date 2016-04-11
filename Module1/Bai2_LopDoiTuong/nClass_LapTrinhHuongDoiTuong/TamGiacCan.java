package nClass_LapTrinhHuongDoiTuong;

public class TamGiacCan extends TamGiac {
	public TamGiacCan(){
		
	}
	public double ChuViTamGiacCan(){
		return super.ChuViTamGiac();
	}
	public double DienTichTamGiacCan(){
		return super.DienTichTamGiac();
	}
	public static double TongDienTichTamGiac(){
		double Tong=0;
		TamGiacCan tg = new TamGiacCan();
		Tong+=tg.DienTichTamGiac();
		return Tong;
	}
}