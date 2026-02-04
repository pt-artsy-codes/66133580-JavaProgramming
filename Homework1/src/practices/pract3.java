package practices;

//Tính chỉ số BMI
public class pract3 {

	public static void main(String[] args) {
		// BMI = weight (kg) / height (m) * height (m)
		
		double weight = 67.5;
		double height = 1.65;
		
		double BMI = weight / (height * height);
		
		System.out.println("Cân nặng: " + weight + " kg");
		System.out.println("Chiều cao: " + height + " m");
		System.out.println("Chỉ số BMI: " + BMI);
		
		//phân loại BMI
		System.out.println("Phân loại: ");
		if (BMI < 18.5) {
			System.out.println(" Thiếu cân");
		} else if (BMI < 25) {
			System.out.println(" Bình thường");
		} else if (BMI < 30) {
			System.out.println(" Thừa cân");
		} else {
			System.out.println(" Béo phì");
		}
	}

}
