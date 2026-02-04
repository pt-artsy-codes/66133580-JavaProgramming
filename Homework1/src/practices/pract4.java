package practices;

public class pract4 {

	public static void main(String[] args) {
		/*Tính tiền điện theo bậc thang
		 *  - 0-50 kWh: 1,678 đ/kWh
           - 51-100 kWh: 1,734 đ/kWh
           - 101-200 kWh: 2,014 đ/kWh
           - 201-300 kWh: 2,536 đ/kWh
           - Trên 300 kWh: 2,834 đ/kWh
		 */
		
		int SoDien = 420;
		int a = 50 * 1678;
		int b = 50 * 1734;
		int c = 100 * 2014;
		int d = 100 * 2536;
		int t = 50;
		
		double TienDien = 0;
		
		if (SoDien <= 50) {
			TienDien = SoDien * 1678;
		} else if (SoDien <= 100) {
			TienDien = a + (SoDien - t) * 1734;
		} else if (SoDien <= 200) {
			TienDien = a + b + (SoDien - t * 2) * 2014;
		} else if (SoDien < 300) {
			TienDien = a + b + c + (SoDien - t * 4) * 2536;
		} else {
			TienDien = a + b + c + d + (SoDien - t * 6) * 2834;
		}
		
		System.out.println("Số điện: " + SoDien + " KWh");
		System.out.println("Tiền điện: " + TienDien + " Đồng");
		System.out.println("Tiền điện (VND): " + String.format("%,.0f", TienDien) + " đ");
	}

}
