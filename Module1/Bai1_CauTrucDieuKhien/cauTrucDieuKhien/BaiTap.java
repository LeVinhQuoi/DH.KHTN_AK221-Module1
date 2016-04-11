package cauTrucDieuKhien;

import java.util.Scanner;

public class BaiTap {
	public boolean KiemTraNguyenTo(int n) {
		if (n == 2)
			return true;
		if (n < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++)
				if (n % i == 0)
					return true;
			return false;
		}
	}

	public boolean KiemTraChinhPhuong(int n) {
		int i = (int) Math.sqrt(n);
		if (n == i * i)
			return true;
		return false;
	}

	public boolean KiemTraHoanHao(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				s += i;
		}
		if (n == s)
			return true;
		else
			return false;
	}

	public boolean KiemTraLapPhuong(int n) {
		if (n == 1 || n == 0)
			return true;
		for (int i = 2; i < n; i++) {
			if (i * i * i == n)
				return true;
		}
		return false;
	}

	public boolean KiemTraDoiXung(int n) {
		int k = n;
		int m = 0;
		while (k > 0) {
			m = 10 * m + k % 10;
			k = k / 10;
		}
		if (n == m)
			return true;
		else
			return false;
	}

	public boolean KiemTraNamNhuan(int n) {
		if (n % 4 == 0 && n > 1900)
			return true;
		else
			return false;
	}

	public int TinhTong(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++)
			s += i;
		return s;
	}

	public double TinhTongPhanSo(int n) {
		double s = 0.0;
		for (int i = 2; i <= n; i++)
			s += (double) ((i - 1.0) / i);
		return s;
	}

	public static int Fibonacci(int n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	public static void printListFib(int n) {
		for (int i = 1; i <= n; i++) {
			int fi = Fibonacci(i);
			System.out.print(fi + " ");
		}
	}

	public static void main(String[] args) {
		BaiTap bt = new BaiTap();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println(" -----------------Menu-----------------");
			System.out.println("MaDe1-Kiem Tra So Nguyen To ");
			System.out.println("MaDe2-Kiem Tra So Chinh Phuong  ");
			System.out.println("MaDe3-Kiem Tra So Hoan Hao ");
			System.out.println("MaDe4-Kiem Tra So Lap Phuong ");
			System.out.println("MaDe5-Kiem Tra So Doi Xung ");
			System.out.println("MaDe6-Kiem Tra Nam Nhuan");
			System.out.println("MaDe7-Tinh Tong  ");
			System.out.println("MaDe8-Tinh Tong Phan So ");
			System.out.println("MaDe9-Fibonaci");
			System.out.println("Nhap so nguyen duong  :");
			int n = scanner.nextInt();
			System.out.println("Moi chon MaDe ?");
			int chon = scanner.nextInt();
			System.out.print("\n");
			switch (chon) {
			case 1:
				if (bt.KiemTraNguyenTo(n) == true) {
					System.out.println(n + " la so nguyen to.");
				} else
					System.out.println(n + " khong la so nguyen to.");
				break;
			case 2:
				if (bt.KiemTraChinhPhuong(n) == true) {
					System.out.println(n + " la so chinh phuong.");
				} else
					System.out.println(n + " khong la so chinh phuong .");
				break;
			case 3:
				if (bt.KiemTraHoanHao(n) == true) {
					System.out.println(n + " la so hoan hao.");
				} else
					System.out.println(n + " khong la so hoan hao.");
				break;
			case 4:
				if (bt.KiemTraLapPhuong(n) == true) {
					System.out.println(n + " la so lap phuong.");
				} else
					System.out.println(n + " khong la so lap phuong.");
				break;
			case 5:
				if (bt.KiemTraDoiXung(n) == true) {
					System.out.println(n + " la so doi xung.");
				} else
					System.out.println(n + " khong la so doi xung.");
				break;

			case 6:
				if (bt.KiemTraNamNhuan(n) == true) {
					System.out.println(n + " la nam nhuan.");
				} else
					System.out.println(n + " khong la nam nhuan.");
				break;
			case 7:
				System.out.println(" Tong bieu thuc la : " + bt.TinhTong(n));
				break;
			case 8:
				System.out.println(" Tong phan so la :" + bt.TinhTongPhanSo(n));
				break;
			case 9:
				System.out.println("Day Fibonaci : ");
				printListFib(n);
				break;
			}
			System.out.println();
			System.out.println("Continue? (Yes/No)");
			choice = scanner.next();
		}
	}
}