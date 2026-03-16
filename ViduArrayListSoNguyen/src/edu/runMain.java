package edu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		//Khai báo biến danh sách
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		//Cau a: Nhậpp 10 phần tử từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			//Nhập 1 phần tử
				//in ra hướng dẫn cho người dùng
			System.out.println("Nhập các phần tử thứ " +i + ": ");
				// cho người dùng nhập vào biến tạm
			Integer tam = banPhim.nextInt();
				//thêm vào trong danh sách
			dsSoNguyen.add(tam);	
		}
			
	}

}
