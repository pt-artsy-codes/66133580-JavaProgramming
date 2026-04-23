package thigk2.NguyenPhuThinh;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		

		
		SanPham sp1 = new SanPham();
		sp1.setMaSP(1);
		sp1.setTenSP("Sữa");
		sp1.setLoaiSP("Nước uống");
		sp1.setGiaSP(15000);
		
		SanPham sp2 = new SanPham();
		sp2.setMaSP(2);
		sp2.setTenSP("Pepsi");
		sp2.setLoaiSP("Nước uống");
		sp2.setGiaSP(12000);
		
		SanPham sp3 = new SanPham();
		sp3.setMaSP(3);
		sp3.setTenSP("Sourdough");
		sp3.setLoaiSP("Bánh");
		sp3.setGiaSP(52000);
		
		ArrayList<SanPham> DsSP = new ArrayList<SanPham>();
		
		
		SanPham sp4 = new SanPham();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sản phẩm");
		sp4.setMaSP(sc.nextInt());
		System.out.println("Nhập tên sản phẩm: ");
		sp4.setTenSP(sc.next());
		System.out.println("Nhập loại sản phẩm: ");
		sp4.setLoaiSP(sc.next());
		System.out.println("Nhập giá sản phẩm: ");
		sp4.setGiaSP(sc.nextInt());
		
		
		
		
		}

	}

}
