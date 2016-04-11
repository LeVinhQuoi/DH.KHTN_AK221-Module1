package mydomain.com;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {
	public static void inMangSo(int mangSoNgauNhien[], int mangKiemTra[], int soPhanTu) {
		for (int i = 0; i < soPhanTu; i++) {
			if (mangKiemTra[i] == 1) {
				System.out.print("\t" + mangSoNgauNhien[i]);
			} else {
				System.out.print("\tX");
			}
		}
		System.out.println();
	}

	public static int demSoDung(int mangSoNgauNhien[], int mangKiemTra[], int soPhanTu, int nguoiDoan) {
		int dem = 0;
		for (int i = 0; i < soPhanTu; i++) {
			if (mangKiemTra[i] == 0) {
				if (mangSoNgauNhien[i] == nguoiDoan) {
					dem++;
					mangKiemTra[i] = 1;
				}
			}
		}
		return dem;
	}

public static void choi() {
Random rd = new Random();
int soPhanTu = 5;
int mangSoNgauNhien[] = new int[soPhanTu];
int mangKiemTra[] = new int[soPhanTu];
for (int i = 0; i < soPhanTu; i++) {
mangSoNgauNhien[i] = rd.nextInt(10);
mangKiemTra[i] = 0;
}
while (true) {
System.out.println("Moi ban doan so: ");
@SuppressWarnings("resource")
int nguoiDoan = new Scanner(System.in).nextInt();
int demDung = demSoDung(mangSoNgauNhien,
mangKiemTra, soPhanTu, nguoiDoan);
if (demDung == 0) {
	System.out.println("Khong co so " + nguoiDoan + "trong mang");} 
else {
			System.out.println("So " + nguoiDoan + " xuathien " + demDung + " lan trong mang.");
			System.out.println("Mang hien tai la: ");
			inMangSo(mangSoNgauNhien, mangKiemTra, soPhanTu);
			}
			}
			}

	public static void main(String[] args) {
		choi();
	}
}
