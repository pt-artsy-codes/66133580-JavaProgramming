package ChuyenDoiNhietDo;

public class TempConverter {

	public static void main(String[] args) {
		//Celsius --> Fahrenheit
        //F = (C × 9/5) + 32
		
		double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

	}

}
