package java_Bclass.team021;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import java_Bclass.team02.Student;

public class Method {
	static Student stu;
	static LinkedList<Student> list = new LinkedList<Student>();
	static Iterator<Student> it = list.iterator();
	
	
	static void add() {
		  Scanner sc = new Scanner(System.in);
	      stu = new Student(); 
	      System.out.print("�̸� : ");
	      stu.setName(sc.next());
	      list.add(stu);
	   }

	   
	   static void input() {
		   Scanner sc = new Scanner(System.in);
	      stu = new Student(); 
	      boolean flage1 = true;
	      System.out.print("������ ����� �л� �̸��� �Է��ϼ��� ");
	      String search = sc.next();
	      it=list.iterator();
	      while(it.hasNext()) {
	    	  Student stu=it.next();
	    	  
	      if (stu.getName().equals(search) ) { 
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
	      }
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
