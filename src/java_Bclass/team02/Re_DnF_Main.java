package java_Bclass.team02;

import java.util.Scanner;

public class Re_DnF_Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       Re_DnF_ g = new Re_DnF_();
	        while (true) {
	            System.out.println("1.�Է�  2.���  3.�˻�  4.����  5.����  6.������");
	            System.out.print("���� : ");
	            int choose;
	            choose = sc.nextInt();
	            while (choose != 6) {
	                switch (choose) {
	                case 1: // �Է�
	                    g.input();
	                    break;
	 
	                case 2: // ���
	                    g.output();
	                    break;
	 
	                case 3: // �˻�
	                    g.search();
	                    break;
	 
	                case 4: // ����
	                    g.fix();
	                    break;
	 
	                case 5: // ����
	                    g.delete();
	                    break;
	 
	                case 6: // ������
	                    break;
	                }
	                break;
	            }
	        }
	    }

	}


