package BaiTH;
import java.util.Scanner;
		// 1 USD = 23,500 VND
		// 1 EUR = 27,000 VND

public class Bai2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chọn loại tiền muốn đổi sang vnđ: ");
		String MoneyType = scanner.nextLine().toUpperCase();
		
		System.out.print("Nhập số tiền muốn đổi: ");
		double amount = scanner.nextDouble();
		
		double kq;
		
		switch(MoneyType) {
		case "USD":
			kq = amount * 23500;
			System.out.println(amount + " USD đổi ra được " + kq + " vnđ");
			break;
		case "EUR":
			kq = amount * 27000;
			System.out.println(amount + " EUR đổi ra được " + kq + " vnđ");
			break;
		default:
			System.out.println("Xin vui lòng nhập loại tiền là USD hoặc EUR!!");
		}
		
		scanner.close();
	}

}
