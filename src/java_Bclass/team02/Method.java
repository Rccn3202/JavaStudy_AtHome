package java_Bclass.team02;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import chap15_Collection.sec02.Board;

public class Method {
	
		Scanner sc=new Scanner(System.in);
		List<Student> list6=new ArrayList<>();
		Iterator<Student> it = list6.iterator();
		Student stu;
		
		//�Է�
		public void input() {
	        Scanner sc = new Scanner(System.in);
	       
	       do {
				System.out.print("�̸� > ");
				String name = sc.nextLine();
				System.out.print("�� > ");
				String kor = sc.nextLine();
				System.out.print("�� > ");
				String math = sc.nextLine();
				System.out.print("�� > ");
				String eng = sc.nextLine();
				System.out.print("�б� > ");
				String school = sc.nextLine();
				Student stu = new Student();

				list6.add(stu) ;
				System.out.println(name+kor+math+eng+school+"�߰��Ǿ����ϴ�.");
				System.out.println("��� �߰� �Ͻðڽ��ϱ�? (Y/N)");
				String input = sc.nextLine().toUpperCase();
				if (input.equals("Y"))
					continue;
				if (input.equals("N"))
					break;

			} while (true);
	       
	       }//end input
	       
	       
		//���� �޼ҵ�
		void delete() {
			System.out.println("��������---------------");
			System.out.println("�л� �̸�> ");

			String name=sc.nextLine();
			if (list6.contains(name)) {		//list6���� �Էµ� ���� ������ name�� ��� ���
	            System.out.println("���� ���� " + name);
	            list6.remove(name);
	        } else {
	            System.out.println("��������");
	        }
		}//end remove
		
		public void fix() {  //���� ���� �޼ҵ�
			System.out.println("��������-�л��̸� �Է�> ");
			String name=sc.nextLine();
							
			//�ڹ� Iterator �̿� :�÷��� �����ӿ�ũ(Collection Framework)���� ���� �������ų� ������ �� ����ϴµ�
			//Iterator<������Ÿ��> iterator�� = �÷���.iterator();
			//�÷��� �����ӿ�ũ���� ���� ���� �������� ������ �� ����
			//�ܹ��� �ݺ��� ����, �� �����̳� �߰� �Ұ���.�뷮 �����ʹ� �ӵ� ������
			
			if(stu ==null) {
				System.out.println("������ �л� ����"); 
			} else {
				System.out.println("������ �л� �̸�> ");
				String stuname=sc.next();
				it=list6.iterator();
				while(it.hasNext()) {
					Student stu=it.next();
					if(stu.getName().equals(stuname)) {
						System.out.println("���� ����?");
						while(true) {
							String yn=sc.next();
							if(yn.equals("y")) {
								System.out.println("������ ��ȣ�� �Է��ϼ���");
								String anum=sc.next();
								if(anum.equals("1234")) {
									list6.remove(stu);
									System.out.println("�����Ǿ����ϴ�");
								}
							}else if(yn.equals("n")) {
								System.out.println("���α׷� ����");
								System.exit(0); //???
							}else {
								System.out.println("�ٽ� �Է�");
							}
						}
						
					}
				}
				
			}
			
		}
		
		//���� �޼ҵ�
	/*	void fix() {
			
			
		        System.out.print("���� �� �̸� �Է� : ");
		        String stuname = sc.next();
		        it = list6.iterator();
		        while (it.hasNext()) {
		            NStudent nstu = it.next();
		            if (nstu.getStudentName().equals(stuname)) { 
		                System.out.print("���� - 1.����  2.����  3.���� : ");
		                int f = sc.nextInt();
		                switch (f) {
		                case 1: // ���� 
		                    System.out.print("���� : ");
		                    nstu.setKor(sc.nextInt());
		                    break;
		                case 2: // ����
		                    System.out.print("���� : ");
		                    nstu.setEng(sc.nextInt());
		                    break;
		                case 3: // ���� 
		                    System.out.print("���� : "); 
		                    nstu.setMath(sc.nextInt());
		                    break;
		                }
		            }
		        }
			
			
		}
	
	*/

//	Scanner sc=new Scanner(System.in);
//	NoList list2=new NoList();
//		
//		
//	
//	    
//	
//		
//		System.out.println("�л� �̸�> ");
//		
//		
//		
//		
//		
//		//�Է��� �ϳ��̰� �л��� �� ������ arraylist�ᵵ �ɵ�
//		public void remove() {  //���� ���� �޼ҵ�
//			System.out.println("��������---------------");
//			System.out.println("�л� �̸�> ");
//			String name=sc.nextLine();
//			System.out.println(list2.remove());
//		}//end remove
//		
//		public void fix() {  //���� ���� �޼ҵ�
//			System.out.println("��������-�л��̸� �Է�> ");
//			String name=sc.nextLine();
//							
//			//�ڹ� Iterator �̿� :�÷��� �����ӿ�ũ(Collection Framework)���� ���� �������ų� ������ �� ����ϴµ�
//			//Iterator<������Ÿ��> iterator�� = �÷���.iterator();
//			//�÷��� �����ӿ�ũ���� ���� ���� �������� ������ �� ����
//			//�ܹ��� �ݺ��� ����, �� �����̳� �߰� �Ұ���.�뷮 �����ʹ� �ӵ� ������
//			
//		}//end fix
//		
//	

	
	
}//end class

//���������޼ҵ� : �̸����� �˻�/��� ������� �߰�/�ߺ��Ǵ� �̸� ��� ����???(�б��� ���?)
//���������޼ҵ� : ���� �˻� �� ����/����� ���� ���
//���� �߰�
//�Է¹��� �߰� 1~100
