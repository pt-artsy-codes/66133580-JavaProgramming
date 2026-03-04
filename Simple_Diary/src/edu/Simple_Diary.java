package edu;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Simple_Diary {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập tiêu đề nhật ký: ");
		String Header = scanner.nextLine();
		
		System.out.println("Nhập nội dung nhật Ký: ");
		String content = scanner.nextLine();
		
		try {
			FileWriter writer = new FileWriter("Simple_Diary.txt", true);
			
			writer.write("Tiêu đề: " + Header + "\n");
			writer.write(content);
			writer.write("\n-------------------\n\n");
			writer.close();
			
		} catch (IOException e) {
			System.out.println("Lỗi khi lưu file: " + e.getMessage());
		}
		
		try {
          Scanner fileScanner = new Scanner(new java.io.File("Simple_Diary.txt"));
          while (fileScanner.hasNextLine()) {
              System.out.println(fileScanner.nextLine());
          }
          System.out.println("----------------");
          fileScanner.close();
      } catch (IOException e) {
          System.out.println("Lỗi: " + e.getMessage());
      }

	}

}
