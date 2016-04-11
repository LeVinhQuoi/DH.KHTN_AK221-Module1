package docGhiFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		FileInputStream in=null;;
		FileOutputStream out = null;
		try {
			// Doc file voi ByteStream
			int i;
			String s = "";
			try {
				in = new FileInputStream("D:/bt.txt");
				while ((i = in.read()) != -1)
					s += (char) i;
				System.out.println(s);
			} catch (FileNotFoundException e) {// throws FileNotFoundException: neu file khong ton tai: thi nem ra FileNotFoundException.
				System.out.println("khong tim thay tap tin.");
			} catch (IOException e1) {// int read( ) throws IOException: doc tung byte tu file va tra ve gia tri byte doc duoc tra ve -1 khi het file, va nem ra IOException khi co loi dc
				System.out.println("Loi IP: " + e1.getMessage());
			} catch (Exception e2) {// void close( ) throws IOException: sau khilam viec xong can dong file de giai phong tai nguyen da cap phat cho file
				System.out.println("Loi : " + e2.getMessage());
			}
			// Ghi file voi ByteStream
			try {
				//out = new FileOutputStream("D:/bt.txt");
				out = new FileOutputStream("D:/bt1.txt");
				String string = "quoi dep trai - Number one @^@! .";
				for (int i1 = 0; i1 < string.length(); i1++)
					out.write(string.charAt(i1));
				System.out.println("Ghi file thanh cong");
				out.close();
			} catch (FileNotFoundException e) {
				System.out.println("khong tim thay tap tin.");
			} catch (IOException e1) {
				System.out.println("Loi IP: " + e1.getMessage());
			} catch (Exception e2) {
				System.out.println("Loi : " + e2.getMessage());
			}
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("CopyFile ");
			return;
		}
		// Copy File voi ByteStream
		try {
			int i;
			do {
				i = in.read();
				if (i != -1) {
					out.write(i);
				}
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("File Error");
		}
		in.close();
		out.close();
	}

}
