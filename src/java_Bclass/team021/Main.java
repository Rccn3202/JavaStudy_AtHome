package java_Bclass.team021;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		public class AcademyProgram {
			   static LinkedList<Student> list = new LinkedList<Student>();
			   Iterator<Student> it = list.iterator();
			   static Student stu;
			   static Scanner sc = new Scanner(System.in);

			   public static void main(String[] args) {

			      boolean flage = true;

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
			      list.add(stu.setName(null));
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
			   

	}

}
