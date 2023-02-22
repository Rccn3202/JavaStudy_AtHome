package java_Bclass.team02;

import java.util.Iterator;
import java.util.Scanner;

public class DnF_Math {

	Scanner sc=new Scanner(System.in);
	Student stu;
	
	public void selectAll(){
		System.out.print("국어 : ");
		stu.setKor(sc.nextInt());
		System.out.print("영어 : ");
		stu.setEng(sc.nextInt());
		System.out.println("결과");
		System.out.println(stu.toString());
	}
}
