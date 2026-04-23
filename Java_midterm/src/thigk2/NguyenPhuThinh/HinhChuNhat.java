package thigk2.NguyenPhuThinh;

public class HinhChuNhat {

	private double x1; //trên
	private double y1; //trái
	private double x2; //dưới
	private double y2; //phải
	
	public HinhChuNhat() {
		
	}
	
	public HinhChuNhat(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = 5;
		this.y1 = 4;
		this.x2 = 8;
		this.y2 = 6;
	}

	//hàm getter và setter
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getY1() {
		return y1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getY2() {
		return y2;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	// Chu vi hình chữ nhât
	public double getChuVi(double x1, double y1, double x2, double y2) {
		return 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1) );
	}
	
	// Diện tích hình chữ nhât
	public double getDienTich(double x1, double y1, double x2, double y2) {
		return Math.abs(x2 - x1) * Math.abs(y2 - y1);
	}
}
