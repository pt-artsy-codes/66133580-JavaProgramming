package edu;

import java.util.Scanner;

class SinhVien {
	//Khởi tạo
	private String MSSV;
	private String HoTen;
	private double TB;
	
	//constructor
	public SinhVien(String MSSV, String HoTen, double TB) {
		this.MSSV = MSSV;
		this.HoTen = HoTen;
		this.TB = TB;
	}
	
	//Nhập thông tinh SV
	public void InputInfo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập MSSV: ");
		this.MSSV = scanner.nextLine();
		
		System.out.println("Nhập họ và tên sinh viên: ");
		this.HoTen = scanner.nextLine();
		
		System.out.println("Nhập điểm trung bình: ");
		this.TB = scanner.nextDouble();
		
		scanner.close();
	}
	
	//In ra màn hình
	public void OutputInfo() {
		System.out.println("MSSV: " + MSSV + " | Tên " + HoTen + " | Điểm trung bình: " + TB);
	}
	
}


public class Simple_OOP {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien("", "", 0);
		
		sv.InputInfo();
		
		System.out.println("Thông tin vừa nhập: ");
		sv.OutputInfo();
	}
}
