package lab_assignment1;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Triangle triangle01 = new Triangle("Yellow", 12.5, 14.5);
		//รับเข้าข้อมูล
		Scanner scan = new Scanner(System.in);
		//รับต่าnum
		System.out.print("ใส่ค่าจำนวนเต็ม 1-3: ");
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.print("1. คำนวณพื้นที่สามเหลี่ยม : ");
			System.out.println(triangle01.calculateArea());
			break;
		case 2:
			System.out.println("2. แสดงข้อมูลสามเหลี่ยมทั้งหมด : ");
			triangle01.getInfo();
			break;
		case 3:
			System.out.print("ไม่แสดงข้อมูลอะไรเลบ");
			break;
		default:
		}
	}
}
