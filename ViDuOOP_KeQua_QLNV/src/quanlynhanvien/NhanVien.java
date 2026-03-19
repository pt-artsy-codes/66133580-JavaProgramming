package quanlynhanvien;

public class NhanVien {
	//thuộc tính
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	
	//hàm tạo
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		String chuoiXuat="";
		chuoiXuat = chuoiXuat + "Mã NV: " + this.maNV;
		chuoiXuat = chuoiXuat + "\nHọ tên: " + this.hoTen;
		chuoiXuat = chuoiXuat + "\nLương cơ bản: " + this.luongCoBan;
		return chuoiXuat;
		
//		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	
	public void hienThiThongTin() {
		System.out.println("Mã Nv: " + maNV);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Lương cơ bản: " + luongCoBan);
	}
}
