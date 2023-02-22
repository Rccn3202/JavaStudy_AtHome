package java_Bclass.team02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Grade {
	    LinkedList<Student> list = new LinkedList<Student>();
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
	        System.out.print("���� : ");
	        stu.setMath(sc.nextInt());
	        list.add(stu);
	    }
	 
	    public void output() {
	        for (Student stu : list) {
	            System.out.println(stu); //toString()�Լ� ȣ��
	        }
	    }
	 
	    public void search() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("�̸� �˻� : ");
	        String n = sc.next();
	        it = list.iterator(); //���� ������ iterator�� �ҷ���
	        while (it.hasNext()) { //ã�� ������ �ѱ�
	            Student stu = it.next();
	            if (stu.getName().equals(n)) { //�Է��� n�� ������
	                System.out.println(stu); //n�� ����ִ� list ȣ��
	            }
	        }
	    }
	 
	    public void fix() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("���� �� �̸� �Է� : ");
	        String n = sc.next();
	        it = list.iterator();
	        while (it.hasNext()) {
	            Student stu = it.next();
	            if (stu.getName().equals(n)) { 
	                System.out.print("���� - 1.����  2.����  3.���� : ");
	                int f = sc.nextInt();
	                switch (f) {
	                case 1: // ���� 
	                    System.out.print("���� : ");
	                    stu.setKor(sc.nextInt());
	                    break;
	                case 2: // ����
	                    System.out.print("���� : ");
	                    stu.setEng(sc.nextInt());
	                    break;
	                case 3: // ���� 
	                    System.out.print("���� : "); 
	                    stu.setMath(sc.nextInt());
	                    break;
	                }
	            }
	        }
	    }
	 
	    public void delete() {
	        Scanner sc = new Scanner(System.in);
	        if (stu == null) {
	            System.out.println("������ ������ �����ϴ�");
	        } else {
	            System.out.print("���� �� �̸� �˻� : ");
	            String n = sc.next();
	            it = list.iterator();
	            while (it.hasNext()) {
	                Student stu = it.next();
	                if (stu.getName().equals(n)) {
	                    list.remove(stu);
	                }
	            }
	        }
	    }
}
