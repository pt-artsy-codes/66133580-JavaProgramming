package thigk2.NguyenPhuThinh;

public class SanPham {
	
	private int maSP;
	private String tenSP;
	private String loaiSP;
	private int giaSP;
	
	// Hàm getter và setter
	public int getMaSP() {
		return maSP;
	}


	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}


	public String getTenSP() {
		return tenSP;
	}


	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}


	public String getLoaiSP() {
		return loaiSP;
	}


	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}


	public int getGiaSP() {
		return giaSP;
	}


	public void setGiaSP(int giaSP) {
		this.giaSP = giaSP;
	}


	public SanPham() {
		
	}
	
	public SanPham(int maSP, String tenSP, String loaiSP, int giaSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaSP = giaSP;
	}



	
}
