package edu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		//Khai báo biến danh sách
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		//Cau a: Nhập 10 phần tử từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			//Nhập 1 phần tử
				//in ra hướng dẫn cho người dùng
			System.out.println("Nhập các phần tử thứ " +i + ": ");
				// cho người dùng nhập vào biến tạm
			Integer tam = banPhim.nextInt();
				//thêm vào trong danh sách
			dsSoNguyen.add(tam);	
		}
		
		//Câu b: in ra danh sách vừa nhập
		System.out.println("Danh sách vừa nhập là: \n");
//		for (int i=0; i<dsSoNguyen.size(); i++) {
//			Integer tam = dsSoNguyen.get(i);
//			System.out.println(tam + " ");
//		}
		
		for (Integer x: dsSoNguyen) {
			System.out.print(x + " ");
		}
		
		//Câu 3: Đếm số phần tử chẵn
		int soLuongPTchan = 0;
		for (Integer x: dsSoNguyen) {
			if (x % 2 == 0) soLuongPTchan++;
		}
		System.out.println("\nSố lượng phần tử chẵn là: " + soLuongPTchan);
		
//		//hoặc
//		for (int i=0; i<dsSoNguyen.size(); i++) {
//			if (tam % 2 == 0) soLuongPTchan++;
//		}
		
		//Câu d: Tính tổng các phần tử: Thuật toán cộng dồn
		int TongAll = 0;
		for (Integer x: dsSoNguyen) {
			TongAll += x; feff
		}
		System.out.println("Tổng tất cả các phần tử là: " + TongAll);
	}

}
