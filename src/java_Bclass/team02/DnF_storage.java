package java_Bclass.team02;

public class DnF_storage {
//2023.02.21.ȭ - �����Է� ����ġ�� �и� ������
	
	package java_Bclass.team02;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.InputMismatchException;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Scanner;

	public class DnF_ {
		ArrayList<Student> list = new ArrayList<Student>();
		Iterator<Student> it = list.iterator();
		Student stu;
		public void input() {
			Scanner sc = new Scanner(System.in);
			stu = new Student(); 
			System.out.print("�̸� : ");
			stu.setName(sc.next());
			System.out.print("���� : ");
			stu.setKor(sc.nextInt());
			System.out.print("���� : ");
			stu.setEng(sc.nextInt());
			System.out.print("�й� : ");
			stu.setNum(sc.next());
			list.add(stu);
		}

		public void output() {
			for (Student stu : list) {
				System.out.println(stu);
			}
		}
		
		//���� �Է½� ���� �Է��ϸ� ������-�ذ� InputMismatchException try-catch
			//�̸��� ���� �л��� ���� ��� ��?-ù��° �л��� ������/�̸��� ������ ��� ������ �ұ�? 1��2�� �ε�����ȣ�� ��� ����
			//�˻��ϸ� �̸� ���� �л� ���� ���-�б��� �˻�-����
			//indexOf????
		public void fix() {
			Scanner sc = new Scanner(System.in);
			if (stu==null) {	System.out.println("������ ������ �����ϴ�");}	//1-�л� ������			
			else {							//1-�л� ������
				System.out.println("<<���� ����>>");
				System.out.print("�л� �̸� : ");
				String name = sc.next();
				it = list.iterator();
				while (it.hasNext()) {					//2-�л� �˻�
					Student stu = it.next();
					try {		//����ó��	
						
						if (stu.getName().equals(name)) { //3-��ġ�ϴ� �̸� ���� �� (Student st : list)
							//�̸� ���� �л� ������ ���� �߰� �����
							//�й��� Ȯ���ϰ� �й��� �Է��Ͻÿ�-----------------------�������/�ι�° �л��� ���� �ȵ�
							//�̰� �й� Ȯ�� �� �ٽ� �Է�ĭ���� ���� �ϸ� ������
							//�迭 �����.....
							//�й� ����
							
							for(int i=0; i<list.size();i++) {	//3.2-��ġ�ϴ� �̸� ���
								if(name.equals(list.get(i).getName())) {
									System.out.println("�й� Ȯ�� �� �й� �Է�");
									System.out.print(list.get(i).toString());
								}
							}//3.2 for
							System.out.print("�й� �˻� : ");
							String name2 = sc.next();
							it=list.iterator();
							if(stu.getNum().equals(name2)) {		//3-3. �й��Է�
							
							System.out.print("������ : 1.����  2.���� ");
							int subject = sc.nextInt();					//4-���� ����
							
							while(subject !=2) {
							switch (subject) {
							case 1: // ���� 
								System.out.print("���� : ");
								stu.setKor(sc.nextInt());
								break;
							case 2: // ����
								System.out.print("���� : ");
								stu.setEng(sc.nextInt());
								break;
							} break; //switch
							
							} System.out.println("���� �߸� �Է�");//while
							
							 } else System.out.println("�й� ����");
						}//if3
						else System.out.println("�ش� �л��� ����"); break;  //3-��ġ�ϴ� �̸� ���� ��
						
					}//try
					catch(InputMismatchException e) { System.out.println("���ڸ� �Է��ϼ���"); System.err.println(e.getMessage()); }
				}//while
			}//else1
		}//fix

		public void delete() {
			Scanner sc = new Scanner(System.in);
			boolean accessOK=true;
			System.out.println("<<���� ����>>");

			if (stu == null) { System.out.println("������ ������ �����ϴ�"); } 	//1-�л� ���� ���� ��
			else {												//1-�л� ���� ���� ��
				System.out.print("���� �� �л���> ");
				String name = sc.next();
				it = list.iterator();
				while(it.hasNext()) {
					Student stu=it.next();							//2-�л� �˻�

					if(stu.getName().equals(name)) {				//3-��ġ�ϴ� �̸� ���� ��
						
						while(accessOK) {
							System.out.println("���� ����?");
							String yn=sc.next();

							if(yn.equalsIgnoreCase("y")) {			//4-y�Է�
								for(int i=1;i<=3;i++) {
									System.out.println("������ ��ȣ�� �Է��ϼ���");
									String password=sc.next();

									if(password.equals("1234")) {	//5-��ȣ �� �Էµ�
										list.remove(stu);
										System.out.println(stu.getName()+"�� �����Ǿ����ϴ�"); 
										accessOK=false; break;

									}else {							//5-��ȣ Ʋ��
										if(i==3) {System.out.println("���Ӱź�"); accessOK=false;}			//6-3�� Ʋ��	
										else System.out.println("��� Ʋ����"+(3-i)+"ȸ ���� �ٽ��Է�"); 	//6-n(n<3) Ʋ��
									} 
								}

							}else if(yn.equalsIgnoreCase("n")) {	  //4-n�Է�
								System.out.println("���α׷� ����"); accessOK=false;

							}else { System.out.println("�ٽ� �Է�"); }
						}	
					}else System.out.println("�ش� �л��� ����"); break;   //3-��ġ�ϴ� �̸� ���� ��
				}
			}
		}//delete
	}//DnF


	/*
	 * ���� 2023.02.16 13:01
	fix
	-�л���� ������ '������ ���� ����'�� �߰���
	-�л��̸� �Է� �� ���� ���ý� ���ڸ� �Է��ϸ� ���ܷ� �Ѱܼ� '���ڸ� �Է�'�϶�� �߰� ��
	-���� ���ý� ���� �߸��Է��ϸ� �ʱ�ȭ������ ���ư�
	*����: �л� �̸� ���� ��� ����, ������ ���� �Էµ� �л��� ��


	*/
	/*
	 * 2023.02.21
	 * �� �̰� �ű��ѵ�?
	 * System.err.println("�������� ������ ���");
	 * ������ �� system.exit() ����??/~~�� ������ ���α׷� ����
	 * 
	 * ����
	 * <<���� ����>>
	�л� �̸� : rla
	�̸� : rla ���� : 1 ���� : 2 ���� : 0 ���� : 3 ��� : 1.0 �й� : 4
	�̸� : rla ���� : 5 ���� : 6 ���� : 0 ���� : 11 ��� : 3.6666667 �й� : 7
	�й� �˻� : 4
	������ : 1.����  2.���� 1
	���� : 100
	���� �߸� �Է�

	Ʋ�� �й� ���� �߰��ϱ�
	 * 
	 */

}