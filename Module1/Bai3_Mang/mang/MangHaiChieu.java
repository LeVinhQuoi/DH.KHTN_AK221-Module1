
package mang;

import java.util.Scanner;

public class MangHaiChieu {
	public static long Fibonacci(long n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("NHap so nghuyen duong n");
		int n=scanner.nextInt();
		MangHaiChieu.Fibonacci(n);
	}

}
