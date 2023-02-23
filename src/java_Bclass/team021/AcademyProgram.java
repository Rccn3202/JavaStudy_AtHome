package java_Bclass.team021;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import java_Bclass.team02.Student;

public class AcademyProgram {
   static LinkedList<Student> list = new LinkedList<Student>();
   Iterator<Student> it = list.iterator();
   static Student stu;
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {

      boolean flage = true;
      boolean run = true;
      Join join = new Join();
      
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

      while (flage) {
         System.out.println("------------------------------------------------------------");
         System.out.println("1.�л����  2.�л������Է�  3.�л����  4.�л���������  5.�л���������  6.����");
         System.out.println("------------------------------------------------------------");
         System.out.print("����> ");
         String menu = sc.nextLine();

         switch (menu) {

         case "1": add();
            break;

         case "2": input();
            break;
         case "3": output();

            break;
         case "4":

            break;
         case "5":

         case "6":
            flage = false;
            break;
         default:   System.out.println("�߸��Է��ϼ̽��ϴ�.(1~6)");
         }
      }
      
   }
   static void add() {
	  Scanner sc = new Scanner(System.in);
      stu = new Student(); 
      System.out.print("�̸� : ");
      stu.setName(sc.next());
      list.add(stu);
   }

   
   static void input() {
      stu = new Student(); 
      boolean flage1 = true;
      System.out.print("������ ����� �л� �̸��� �Է��ϼ��� ");
      String search = sc.nextLine();
      if ( search == stu.getName() ) { 
    	  while(flage1) {
    		  System.out.print("�������� : ");
    	      int kor = sc.nextInt(); //����
    	      	if( kor < 0 | kor > 100){
    	        	System.err.println("1~100������ ���ڸ� �Է°����մϴ�"); break;
    	        }else if( kor >= 1 | kor <= 100 ) {
    	        	stu.setKor( kor );
    	        }
    	      System.out.print("�������� : ");
    	      int eng = sc.nextInt(); //����
    	        if( eng < 0 | eng > 100){
    	           	System.err.println("1~100������ ���ڸ� �Է°����մϴ�"); break;
    	        }else if( eng >= 1 | eng <= 100 ) {
    	           	stu.setEng( eng );
    	        }
    	           
    	      System.out.print("�������� : ");
    	      int math = sc.nextInt(); //����
    	        if( math < 0 | math > 100){
    	           	System.err.println("1~100������ ���ڸ� �Է°����մϴ�"); break;
    	        }else if( math >= 1 | math <= 100 ) {
    	        	stu.setMath( math );
    	        }list.add(stu); 
    	        System.out.println("�Է� �Ϸ�Ǿ����ϴ�"); break;
    	  
    	  	} //end while
      } else {
    	  System.out.println("��ϵ��� ���� �л��Դϴ�");
      }//end if
      
    }// end input
   
   static void output() {
		for (Student stu : list) {
			System.out.println("--------------------------");
			System.out.println("          �л����");
			System.out.println("--------------------------");
			System.out.println(stu);
		} //end for
		
	} //end output
      
}
   
