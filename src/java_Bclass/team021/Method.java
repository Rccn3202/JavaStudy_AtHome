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
	      System.out.print("이름 : ");
	      stu.setName(sc.next());
	      list.add(stu);
	   }

	   
	   static void input() {
		   Scanner sc = new Scanner(System.in);
	      stu = new Student(); 
	      boolean flage1 = true;
	      System.out.print("점수를 등록할 학생 이름을 입력하세요 ");
	      String search = sc.next();
	      it=list.iterator();
	      while(it.hasNext()) {
	    	  Student stu=it.next();
	    	  
	      if (stu.getName().equals(search) ) { 
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
	      }
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
