package java_Bclass.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	// 국어,영어,수학,과학점수를 입력받아서 배열리스트 저장하고 총점,평균 구하기
	public static void main(String[] args) {
		
		ArrayList<Ex02_> ex = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Ex02_ ex2 = new Ex02_();
		
		System.out.println("점수입력");
		System.out.print("국어: ");
		ex2.setKor(sc.nextInt());
		System.out.print("영어: ");
		ex2.setEng(sc.nextInt());
		System.out.print("수학: ");
		ex2.setMath(sc.nextInt());
		System.out.print("과학: ");
		ex2.setSci(sc.nextInt());
		ex.add(ex2);
		
		System.out.println("총점: "+ex2.getTotal());
		System.out.println("평균: "+ex2.getAvg());
		
	}

}
