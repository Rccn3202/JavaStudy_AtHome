package java_Bclass.team02F;


import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import java_Bclass.team02.Student;

public class Method {
	LinkedList<Student> list = new LinkedList<Student>();
	Iterator<Student> it = list.iterator();
	Scanner sc = new Scanner(System.in);
	Student stu = new Student();
	
	
	public void add() {
		
		Scanner sc = new Scanner(System.in);
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
	}

/*	public void input() {
		
		System.out.println("������ ����� �л� �̸��� �Է��ϼ��� ");
		String search = sc.next();
		boolean flage1 = true;
		
		if(! stu.getName().equals(search)) System.out.println("��ϵ��� ���� �л��Դϴ�");
		else {
			while(flage1) {
				System.out.println("�������� : ");
				int kor = sc.nextInt(); //����
				if(kor<0|kor>100) {
					System.out.println("1~100������ ���ڸ� �Է°����մϴ�"); break;
				} else stu.setKor(kor); break;//
			}//list.add(stu);
			System.out.println("�Է¿Ϸ�"); 
		}
		
		

	
	    }// end input
		
	*/	
	

	public void output() {
		for (Student stu : list) {
            System.out.println(stu); //toString()�Լ� ȣ��
        }
	}

	//
	//�̸��� ���� �л��� ���� ��� ��?-ù��° �л��� ������/�̸��� ������ ��� ������ �ұ�? 1��2�� �ε�����ȣ�� ��� ����
	//�˻��ϸ� �̸� ���� �л� ��� ���-�б��� �˻�-����
	
	public void fix() {
		Scanner sc = new Scanner(System.in);
		if (list.isEmpty()) {	System.out.println("����� �л������� �����ϴ�");}		
		else {							
			System.out.println("<<���� ����>>");
			System.out.print("�л��̸� �Է� : ");
			String name = sc.next();	
			it = list.iterator();
			while (it.hasNext()) {					
				Student stu = it.next();




				if (! stu.getName().equals(name)) System.out.println("��ġ�ϴ� �л��� �����ϴ�"); 
				else {	
					try {		//���ڸ� �Է��� ��쿹��ó��	
						System.out.println("---------------------------------");
						System.out.println(" 1.�����ϰ����� | 2.������ | 3.�̸�");
						System.out.println("---------------------------------");
						int select = sc.nextInt();
						switch(select) {

						case 1 :

							System.out.print("���� : ");
							stu.setKor(sc.nextInt());
							System.out.print("���� : ");
							stu.setEng(sc.nextInt());
							System.out.print("���� : ");
							stu.setMath(sc.nextInt());
							System.out.print("���> ");
							System.out.println(stu.toString());

							break;
						case 2 :
							System.out.println("--------------------------------");
							System.out.println("������ : 1.���� | 2.���� | 3.���� ");
							System.out.println("--------------------------------");
							int subject = sc.nextInt();					//4-���� ����


							switch (subject) {
							case 1: // ���� 
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
							default : System.err.println("��ȣ�� �߸� �Է��Ͽ����ϴ� (1~3 ����)"); break;	

							} break;

						case 3 :
							System.out.print("������ �̸�: ");
							stu.setName(sc.next());
							System.out.println("�̸��� "+name+"���� "+stu.getName()+"���� ����Ǿ����ϴ�"); break;

						default : System.err.println("��ȣ�� �߸� �Է��Ͽ����ϴ�. ����ȭ������ ���ư��ϴ�"); break;


						}break;//switch

					} catch(InputMismatchException e) {System.err.println("���ڸ� �Է��ϼ���"); }


						

				}break;
				//3-��ġ�ϴ� �̸� ���� ��


			} //while
			
		}//else1
	}//fix



	public void delete() {
		Scanner sc = new Scanner(System.in);
		boolean accessOK=true;
		Join join = new Join();
		System.out.println("<<���� ����>>");

		if (list.isEmpty()) { System.out.println("������ ������ �����ϴ�"); } 	//1-�л� ���� ���� ��
		else {		//1-�л� ���� ���� ��
			System.out.println("-------------------------------------");
			System.out.println("���� - 1.���λ��� | 2.��ü���� | 3.�������");
			System.out.println("-------------------------------------");
			int s=sc.nextInt();

			switch(s) {

			case 1: 
				System.out.print("���� �� �л��̸�> ");
				String name = sc.next();
				it = list.iterator();
				while(it.hasNext()) {
					Student stu=it.next();							//2-�л� �˻�

					//for(int k =0;k<list.size();k++) {
					//3-��ġ�ϴ� �̸� ���� ��
					//if(list.equals(name)) {
					
					
					if(! stu.getName().equals(name)) {System.out.println("��ġ�ϴ� �̸��� �����ϴ�");}
					else {
						System.out.println(name+"�л� ������ ���� �����Ͻðڽ��ϱ�?(Y/N)");
						String yn=sc.next();
					//	while(accessOK) {


							if(yn.equalsIgnoreCase("y")) {			//4-y�Է�
								for(int i=1;i<=3;i++) {
									System.out.println("������ ��й�ȣ�� �Է��ϼ���");
									String password=sc.next();

									if(password.equals("1234")) {	//5-��ȣ �� �Էµ�
										list.remove(stu);//********
										System.out.println(stu.getName()+"�л������� �����Ǿ����ϴ�"); break;
									//	accessOK=false; break;

									}else {							//5-��ȣ Ʋ��
										if(i==3) {System.err.println("���Ӱź�"); break;} //accessOK=false; break;}			//6-3�� Ʋ��	
										else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ��� ( "+(3-i)+" ȸ ���ҽ��ϴ� )"); 	//6-n(n<3) Ʋ��
									} 
								}//for(int i=1;i<=3;i++)

							}else if(yn.equalsIgnoreCase("n")) {	  //4-n�Է�
								System.out.println("���� ���α׷��� �����ϰ� ����ȭ������ �����ϴ�"); break; //accessOK=false; break;

							}else { System.out.println("�ٽ� �Է����ּ���"); break; }
					//	}//while(accessOK)
					} //else//if(stu.getName().equals(name))

				}//while
				break;

			case 2: //��ü����
				System.out.println("��ü���� �Ͻðڽ��ϱ�?(Y/N)");
				String yn=sc.next();

				if(yn.equalsIgnoreCase("y")) {			
					
					System.out.println("������ ��й�ȣ�� �Է��ϼ���");
					String password=sc.next();

					if(password.equals("1234")) {	
						System.out.println("���� ������ �Է��Ͻÿ� : �л���ü����Ȯ���մϴ�");
						String check=sc.next();
						if(check.equals("�л���ü����Ȯ���մϴ�")) {

							list.clear();//********
							System.out.println("��� �����Ǿ����ϴ�"); 
							break;	
						}else System.out.println("Ȯ�ι����� �߸� �Է��Ͽ����ϴ�"); break;


					} else System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�"); break;

					

				}else if(yn.equalsIgnoreCase("n")) {	  //4-n�Է�
					System.out.println("���α׷� ����"); accessOK=false;

				}else { System.out.println("�ٽ� �Է�"); break; } break;


			case 3: System.out.println("�������: ���� ȭ������ �����ϴ� "); break;//���
			default : System.err.println("�߸��� ��ȣ�� �����Ͽ����ϴ�. ���� ȭ������ ���ư��ϴ�"); break;
			}//switch
		}

	}//delete
}//DnF

