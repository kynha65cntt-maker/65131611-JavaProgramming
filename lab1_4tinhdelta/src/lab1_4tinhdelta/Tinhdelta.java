package lab1_4tinhdelta;

import java.util.Scanner;

public class Tinhdelta {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a");
		int a = scanner.nextInt();
		System.out.println("Nhap b");
		int b = scanner.nextInt();
		System.out.println("Nhap c:");
		int c = scanner.nextInt();
		double delta = Math.pow(b,2) - 4 * a * c;
		System.out.println("Ket qua cua delta: "+delta);
		System.out.println("Căn delta:"+Math.sqrt(delta));
	}
}
