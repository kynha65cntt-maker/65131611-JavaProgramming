package lab1_2;

import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao chieu dai va rong ");
		int dai = scanner.nextInt();
		int rong = scanner.nextInt();

		System.out.println("Chu vi cua HCN: "+(dai+rong)*2);
		System.out.println("Dien tich cua HCN: "+(dai*rong));
		System.out.println("Cạnh nhỏ của HCN: "+Math.min(dai, rong));
	}
}
