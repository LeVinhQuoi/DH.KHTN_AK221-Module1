package mang;

import java.util.Scanner;

public class MangMotChieu {

	public static boolean KT_SoNguyenTo(int arr[], int i) {
		int dem = 0;
		for (int j = 1; j < arr[i]; j++) {
			if (arr[i] % j == 0) {
				++dem;
			}
		}
		if (dem == 2)
			return true;
		else
			return false;
	}

	public static void XuatSoNguyenTo(int arr[]) {
		System.out.println(" So nguyen to trong mang la :");
		for (int i = 0; i < arr.length; i++) {
			if (KT_SoNguyenTo(arr, i) == true)
				System.out.println(arr[i]);
		}
	}

	public static void XuatSoChinhPhuong(int arr[]) {
		System.out.println(" So chinh phuong trong mang la :");
		for (int i = 0; i < arr.length - 1.; i++) {
			if (KT_ChinhPhuong(arr, i) == true)
				System.out.println(arr[i]);
		}
	}

	public static boolean KT_ChinhPhuong(int arr[], int n) {
		if (n == (Math.sqrt(n)) * (Math.sqrt(n)))
			return true;
		else
			return false;
	}

	public static void SX_TangDan(int arr[]) {
		int team;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					team = arr[i];
					arr[i] = arr[j];
					arr[j] = team;
				}
			}
		}
		System.out.println("Mang sau khi sap xep tang dan ");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void SX_LeTangChanGiam(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] < arr[j] && arr[j] % 2 == 0) {
						int team = arr[i];
						arr[i] = arr[j];
						arr[j] = team;
					}
				}
			}
			if (arr[i] % 2 != 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j] && arr[j] % 2 != 0) {
						int team = arr[i];
						arr[i] = arr[j];
						arr[j] = team;
					}
				}
			}
		}
		System.out.println("Mang sau khi sap xep le tang , chan giam");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void SX_NguyenToTangDan(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			if (KT_SoNguyenTo(arr, i) == true)
				for (int j = i + 1; j < arr.length; j++) {
					if (KT_SoNguyenTo(arr, j) == true) {
						if (arr[i] > arr[j]) {
							int team = arr[i];
							arr[i] = arr[j];
							arr[j] = team;
						}
					}
				}
		System.out.println("Mang sau khi sap xep cac so nguyen to tang dan");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static int TongPhanTu(int arr[]) {
		int s = 0;
		for (int i = 0; i < arr.length - 1; i++)
			s += i;
		return s;
	}

	public static void InNguocMang(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.println(arr[i]);
	}

	public static boolean KT_MangDoiXung(int arr[]) {
		for (int i = 0; i < arr.length / 2; i++)
			if (arr[i] != arr[arr.length - i - 1])
				return false;
		return true;
	}

	public static void VeMang(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void ThemPhanTu(int arr[], int u) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			while (arr[i] == u) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j - 1];
				}
				n++;
			}
		}
		System.out.println("Mang sau khi them vao mot phan tu ");
		for (int i = 0; i < n; i++) {
			System.out.printf("\narr[%d]= %d", i, arr[i]);
		}
	}

	public static void XoaPhanTu(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			while (arr[i] == x) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				n--;
			}
		}
		System.out.println("Mang sau khi xoa di mot phan tu ");
		for (int i = 0; i < n; i++) {
			System.out.printf("\narr[%d]= %d", i, arr[i]);
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MangMotChieu mmc = new MangMotChieu();
		@SuppressWarnings("resource")
		Scanner scaner = new Scanner(System.in);
		System.out.println(" -----------------Menu-----------------");
		System.out.println("MaDe1-Sap xep mang tang dan ");
		System.out.println("MaDe2-Sap xem le tang chan giam  ");
		System.out.println("MaDe3-Xuat so nguyen to ");
		System.out.println("MaDe4-Sap xep nguyen to tang dan ");
		System.out.println("MaDe5-Xuat so chinh phuong  ");
		System.out.println("MaDe6-Kiem tra mang doi xung ");
		System.out.println("MaDe7-Tinh tong phan tu ");
		System.out.println("MaDe8-Mang nguoc ");
		System.out.println("MaDe9-VeMang hinh * ");
		System.out.println("MaDe10-Chen mot phan tu vao mang");
		System.out.println("MaDe11-Xoa mot phan tu trong mang");
		System.out.println("Nhap chi so mang : ");

		int chiso;
		chiso = scaner.nextInt();
		int arr[] = new int[chiso];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("a[%d]:", i);
			arr[i] = scaner.nextInt();
		}
		System.out.println("\nMang vua nhap : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.print("\n");
		System.out.println("Nhap ma de bai  :");
		int i = scaner.nextInt();
		System.out.print("\n");
		switch (i) {
		case 1:
			System.out.println("Sap xep mang tang dan :");
			SX_TangDan(arr);
			break;
		case 2:
			System.out.println("Sap xep le tang chan giam : ");
			SX_LeTangChanGiam(arr);
			break;
		case 3:
			System.out.println("So nguyen to trong mang ");
			XuatSoNguyenTo(arr);
			break;
		case 4:
			System.out.println("Sap xep nguyen to tang dan :");
			SX_NguyenToTangDan(arr);
			break;
		case 5:
			System.out.println("Xuat so chinh phuong trong mang :");
			XuatSoChinhPhuong(arr);
			break;
		case 6:
			if (KT_MangDoiXung(arr) == true)
				System.out.println("Mang doi xung ");
			else
				System.out.println("Mang khong doi xung ");
			break;
		case 7:
			System.out.println("Tong phan tu trong mang :");
			TongPhanTu(arr);
			break;
		case 8:
			System.out.println("Mang theo thu tu nguoc ");
			InNguocMang(arr);
			break;
		case 9:
			System.out.println("Mang hinh *");
			VeMang(arr);
			break;
		case 10:
			System.out.println("Nhap so can them");
			int u = scaner.nextInt();
			ThemPhanTu(arr, u);
			break;
		case 11:
			System.out.println("Nhap so muon xoa");
			int x = scaner.nextInt();
			XoaPhanTu(arr, x);
			break;
		default:
			System.out.println("Ma de khong dung ! Xin vui long nhap lai Ma de! ");
			break;
		}
	}

}
