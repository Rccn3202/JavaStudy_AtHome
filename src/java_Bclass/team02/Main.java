package java_Bclass.team02;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        Grade g = new Grade();
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

//�����ϱ� ���� ���� �����Ͻðڽ��ϱ�?
//