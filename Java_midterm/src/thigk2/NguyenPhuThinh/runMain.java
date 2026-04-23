package thigk2.NguyenPhuThinh;

public class runMain {

	public static void main(String[] args) {

		//cau1: 
		HinhChuNhat hcn = new HinhChuNhat();
		
		double ChuVi = hcn.getChuVi(4, 3, 6, 7);
		System.out.println("Chu vi hình chữ nhật là: " + ChuVi);
		
		double DienTich = hcn.getDienTich(4, 3, 6, 7);
		System.out.println("Diện tích hình chữ nhật là: " + DienTich);
		
	}

}
