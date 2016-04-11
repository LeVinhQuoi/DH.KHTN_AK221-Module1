package docGhiFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream1 {

	public static void main(String[] args) {

	}
	public static void ReadFile(){
		//doc file
		String s="";
		int i;
		try {
			@SuppressWarnings("resource")
			FileInputStream in =new FileInputStream("D:/demo.txt");
			while(true){//bang true luc nao cung chay
				if((i =in.read())==-1){
					break;
				}
				s+= (char)i;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Khong tim thay tap tin" + e.getMessage());
		}catch(IOException e2){
			System.out.println("Loi :" + e2.getMessage());
		}catch(Exception e3){
			System.out.println("Loi :" + e3.getMessage());
		}
		System.out.println("Noi dung file :" + s);
	}
}
