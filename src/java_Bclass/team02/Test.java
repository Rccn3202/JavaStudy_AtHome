package java_Bclass.team02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public void fix() {
		Scanner sc = new Scanner(System.in);
		if (list.isEmpty()) {	System.out.println("������ ������ �����ϴ�");}	//����Ʈ�� ��������� ������ ���� �����ϴ�		
		else {																//����Ʈ�� ������ ������
			System.out.println("<<���� ����>>");	
			System.out.print("�̸� �Է� : ");		
			String name = sc.next();										//�̸� �Է��ϸ� �Է��� ���� name�� �����
			it = list.iterator();											//ã������ ���ͷ����� ����, it�� ã��
			while (it.hasNext()) {											//�ݺ���(����ؽ�Ʈ) it���� ������
				Student stu = it.next();									//�Էµ� it���� �л�Ŭ������ �ִ���.stu�� �̿��� �л�Ŭ���� �̿�
				try {														//����	

					if (stu.getName().equals(name)) {						//���� �л�Ŭ����(stu)�� �Էµ�(getName)����� name�� ��ġ�ϸ�
						System.out.println("���� 1.�����ϰ����� 2.������ 3.�̸�");
						int select = sc.nextInt();							//�Էµ� ���� select�� ��´�
						switch(select) {									//???select�� true��?
						case 1 :											//1�� ������ �ϰ�����
							System.out.print("���� : ");
							stu.setKor(sc.nextInt());
							System.out.print("���� : ");
							stu.setEng(sc.nextInt());
							
							System.out.println("���");
							System.out.println(stu.toString());
							break;											//2�� ������ ���� ����
						case 2 :
							System.out.println("������ : 1.����  2.���� ");
							int subject = sc.nextInt();						//subject�� �Էµ� �� ���� 1�̳� 2

														
								switch (subject) {							//switch�� subject�� ���� ������
								case 1: 									//1 ������ ���� ����
									System.out.print("���� : ");
									stu.setKor(sc.nextInt());				
									break;
								case 2: 									//2 ������ ���� ����
									System.out.print("���� : ");
									stu.setEng(sc.nextInt());
									break;
								} break;
							
						case 3 :
							System.out.print("������ �̸�: ");
							stu.setName(sc.next());
							System.out.println(stu.toString());

						default : System.out.println("�߸��� ��ȣ ����. �������� ����");


						}//switch(select)





					}//if (stu.getName().equals(name))
					else System.out.println("�ش� �л��� ����"); break; 

				} catch(InputMismatchException e) {System.err.println("���ڸ� �Է��ϼ���"); }
			}//while (it.hasNext())
		}
	}//fix

	public void delete() {
		Scanner sc = new Scanner(System.in);
		boolean accessOK=true;
		System.out.println("<<���� ����>>");

		if (list.isEmpty()) { System.out.println("������ ������ �����ϴ�"); } 	
		else {												
			System.out.print("���� �� �л���> ");
			String name = sc.next();//������ �л��� name�� ��´�
			it = list.iterator();	//�÷��ǿ� ����Ǿ��ִ� ��ҵ��� �д� ��� ǥ��ȭ��
			while(it.hasNext()) {//list�� ���� �ִ��� ��� �ݺ�,list�� ���� it�� ��´�/��Ұ� ���������� true
				Student stu=it.next();					//it ���� �л�Ŭ���� stu�� ��´�/������ ����ȯ		
				if(stu.getName().equals(name)) {				//���� �л�Ŭ������ �մ� �̸����� name�̶� ������Ť� 
					
					while(accessOK) {
						System.out.println("���� ����?");
						String yn=sc.next();

						if(yn.equalsIgnoreCase("y")) {			
							for(int i=1;i<=3;i++) {
								System.out.println("������ ��ȣ�� �Է��ϼ���");
								String password=sc.next();

								if(password.equals("1234")) {	
									list.remove(stu);
									System.out.println(stu.getName()+"�� �����Ǿ����ϴ�"); 
									accessOK=false; break;

								}else {							
									if(i==3) {System.out.println("���Ӱź�"); accessOK=false;}			
									else System.out.println("��� Ʋ����"+(3-i)+"ȸ ���� �ٽ��Է�"); 	
								} 
							}//for(int i=1;i<=3;i++)

						}else if(yn.equalsIgnoreCase("n")) {	  
							System.out.println("���α׷� ����"); accessOK=false;

						}else { System.out.println("�ٽ� �Է�"); }
					}//while(accessOK)
					
				}else System.out.println("�ش� �л��� ����"); break;   //if(stu.getName().equals(name))
			}//while(it.hasNext())
		}
	}//delete
	
	
}


