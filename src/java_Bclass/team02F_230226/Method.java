package java_Bclass.team02F_230226;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Method {
	LinkedList<Student> list = new LinkedList<Student>();
	Iterator<Student> it = list.iterator();
	Scanner sc = new Scanner(System.in);
	Student stu = new Student();

	public void add() {
		
		do {
			stu = new Student();
			System.out.print("�̸� : ");
			stu.setName(sc.next());
			System.out.print("���� : ");
			stu.setKor(sc.nextInt());
			System.out.print("���� : ");
			stu.setEng(sc.nextInt());
			System.out.print("���� : ");
			stu.setMath(sc.nextInt());
			list.add(stu);
			System.out.println("�߰� ��� �Ͻðڽ��ϱ�? (Y/N)");
			String continueYn = sc.next();
			if( continueYn.equalsIgnoreCase("n") ) {
				{
					System.out.println("����ȭ������ ���ư��ϴ�.");
					break;
				}
			}
		} while ( true );

	}

	public void search() { 

		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��ϰ� ���� �л� �̸��� �Է��ϼ��� : ");
		String stuSearch = sc.nextLine();
		
		it = list.iterator();
		while( it.hasNext() ) {
			Student stu = it.next();
			
			if( stu.getName().equals(stuSearch) ) {
				System.out.println( stu.toString() );
			}
		}
		
	}

	public void output() {
		for (Student stu : list) {
            System.out.print(stu); //toString()�Լ� ȣ��
            System.out.println();
            if( stu.getAvg() >= 90 ) {
            	System.out.println(stu.getName() + " �л��� ������� �л��Դϴ�.");
                System.out.println();
             }
             else if(stu.getAvg() <= 70) {
             	System.out.println(stu.getName() + " �л��� �����ʿ� �л��Դϴ�.");
                System.out.println();
             }
        }
      }

	public void fix() {
		
		if (list.isEmpty()) { System.out.println("����� �л������� �����ϴ�"); }		
		else {		
			System.out.println("<<���� ����>>");
			System.out.print("�л��̸� �Է� : ");
			String name = sc.next();	
			it = list.iterator();
			while (it.hasNext()) {	
				Student stu = it.next();

				if (stu.getName().equals(name)) {	
					
					System.out.println("---------------------------------");
					System.out.println(" 1.�����ϰ����� | 2.������ | 3.�̸�");
					System.out.println("---------------------------------");
					int select = sc.nextInt();
					
					switch(select) {

					case 1 :	//�����ϰ�����

						System.out.print("���� : ");
						stu.setKor(sc.nextInt());
						System.out.print("���� : ");
						stu.setEng(sc.nextInt());
						System.out.print("���� : ");
						stu.setMath(sc.nextInt());
						System.out.print("���> ");
						System.out.println(stu.toString()); break;

					case 2 :	//������

						System.out.println("--------------------------------");
						System.out.println("������ : 1.���� | 2.���� | 3.���� ");
						System.out.println("--------------------------------");
						int subject = sc.nextInt();					

						switch (subject) {
						
						case 1:	// ���� 
							System.out.print("���� : ");
							stu.setKor(sc.nextInt());
							System.out.print("���> ");
							System.out.println(stu.toString());
							break;
							
						case 2: // ����
							System.out.print("���� : ");
							stu.setEng(sc.nextInt());
							System.out.print("���> ");
							System.out.println(stu.toString());
							break;
							
						case 3: // ����
							System.out.print("���� : ");
							stu.setMath(sc.nextInt());
							System.out.print("���> ");
							System.out.println(stu.toString());
							break;	
							
						default : System.err.println("��ȣ�� �߸� �Է��Ͽ����ϴ� (1~3 ����)"); 	

						} break;

					case 3 :	//�̸�
						
						System.out.print("������ �̸�: ");
						stu.setName(sc.next());
						System.out.println("�̸��� "+name+"���� "+stu.getName()+"���� ����Ǿ����ϴ�"); break;

					default : System.err.println("��ȣ�� �߸� �Է��Ͽ����ϴ�. ����ȭ������ ���ư��ϴ�"); break;

					} break;
					
				} //end if (stu.getName().equals(name)) 
			} //end while (it.hasNext())
		} //end else
	} //end fix

	public void delete() {

		Join join = new Join();
		System.out.println("<<���� ����>>");

		if (list.isEmpty()) { System.out.println("������ ������ �����ϴ�"); } 
		else {		
			System.out.println("-------------------------------------");
			System.out.println("���� - 1.���λ��� | 2.��ü���� | 3.�������");
			System.out.println("-------------------------------------");
			int s=sc.nextInt();

			switch(s) {

			case 1: //���λ���
				System.out.print("���� �� �л��̸�> ");
				String name = sc.next();
				it = list.iterator();
				
				while(it.hasNext()) {
					Student stu=it.next();						

					if(stu.getName().equals(name)) {

						System.out.println(name+"�л� ������ ���� �����Ͻðڽ��ϱ�?(Y/N)");
						String yn=sc.next();

						if(yn.equalsIgnoreCase("y")) {
							for(int i=1;i<=3;i++) {
								System.out.println("������ ��й�ȣ�� �Է��ϼ���");
								String password=sc.next();

								if(join.getSecurityNum().equals(password)) {
									list.remove(stu);
									System.out.println(stu.getName()+"�л������� �����Ǿ����ϴ�"); break;

								}else {				
									if(i==3) {System.err.println("���Ӱź�"); break;} 		
									else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ��� ( " + (3-i)+" ȸ ���ҽ��ϴ� )"); 	
								}
							}

						}else if(yn.equalsIgnoreCase("n")) {	
							System.out.println("���� ���α׷��� �����ϰ� ����ȭ������ �����ϴ�"); break; 

						}else  System.out.println("�ٽ� �Է����ּ���"); break; 	
					} //end if(stu.getName().equals(name))

				}break; //while

			case 2: //��ü����
				System.out.println("��ü���� �Ͻðڽ��ϱ�?(Y/N)");
				String yn=sc.next();

				if(yn.equalsIgnoreCase("y")) {			

					System.out.println("������ ��й�ȣ�� �Է��ϼ���");
					String password=sc.next();

					if(join.getSecurityNum().equals(password)) {
						System.out.println("���� ������ �Է��Ͻÿ� : �л���ü����Ȯ���մϴ�");
						String check=sc.next();
						if( check.equals("�л���ü����Ȯ���մϴ�") ) {
							list.clear();
							System.out.println("��� �����Ǿ����ϴ�"); 
							break;	
						}else System.out.println("Ȯ�ι����� �߸� �Է��Ͽ����ϴ�."); break;

					} else System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�"); break;

				}else if( yn.equalsIgnoreCase("n") ) {	
					System.out.println("���α׷� ����"); 

				}else System.out.println("���ڸ� ��Ȯ�� �Է��Ͻʽÿ�"); break;

			case 3: System.out.println("�������: ���� ȭ������ �����ϴ� "); break;
			
			default : System.err.println("�߸��� ��ȣ�� �����Ͽ����ϴ�. ���� ȭ������ ���ư��ϴ�"); break;
			
			} //end switch
		}
	} //end delete

} //end Method

