package edu;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChuNhat cn1 = new ChuNhat();
		ChuNhat cn2 = new ChuNhat(20, 15);
		ChuNhat hv = new ChuNhat(20, 20);
		
		double cn1_dai= cn1.getDai();
		double cn1_rong= cn1.getRong();
		
		System.out.println("Hình CN1 có chiều dài là: " + cn1_dai);
		System.out.println("Hình CN1 có chiều rộng là: " + cn1_rong);
	}

}
