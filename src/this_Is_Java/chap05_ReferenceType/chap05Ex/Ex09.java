package chap05_ReferenceType.chap05Ex;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// ���� �Է� �� �м� ���α׷�. while, scanner, nextline() �޼ҵ� 
		int[] scores=null;
		scores=new int[] { };
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		int num=0;
		while(run) {
			System.out.print("����> ");
			sc.nextLine();
			
			switch(num) {
			case 1 : 
				System.out.print("�л���> ");
				int stuNum=sc.nextInt();
			case 2 :
			case 3 :
			case 4 :
			case 5 : System.out.println("����"); run=false; break;
				default : 
			}
		}
	}

}
