package java_Bclass.team02F;


import java.util.Scanner;
import java_Bclass.team021.Join;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run=true;
		boolean flage = true;
	
		Join join = new Join();
		Method method = new Method();

		while (run) {
			System.out.println("1. ȸ������ | 2. �α��� | 3. ����");
			System.out.print("���� -> ");
			String option = sc.nextLine();
			
			if (option.equals("1")) {
				System.out.println("ȸ������");
				System.out.print("Id : ");
				join.setId(sc.nextLine());
				System.out.print("Password : ");
				join.setPassword(sc.nextLine());
				
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
	
				continue;
			} else if (option.equals("2")) {
				if (join.getId() == null) {
					System.out.println("ȸ�������� �����ϴ�. ȸ������ ���ּ���.");
					continue;
				}
				System.out.println("���̵�� �н����带 �Է����ּ���.");
				System.out.print("Id : ");
				join.setInputId(sc.nextLine());
				System.out.print("Password : ");
				join.setInputPw(sc.nextLine());


				if (join.getId().equals(join.getInputId()) && join.getPassword().equals(join.getInputPw())) {
					System.out.println("�α��� ����");
					break;
				} else
					System.out.println("�ٽ� �Է����ּ���.");
				continue;

			} else if (option.equals("3")) {
				flage = false;
				System.out.println("�����մϴ�.");
				break;
			} else
				System.out.println("�߸������̽��ϴ�.");
			continue;
		}


		boolean flage1=true;
		while (flage1) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.�л����  2.�л��˻�  3.�л����  4.�л���������  5.�л���������  6.����");
			System.out.println("------------------------------------------------------------------");
			System.out.print("����> ");
			int choose;
			choose = sc.nextInt();
			
			
			while (flage1) {
				switch (choose) {
				case 1: method.add(); break; //�л����

				case 2: method.search();  break; // �̸��˻�

				case 3: method.output(); break; //�л����

				case 4: method.fix(); break; // ����

				case 5: method.delete(); break; //����

				case 6:	System.out.println("���α׷��� �����մϴ�"); flage1=false; break;

				default: System.out.println("�߸��Է��ϼ̽��ϴ�.(1~6)"); 
				} 
				break;
			}
		}
	}
}


