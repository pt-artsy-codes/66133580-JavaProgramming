package quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Nguyễn Phú Thịnh", 2300000);
//		nv1.hienThiThongTin();
		System.out.println(nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Michael Reeves", 4200000, 3, 400000);
		System.out.println(nvVanPhong1.toString());
//		nvVanPhong1.hienThiThongTin();
	}

}
