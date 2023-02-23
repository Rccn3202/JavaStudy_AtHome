package java_Bclass.team02;

import java.util.Scanner;

public class Last_Main {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Last_method method = new Last_method();
        
        boolean flage = true;
        while (flage) {
	         System.out.println("------------------------------------------------------------");
	         System.out.println("1.학생등록  2.학생점수입력  3.학생목록  4.학생정보삭제  5.학생정보수정  6.종료");
	         System.out.println("------------------------------------------------------------");
	         System.out.print("선택> ");
	         String menu = sc.nextLine();
	         
	         switch (menu) {

	         case "1": method.add(); break;

	         case "2": method.input(); break;
	         
	         case "3": method.output(); break;
	         
	         case "4": method.delete(); break;
	         
	         case "5": method.fix(); break;
	         
	         case "6": flage = false; break;
	         
	         default:   System.out.println("잘못입력하셨습니다.(1~6)");
	         }
	         
	
	
	}
}
}