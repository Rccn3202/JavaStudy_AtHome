package java_Bclass.team02;

import java.io.IOException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws IOException {
					Scanner sc = new Scanner(System.in);
			        Test test = new Test();
			        while (true) {
			        	System.out.println("----------------");
			            System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.����  6.����");
			            System.out.println("----------------");
			            System.out.print("���� : ");
			            int choose;
			            choose = sc.nextInt();
			            while (choose != 6) {
			                switch (choose) {
			                case 1: // �Է�
			                    test.input();
			                    break;
			 
			                case 2: // ���
			                	test.output();
			                    break;
			 
			                case 3: break;
			 
			                case 4: // ����
			                	test.fix();
			                    break;
			 
			                case 5: // ����
			                	test.delete();
			                    break;
			 
			                case 6:			 
			                    break;
			                }
			                break;
			            }
			        }
			    }
			

			}



	}

}