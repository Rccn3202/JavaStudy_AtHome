package java_Bclass.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	// ����,����,����,���������� �Է¹޾Ƽ� �迭����Ʈ �����ϰ� ����,��� ���ϱ�
	public static void main(String[] args) {
		
		ArrayList<Ex02_> ex = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Ex02_ ex2 = new Ex02_();
		
		System.out.println("�����Է�");
		System.out.print("����: ");
		ex2.setKor(sc.nextInt());
		System.out.print("����: ");
		ex2.setEng(sc.nextInt());
		System.out.print("����: ");
		ex2.setMath(sc.nextInt());
		System.out.print("����: ");
		ex2.setSci(sc.nextInt());
		ex.add(ex2);
		
		System.out.println("����: "+ex2.getTotal());
		System.out.println("���: "+ex2.getAvg());
		
	}

}
