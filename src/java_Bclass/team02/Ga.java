package java_Bclass.team02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DnF_ {
	LinkedList<Student> list = new LinkedList<Student>();
	Iterator<Student> it = list.iterator();
	Student stu;
	//DnF_Math dnfM = new DnF_Math();


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
			System.out.print(stu);
		}
	}

	//���� �Է½� ���� �Է��ϸ� ������-�ذ� InputMismatchException try-catch
	//�̸��� ���� �л��� ���� ��� ��?-ù��° �л��� ������/�̸��� ������ ��� ������ �ұ�? 1��2�� �ε�����ȣ�� ��� ����
	//�˻��ϸ� �̸� ���� �л� ���� ���-�б��� �˻�-����
	//indexOf????
	public void fix() {
		Scanner sc = new Scanner(System.in);
		if (list.isEmpty()) {	System.out.println("������ ������ �����ϴ�");}	//1-�л� ������			
		else {							//1-�л� ������
			System.out.println("<<���� ����>>");
			System.out.print("�̸� �Է� : ");
			String name = sc.next();	//�̸��Է�
			it = list.iterator();
			while (it.hasNext()) {					//2-�л� �˻� ���� �ִ���..
			Student stu = it.next();
		
			
				

					if (stu.getName().equals(name)) { //3-��ġ�ϴ� �̸� ���� �� (Student st : list)
						try {		//���ڸ� �Է��� ��쿹��ó��	
						System.out.println("���� 1.�����ϰ����� 2.������ 3.�̸�");
						int select = sc.nextInt();
						switch(select) {
						
						case 1 :
							
							System.out.print("���� : ");
							stu.setKor(sc.nextInt());
							System.out.print("���� : ");
							stu.setEng(sc.nextInt());
							System.out.println("���");
							System.out.println(stu.toString());
							
							break;
						case 2 :
							System.out.println("������ : 1.����  2.���� ");
							int subject = sc.nextInt();					//4-���� ����
						
							
								switch (subject) {
								case 1: // ���� 
									System.out.print("���� : ");
									stu.setKor(sc.nextInt());
									System.out.println(stu.toString());
									break;
								case 2: // ����
									System.out.print("���� : ");
									stu.setEng(sc.nextInt());
									System.out.println(stu.toString());
									break;
								
								} break;
							
						case 3 :
							System.out.print("������ �̸�: ");
							stu.setName(sc.next());
							System.out.println("�̸��� "+name+"���� "+stu.getName()+"���� ����Ǿ����ϴ�"); break;

						default : System.err.println("�߸��� ��ȣ ����. �������� ����"); break;


						}//try

						} catch(InputMismatchException e) {System.err.println("���ڸ� �Է��ϼ���"); }
						



					}//if3 - ���⿡ else ������ ��������........
					 //3-��ġ�ϴ� �̸� ���� ��

				
					}//while
		}//else1
	}//fix



	public void delete() {
		Scanner sc = new Scanner(System.in);
		boolean accessOK=true;
		System.out.println("<<���� ����>>");

		if (list.isEmpty()) { System.out.println("������ ������ �����ϴ�"); } 	//1-�л� ���� ���� ��
		else {												//1-�л� ���� ���� ��
			System.out.print("���� �� �л���> ");
			String name = sc.next();
			it = list.iterator();
			while(it.hasNext()) {
				Student stu=it.next();							//2-�л� �˻�
				
				//for(int k =0;k<list.size();k++) {
								//3-��ġ�ϴ� �̸� ���� ��
				//if(list.equals(name)) {
				
					if(stu.getName().equals(name)) {
					while(accessOK) {
						System.out.println("���� ����?");
						String yn=sc.next();

						if(yn.equalsIgnoreCase("y")) {			//4-y�Է�
							for(int i=1;i<=3;i++) {
								System.out.println("������ ��ȣ�� �Է��ϼ���");
								String password=sc.next();

								if(password.equals("1234")) {	//5-��ȣ �� �Էµ�
									list.remove(stu);//********
									System.out.println(stu.getName()+"�� �����Ǿ����ϴ�"); 
									accessOK=false; break;

								}else {							//5-��ȣ Ʋ��
									if(i==3) {System.err.println("���Ӱź�"); accessOK=false;}			//6-3�� Ʋ��	
									else System.out.println("��� Ʋ����"+(3-i)+"ȸ ���� �ٽ��Է�"); 	//6-n(n<3) Ʋ��
								} 
							}

						}else if(yn.equalsIgnoreCase("n")) {	  //4-n�Է�
							System.out.println("���α׷� ����"); accessOK=false;

						}else { System.out.println("�ٽ� �Է�"); }
					}	
				} //3-��ġ�ϴ� �̸� ���� ��
			
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
 * 2023.02.22
 * �������� �κп��� ���ڰ� �ƴ� ���ڿ� �Է��� �� ���������� '���ڸ� �Է��ϼ���' ���
 * �������� ��� �߰� : �����ϰ�����/�����ü���/�̸�����
 * ���� �� ����� ���� ���
 * 
 * ����) V�ι�°�� �Է��� �л��� ���� �ȵ�
 * 		�л� �̸� ���� ��� �����͸� ������
 *
 * �߰��ʿ�) �������� ���� ����
 * 		   V�ڲ� ������ �̸� ����
 * 			������� �ؼ� ��й�ȣ???(��ƿ ����Ŭ����) 
 * 			/Random r=new Random();//����Ŭ���� �ν��Ͻ�ȭ
			System.out.println(r.nextInt());
 * 
 * �˾ƺ���) main�� throws IOException �� ��������?
 * 		
 * 
 * 
 * 
 * ������ �� system.exit() ����??/~~�� ������ ���α׷� ����
 * 
 * 2023.02.22
 * ��������
 * �̸� ���� �л� ������ ���� �߰� �����
 * 
 * 
 * 

 * arrayList ���߹迭�� �ؼ� ���� �̸��̸� ���� �迭�� ������ �޸�??
 * 
 * ��ü���� ��ɳֱ� clear()? list.remove()?
 * 
 * 
 * 
 * 
 * //�̸� ���� �л� ������ ���� �߰� �����
						//�й��� Ȯ���ϰ� �й��� �Է��Ͻÿ�-----------------------�������/�ι�° �л��� ���� �ȵ�
						//�̰� �й� Ȯ�� �� �ٽ� �Է�ĭ���� ���� �ϸ� ������
						//�迭 �����.....
						//�й� ����


						}//3.2 for
						System.out.print("�й� �˻� : ");
						String name2 = sc.next();
						it=list.iterator();
						if(stu.getNum().equals(name2)) {		//3-3. �й��Է�
 * 
 * for(int i=0; i<list.size();i++) {	//3.2-��ġ�ϴ� �̸� ���
							if(name.equals(list.get(i).getName())) {
								System.out.println("�й� Ȯ�� �� �й� �Է�");
								System.out.print(list.get(i).toString());
							}





 */