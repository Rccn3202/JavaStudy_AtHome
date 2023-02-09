package chap05_ReferenceType.chap05Ex;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 점수 입력 후 분석 프로그램. while, scanner, nextline() 메소드 
		int[] scores=null;
		scores=new int[] { };
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		int num=0;
		while(run) {
			System.out.print("선택> ");
			sc.nextLine();
			
			switch(num) {
			case 1 : 
				System.out.print("학생수> ");
				int stuNum=sc.nextInt();
			case 2 :
			case 3 :
			case 4 :
			case 5 : System.out.println("종료"); run=false; break;
				default : 
			}
		}
	}

}
