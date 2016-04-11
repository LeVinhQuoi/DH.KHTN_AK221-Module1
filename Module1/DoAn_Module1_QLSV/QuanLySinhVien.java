package doAn_Module1_QuanLySinhVien;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class QuanLySinhVien {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private static Scanner in = new Scanner(System.in);
	private int maHV;
	private String hoTen;
	private String ngaySinh;
	private String email;
	private String diaChi;
	private String sdt;
	
	
	public QuanLySinhVien(){
		this.maHV = count.incrementAndGet();
		this.hoTen = "default";
		this.ngaySinh = "default";
		this.email = "default";
		this.diaChi = "default";
		this.sdt = "default";
	}

	public QuanLySinhVien(String hoTen, String ngaySinh, String email, String diaChi, String sdt) {
		this.maHV = count.incrementAndGet(); 
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}




	public int getMaHV() {
		return maHV;
	}




	public void setMaHV(int maHV) {
		this.maHV = maHV;
	}




	public String getHoTen() {
		return hoTen;
	}




	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}




	public String getNgaySinh() {
		return ngaySinh;
	}




	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getDiaChi() {
		return diaChi;
	}




	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}




	public String getSdt() {
		return sdt;
	}




	public void setSdt(String sdt) {
		this.sdt = sdt;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mang sampleArraylist de chua gia tri mac dinh ban dau
		/*ArrayList<HocVien> sampleArrayList = new ArrayList<>();
		HocVien hv1 = new HocVien("Nguyen Van A","1/1/1995","a95@gmail.com","QWERTRYW","04134523542");
		sampleArrayList.add(hv1);
		HocVien hv2 = new HocVien("Tran B","2/3/1995","b95@gmail.com","GDFGDHHSR","01654764772");
		sampleArrayList.add(hv2);*/
		
		//mang arrayList de ghi tiep cac du lieu sau khi da them/sua
		ArrayList<QuanLySinhVien> arrayList = new ArrayList<>();
		/*HocVien hv1 = new HocVien("Nguyen Van A","1/1/1995","a95@gmail.com","QWERTRYW","04134523542");
		arrayList.add(hv1);
		HocVien hv2 = new HocVien("Tran B","2/3/1995","b95@gmail.com","GDFGDHHSR","01654764772");
		arrayList.add(hv2);*/
		
		
		int choice;
		do{
			menu();
			choice = in.nextInt();
			System.out.flush();
			switch(choice){
			case 1: 
				menu();
				break;
			case 2:
				/*writeFileByBufferedStream(sampleArrayList);
				docFileInHocVien("../QuanLyHocVien/danhsach.txt");*/
				inThongTinHocVien("../QuanLyHocVien/danhsach.txt", arrayList);
				break;
			case 3:
				themHocVien(arrayList);
				docFileInHocVien("../QuanLyHocVien/danhsach.txt");
				break;
			case 4:
				xoaHocVien(arrayList);
				docFileInHocVien("../QuanLyHocVien/danhsach.txt");
				break;
			case 5:
				suaThongTinHocVien(arrayList);
				break;
			case 6:
				timKiemHocVien(arrayList);
				break;
			case 7:
				System.out.println("----------------GOODBYE--------------");
				System.exit(0);
				break;
			}
		}while(choice != 0);
		
		
	
		
		
	}
	
	static void writeFileByBufferedStream(ArrayList<QuanLySinhVien> arrayList){
		try {
	        File file = new File("../QuanLyHocVien/danhsach.txt");
	        if (!file.exists()) {
	           file.createNewFile();
	        }
	        FileWriter fw = new FileWriter(file.getName(), true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        for(int i = 0; i < arrayList.size(); i++){
				bw.write("STT: "+arrayList.get(i).maHV+"\r\n");
				bw.write("Ho va ten: "+arrayList.get(i).hoTen+"\r\n");
				bw.write("Ngay sinh: "+arrayList.get(i).ngaySinh+"\r\n");
				bw.write("Email: "+arrayList.get(i).email+"\r\n");
				bw.write("Dia chi: "+arrayList.get(i).diaChi+"\r\n");
				bw.write("SDT: "+arrayList.get(i).sdt+"\r\n");
				bw.write("-------------------------\r\n");
			}
	        bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void writeFileByBufferedStreamForDeleting(ArrayList<QuanLySinhVien> arrayList){
		try {
	        File file = new File("../QuanLyHocVien/danhsach.txt");
	        if (!file.exists()) {
	           file.createNewFile();
	        }
	        FileWriter fw = new FileWriter(file.getName(), false);
	        BufferedWriter bw = new BufferedWriter(fw);
	        for(int i = 0; i < arrayList.size(); i++){
				bw.write("STT: "+arrayList.get(i).maHV+"\r\n");
				bw.write("Ho va ten: "+arrayList.get(i).hoTen+"\r\n");
				bw.write("Ngay sinh: "+arrayList.get(i).ngaySinh+"\r\n");
				bw.write("Email: "+arrayList.get(i).email+"\r\n");
				bw.write("Dia chi: "+arrayList.get(i).diaChi+"\r\n");
				bw.write("SDT: "+arrayList.get(i).sdt+"\r\n");
				bw.write("-------------------------\r\n");
			}
	        bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	static void menu(){
		System.out.println("\t\t\t\t\t\t\t?NG D?NG QU?N LÝ H?C VIÊN");
		System.out.println("\t\t\t\t\t\t----------------------------------------");
		System.out.println("\t\t\t\t\t\t\t1. Xem menu");
		System.out.println("\t\t\t\t\t\t\t2. Danh sách h?c viên");
		System.out.println("\t\t\t\t\t\t\t3. Thêm h?c viên");
		System.out.println("\t\t\t\t\t\t\t4. Xóa h?c viên");
		System.out.println("\t\t\t\t\t\t\t5. S?a thông tin h?c viên");
		System.out.println("\t\t\t\t\t\t\t6. Tìm ki?m h?c viên");
		System.out.println("\t\t\t\t\t\t\t7. Thoát");
		System.out.println("\n\t\t\t\t\t\tCh?n: ");
	}
	
	static void danhSachHocVien(ArrayList<QuanLySinhVien> arrayList){
		System.out.println("----------DANH SACH HOC VIEN----------");
		System.out.println("STT\t\t|\tTen\t\t\t|\tngay sinh\t\t\t|\temail\t\t\t|\tdia chi\t\t\t|\tsodt");
		for(int i = 0; i < arrayList.size(); i++){
			System.out.println(arrayList.get(i).maHV+"\t\t\t"+arrayList.get(i).hoTen+"\t\t\t\t"+arrayList.get(i).ngaySinh+"\t\t\t\t\t"+arrayList.get(i).email+"\t\t\t\t"+arrayList.get(i).diaChi+"\t\t\t\t"+arrayList.get(i).sdt);
		}
	}
	
	static void docFileInHocVien(String path){
		try {
			FileReader fileReader = new FileReader(path);
			char[] buffer = new char[7];
			int len = 0;
			String s = "";
			while((len = fileReader.read(buffer)) != -1){
				s+= new String(buffer,0, len);
			}
			
			System.out.println("--------------------CHUONG TRINH QUAN LY HOC VIEN--------------------");
			System.out.println(s);
			
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void inThongTinHocVien(String path, ArrayList<QuanLySinhVien> arrayList){
		try {
			File file = new File("../QuanLyHocVien/danhsach.txt");
	        if (!file.exists()) {
	           file.createNewFile();
	        }
			
			FileReader fileReader = new FileReader(path);
			
			char[] buffer = new char[7];
			int len = 0;
			String s = "";
			if((len = fileReader.read(buffer)) == - 1){
				System.out.println("-----------DANH SACH RONG, MOI BAN THEM HOC VIEN----------");
				themHocVien(arrayList);
			}
			while((len = fileReader.read(buffer)) != -1){
				s+= new String(buffer,0, len);
			}
			
			System.out.println("--------------------CHUONG TRINH QUAN LY HOC VIEN--------------------");
			System.out.println(s);
			
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource")
	static void timKiemHocVien(ArrayList<QuanLySinhVien> arrayList){
		System.out.println("----------SEARCH ENGINE----------");
		//tim kiem theo ten
		System.out.println("Tim kiem theo ten");
		System.out.println("Nhap tu khoa: ");
		Scanner scanner = new Scanner(System.in);
		String keyWord = scanner.nextLine();
		System.out.println("STT\t\t|\tTen\t\t\t|\tngay sinh\t\t\t|\temail\t\t\t|\tdia chi\t\t\t|\tsodt");
		for(int i = 0; i < arrayList.size(); i++){
			if(arrayList.get(i).getHoTen().contains(keyWord)){
				
				System.out.println(arrayList.get(i).maHV+"\t\t\t"+arrayList.get(i).hoTen+"\t\t\t\t"+arrayList.get(i).ngaySinh+"\t\t\t\t\t"+arrayList.get(i).email+"\t\t\t\t"+arrayList.get(i).diaChi+"\t\t\t\t"+arrayList.get(i).sdt);
			}
		}
	}
	
	@SuppressWarnings("resource")
	static void suaThongTinHocVien(ArrayList<QuanLySinhVien> arrayList){
		System.out.println("---------Sua hoc vien--------");
		System.out.println("Nhap ten hoc vien can sua: ");
		Scanner sn = new Scanner(System.in);
		String editedName = sn.nextLine();
		System.out.println("Thong tin hoc vien can sua: ");
		System.out.println("STT\t\t|\tTen\t\t\t|\tngay sinh\t\t\t|\temail\t\t\t|\tdia chi\t\t\t|\tsodt");
		for(int i = 0; i < arrayList.size(); i++){
			if(arrayList.get(i).getHoTen().contains(editedName)){
				
				System.out.println(arrayList.get(i).maHV+"\t\t\t"+arrayList.get(i).hoTen+"\t\t\t\t"+arrayList.get(i).ngaySinh+"\t\t\t\t\t"+arrayList.get(i).email+"\t\t\t\t"+arrayList.get(i).diaChi+"\t\t\t\t"+arrayList.get(i).sdt);
			}
		}
		
		
		
		System.out.println("\nNhap lua chon: ");
		System.out.println("1/Sua ten ");
		System.out.println("2/Sua ngay sinh ");
		System.out.println("3/Sua email ");
		System.out.println("4/Sua dia chi ");
		System.out.println("5/Sua so dien thoai ");
		System.out.println("6/Sua tat ca ");
		System.out.println("Chon: ");
		int yourChoice = in.nextInt();
		
		Scanner scn = new Scanner(System.in);
		switch(yourChoice){
		case 1:
			System.out.println("Nhap ten moi: ");
			String newName = scn.nextLine();
			for(int i = 0; i < arrayList.size(); i++){
				if(arrayList.get(i).getHoTen().contains(editedName)){
					arrayList.get(i).setHoTen(newName);
					
				}
			}
			
			writeFileByBufferedStreamForDeleting(arrayList);
			System.out.println("----------Sua thanh cong---------- ");
			docFileInHocVien("../QuanLyHocVien/danhsach.txt");
			break;
		case 2:
			System.out.println("Nhap ngay sinh moi: ");
			String newDayOfBirth = scn.nextLine();
			for(int i = 0; i < arrayList.size(); i++){
				if(arrayList.get(i).getHoTen().contains(editedName)){
					arrayList.get(i).setNgaySinh(newDayOfBirth);
					
				}
			}
			writeFileByBufferedStreamForDeleting(arrayList);
			System.out.println("----------Sua thanh cong---------- ");
			docFileInHocVien("../QuanLyHocVien/danhsach.txt");
			break;
		case 3:
			System.out.println("Nhap email moi: ");
			String newEmail = scn.nextLine();
			for(int i = 0; i < arrayList.size(); i++){
				if(arrayList.get(i).getHoTen().contains(editedName)){
					arrayList.get(i).setEmail(newEmail);
					
				}
			}
			writeFileByBufferedStreamForDeleting(arrayList);
			System.out.println("----------Sua thanh cong---------- ");
			docFileInHocVien("../QuanLyHocVien/danhsach.txt");
			break;
		case 4:
			System.out.println("Nhap dia chi moi: ");
			String newAddress = scn.nextLine();
			for(int i = 0; i < arrayList.size(); i++){
				if(arrayList.get(i).getHoTen().contains(editedName)){
					arrayList.get(i).setDiaChi(newAddress);
					
				}
			}
			writeFileByBufferedStreamForDeleting(arrayList);
			System.out.println("----------Sua thanh cong---------- ");
			docFileInHocVien("../QuanLyHocVien/danhsach.txt");
			break;
		case 5:
			System.out.println("Nhap SDT moi: ");
			String newPhone = scn.nextLine();
			for(int i = 0; i < arrayList.size(); i++){
				if(arrayList.get(i).getHoTen().contains(editedName)){
					arrayList.get(i).setSdt(newPhone);
					
				}
			}
			writeFileByBufferedStreamForDeleting(arrayList);
			System.out.println("----------Sua thanh cong---------- ");
			docFileInHocVien("../QuanLyHocVien/danhsach.txt");
			break;
		case 6:
			Scanner scanner = new Scanner(System.in);
			//Sua ten
			System.out.println("Nhap ten moi: ");
			String tenMoi = scanner.nextLine();
			
			
			//Sua ngay sinh
			System.out.println("Nhap ngay sinh moi: ");
			String ngaySinhMoi = scanner.nextLine();
			
			
			//Sua Email
			System.out.println("Nhap email moi: ");
			String emailMoi = scanner.nextLine();
			
			
			//Sua Dia Chi
			System.out.println("Nhap dia chi moi: ");
			String diaChiMoi = scanner.nextLine();
			
			
			//Sua SDT
			System.out.println("Nhap sdt moi: ");
			String sdtMoi = scn.nextLine();
			
			
			for(int i = 0; i < arrayList.size(); i++){
				if(arrayList.get(i).getHoTen().contains(editedName)){
					arrayList.get(i).setHoTen(tenMoi);
					arrayList.get(i).setNgaySinh(ngaySinhMoi);
					arrayList.get(i).setEmail(emailMoi);
					arrayList.get(i).setDiaChi(diaChiMoi);
					arrayList.get(i).setSdt(sdtMoi);
					
				}
			}
			writeFileByBufferedStreamForDeleting(arrayList);
			System.out.println("----------Sua thanh cong---------- ");
			docFileInHocVien("../QuanLyHocVien/danhsach.txt");
			break;
		}
	}
	
	@SuppressWarnings("resource")
	static void themHocVien(ArrayList<QuanLySinhVien> arrayList){
		System.out.println("----------Them hoc vien moi----------");
		System.out.println("So luong muon them: ");
		int quantity = in.nextInt();
		Scanner input = new Scanner(System.in);
		QuanLySinhVien[] hv = new QuanLySinhVien[quantity];
		for(int i = 0; i < quantity; i++){
			
			System.out.println("Them hoc vien thu "+(i+1));
			hv[i] = new QuanLySinhVien();
			
			//Nhap ten
			String name = "";
			Pattern pattern = Pattern.compile(".*[^a-zA-Z\\s].*");
			do{
				System.out.println("Ten: ");
				name = input.nextLine();
				hv[i].setHoTen(name);
			}while((!pattern.matcher(name).matches()) == false);
			
			//Nhap ngay sinh
			String dayOfBirth = "";
			Pattern patternDay = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
			do{
				System.out.println("Ngay sinh: ");
				dayOfBirth = input.nextLine();
				hv[i].setNgaySinh(dayOfBirth);
			}while((patternDay.matcher(dayOfBirth).matches()) == false);
			
			//Nhap email
			String mail = "";
			Pattern patternMail = Pattern.compile("([\\w\\.])+@([a-zA-Z0-9\\-])+\\.([a-zA-Z]{2,4})(\\.[a-zA-Z]{2,4})?");
			do{
				System.out.println("email: ");
				mail = input.nextLine();
				hv[i].setEmail(mail);
			}while((patternMail.matcher(mail).matches()) == false);
			
			//Nhap dia chi
			System.out.println("dia chi: ");
			String address = input.nextLine();
			hv[i].setDiaChi(address);
			
			//Nhap sdt
			String sdt = "";
			Pattern patternPhone = Pattern.compile("(\\+\\d{2,4})?\\s?(\\d{11})");
			do{
				System.out.println("sdt: ");
				sdt = input.nextLine();
				hv[i].setSdt(sdt);
			}while((patternPhone.matcher(sdt).matches()) == false);
			
			
			arrayList.add(hv[i]);
		}
		writeFileByBufferedStreamForDeleting(arrayList);
		System.out.println("-------Da them thanh cong-----");
	}
	
	static void xoaHocVien(ArrayList<QuanLySinhVien> arrayList){
		System.out.println("----------------Xoa hoc vien------------");
		System.out.println("Nhap STT can xoa: ");
		int deleteSTT = in.nextInt();
		/*for(int i = 0; i < SarrayList.size(); i++){
			
		}*/
		arrayList.remove(deleteSTT-1);
		
		writeFileByBufferedStreamForDeleting(arrayList);
		System.out.println("--------Xoa thanh cong-------");
	}
		
}