package java_Bclass.team02;

import java.util.Iterator;
import java.util.Scanner;

public class DnF_Math {

	Scanner sc=new Scanner(System.in);
	Student stu;
	
	public void selectAll(){
		System.out.print("���� : ");
		stu.setKor(sc.nextInt());
		System.out.print("���� : ");
		stu.setEng(sc.nextInt());
		System.out.println("���");
		System.out.println(stu.toString());
	}
}
