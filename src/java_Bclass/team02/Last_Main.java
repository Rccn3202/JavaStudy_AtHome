package java_Bclass.team02;

import java.util.Scanner;

public class Last_Main {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Last_method method = new Last_method();
        
        boolean flage = true;
        while (flage) {
	         System.out.println("------------------------------------------------------------");
	         System.out.println("1.�л����  2.�л������Է�  3.�л����  4.�л���������  5.�л���������  6.����");
	         System.out.println("------------------------------------------------------------");
	         System.out.print("����> ");
	         String menu = sc.nextLine();
	         
	         switch (menu) {

	         case "1": method.add(); break;

	         case "2": method.input(); break;
	         
	         case "3": method.output(); break;
	         
	         case "4": method.delete(); break;
	         
	         case "5": method.fix(); break;
	         
	         case "6": flage = false; break;
	         
	         default:   System.out.println("�߸��Է��ϼ̽��ϴ�.(1~6)");
	         }
	         
	
	
	}
}
}