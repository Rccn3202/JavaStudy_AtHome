package java_Bclass.team02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Method m=new Method();

	
		Scanner sc=new Scanner(System.in);
		int choose;
		System.out.println("번호입력");
		choose=sc.nextInt();
			while(choose!=6) {  //6번 누르면 종료
				
				switch(choose) {
				case 1 : m.input(); break;
				case 4 : m.delete(); break; //학생 정보 삭제
				case 5 : m.fix(); break; //학생 정보 수정
				case 6 : break; //종료
				}
			}
			
		
	}//end main

}//end class


//삭제하기 전에 정말 삭제하시겠습니까?
//