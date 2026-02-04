package BaiTH;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		
		double PayOut;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số giờ làm: ");
		int Gio = scanner.nextInt();
		
		System.out.print("Nhập số lương theo giờ (vnđ): ");
		int Luong = scanner.nextInt();
		
		
		if (Gio <= 40) {
			PayOut = Gio * Luong;
		} else {
			PayOut = (40 * Luong) + ((Gio - 40) * (1.5 * Luong));
		}

		System.out.println("Lương nhân viên: " + PayOut + " đ");
		
		scanner.close();
	}

}
