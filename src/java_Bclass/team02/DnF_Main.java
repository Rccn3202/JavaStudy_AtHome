package java_Bclass.team02;

import java.io.IOException;
import java.util.Scanner;

public class DnF_Main {

		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
	        DnF_ dnf = new DnF_();
	        while (true) {
	            System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.����  6.����");
	            System.out.print("���� : ");
	            int choose;
	            choose = sc.nextInt();
	            while (choose != 6) {
	                switch (choose) {
	                case 1: // �Է�
	                    dnf.input();
	                    break;
	 
	                case 2: // ���
	                	dnf.output();
	                    break;
	 
	                case 3: break;
	 
	                case 4: // ����
	                	dnf.fix();
	                    break;
	 
	                case 5: // ����
	                	dnf.delete();
	                    break;
	 
	                case 6:			 
	                    break;
	                }
	                break;
	            }
	        }
	    }
	

	}

