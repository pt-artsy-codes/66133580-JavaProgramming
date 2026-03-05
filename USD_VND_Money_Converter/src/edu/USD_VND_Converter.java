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

        double kq = 0;
        
        if (choice == 1) {
        	System.out.print("Nhập số tiền (đơn vị: 1$): ");
            double amount = scanner.nextDouble();
            kq = amount * Convert;
            System.out.printf("%.2f USD = %.0f VND%n", amount, kq);
        } else if (choice == 2) {
        	System.out.print("Nhập số tiền (đơn vị: 1.000 VND): ");
            double amount = scanner.nextDouble();
            kq = (amount * 1000) / Convert;
            System.out.printf("%.3f VND = %.2f USD%n", amount, kq);
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }

        scanner.close();

	}

}
