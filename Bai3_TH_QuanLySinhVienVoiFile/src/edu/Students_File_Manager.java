package edu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Students_File_Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Điền thông tinh sinh viên: ");
        System.out.print("MSSV: ");
        String id = scanner.nextLine();
        
        System.out.print("Họ tên: ");
        String name = scanner.nextLine();
        
        System.out.print("Điểm Toán: ");
        double math = scanner.nextDouble();
        
        System.out.print("Điểm Lý: ");
        double phys = scanner.nextDouble();
        
        System.out.print("Điểm Hóa: ");
        double chem = scanner.nextDouble();
        
        double avg = (math + phys + chem) / 3;
        
        // Ghi vào file!!
        try {
            FileWriter writer = new FileWriter("students.txt", true);
            writer.write("=== SINH VIÊN ===\n");
            writer.write("MSSV: " + id + "\n");
            writer.write("Họ tên: " + name + "\n");
            writer.write(String.format("Điểm Toán: %.1f\n", math));
            writer.write(String.format("Điểm Lý: %.1f\n", phys));
            writer.write(String.format("Điểm Hóa: %.1f\n", chem));
            writer.write(String.format("Điểm TB: %.2f\n", avg));
            writer.write("=================\n\n");
            writer.close();
            
            System.out.println("\nThông tin đã được lưu vào file students.txt !!");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
        
//      --> Đọc file students.txt
//
//      try {
//          Scanner fileScanner = new Scanner(new java.io.File("students.txt"));
//          while (fileScanner.hasNextLine()) {
//              System.out.println(fileScanner.nextLine());
//          }
//          fileScanner.close();
//      } catch (IOException e) {
//          System.out.println("Lỗi: " + e.getMessage());
//      }
      
        scanner.close();

	}

}
