package java_Bclass.team02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//�������� �޼ҵ�
public class Search_ {
	ArrayList<Student> list = new ArrayList<Student>();
	Iterator<Student> it = list.iterator();
	Student stu;
	Scanner sc = new Scanner(System.in);
	
	public void search() {
	
	        System.out.print("�й� : ");
	        String num = sc.next();
	        it = list.iterator();
	        while (it.hasNext()) {
	            Student stu = it.next();
	            if (stu.getNum().equals(num)) { 
	                System.out.print("������ : 1.����  2.���� ");
	                int subject = sc.nextInt();
	                switch (subject) {
	                case 1: // ���� 
	                    System.out.print("���� : ");
	                    stu.setKor(sc.nextInt());
	                    break;
	                case 2: // ����
	                    System.out.print("���� : ");
	                    stu.setEng(sc.nextInt());
	                    break;
	                }//switch
	            }//if
	}System.out.println("���� �߸� �Է�");//while
	
	}//method search
	            
}//Serach
