package java_Bclass.team02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
		int choose;
		choose=sc.nextInt();
			while(choose!=6) {  //6번 누르면 종료
				switch(choose) {
				case 4 : break; //학생 정보 삭제
				case 5 : break; //학생 정보 수정
				case 6 : break; //종료
				}
			}
			
		
	}//end main

}//end class


//삭제하기 전에 정말 삭제하시겠습니까?
//