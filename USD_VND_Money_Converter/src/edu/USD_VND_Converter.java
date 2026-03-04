package edu;

import java.util.Scanner;

public class USD_VND_Converter {
	//1 USD = 25000 VND

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        double Convert = 25000.0;

        System.out.println("Chọn 1 trong 2: ");
        System.out.println("1. USD sang VND");
        System.out.println("2. VND sang USD");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        System.out.print("Nhập số tiền: ");
        double amount = scanner.nextDouble();

        double kq = 0;
        if (choice == 1) {
            kq = amount * Convert;
            System.out.printf("%.2f USD = %.2f VND%n", amount, kq);
        } else if (choice == 2) {
            kq = amount /Convert;
            System.out.printf("%.2f VND = %.2f USD%n", amount, kq);
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }

        scanner.close();

	}

}
