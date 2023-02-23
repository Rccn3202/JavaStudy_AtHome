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
         System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
         System.out.print("선택 -> ");
         String option = sc.nextLine();

         if (option.equals("1")) {
            System.out.println("회원가입");
            System.out.print("Id : ");
            join.setId(sc.nextLine());
            System.out.print("Password : ");
            join.setPassword(sc.nextLine());
            System.out.println("회원가입이 완료되었습니다.");
            continue;
         } else if (option.equals("2")) {
            if (join.getId() == null) {
               System.out.println("회원정보가 없습니다. 회원가입 해주세요.");
               continue;
            }
            System.out.println("아이디와 패스워드를 입력해주세요.");
            System.out.print("Id : ");
            join.setInputId(sc.nextLine());
            System.out.print("Password : ");
            join.setInputPw(sc.nextLine());

            if (join.getId().equals(join.getInputId()) && join.getPassword().equals(join.getInputPw())) {
               System.out.println("로그인 성공");
               break;
            } else
               System.out.println("다시 입력해주세요.");
            continue;

         } else if (option.equals("3")) {
            flage = false;
            System.out.println("종료합니다.");
            break;
         } else
            System.out.println("잘못누르셨습니다.");
         continue;
      }

      while (flage) {
         System.out.println("------------------------------------------------------------");
         System.out.println("1.학생등록  2.학생점수입력  3.학생목록  4.학생정보삭제  5.학생정보수정  6.종료");
         System.out.println("------------------------------------------------------------");
         System.out.print("선택> ");
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
         default:   System.out.println("잘못입력하셨습니다.(1~6)");
         }
      }
      
   }
   static void add() {
	  Scanner sc = new Scanner(System.in);
      stu = new Student(); 
      System.out.print("이름 : ");
      stu.setName(sc.next());
      list.add(stu);
   }

   
   static void input() {
      stu = new Student(); 
      boolean flage1 = true;
      System.out.print("점수를 등록할 학생 이름을 입력하세요 ");
      String search = sc.nextLine();
      if ( search == stu.getName() ) { 
    	  while(flage1) {
    		  System.out.print("국어점수 : ");
    	      int kor = sc.nextInt(); //국어
    	      	if( kor < 0 | kor > 100){
    	        	System.err.println("1~100까지의 숫자만 입력가능합니다"); break;
    	        }else if( kor >= 1 | kor <= 100 ) {
    	        	stu.setKor( kor );
    	        }
    	      System.out.print("영어점수 : ");
    	      int eng = sc.nextInt(); //영어
    	        if( eng < 0 | eng > 100){
    	           	System.err.println("1~100까지의 숫자만 입력가능합니다"); break;
    	        }else if( eng >= 1 | eng <= 100 ) {
    	           	stu.setEng( eng );
    	        }
    	           
    	      System.out.print("수학점수 : ");
    	      int math = sc.nextInt(); //수학
    	        if( math < 0 | math > 100){
    	           	System.err.println("1~100까지의 숫자만 입력가능합니다"); break;
    	        }else if( math >= 1 | math <= 100 ) {
    	        	stu.setMath( math );
    	        }list.add(stu); 
    	        System.out.println("입력 완료되었습니다"); break;
    	  
    	  	} //end while
      } else {
    	  System.out.println("등록되지 않은 학생입니다");
      }//end if
      
    }// end input
   
   static void output() {
		for (Student stu : list) {
			System.out.println("--------------------------");
			System.out.println("          학생목록");
			System.out.println("--------------------------");
			System.out.println(stu);
		} //end for
		
	} //end output
      
}
   
