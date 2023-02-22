package java_Bclass.team02;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Re_DnF_ {
	 LinkedList<Student> list = new LinkedList<Student>();
	    Iterator<Student> it = list.iterator();
	    Student stu;
	 
	    public void input() {
	        Scanner sc = new Scanner(System.in);
	        stu = new Student();
	        System.out.print("이름 : ");
	        stu.setName(sc.next());
	        System.out.print("국어 : ");
	        stu.setKor(sc.nextInt());
	        System.out.print("영어 : ");
	        stu.setEng(sc.nextInt());
	        System.out.print("수학 : ");
	        stu.setMath(sc.nextInt());
	        list.add(stu);
	    }
	 
	    public void output() {
	        for (Student stu : list) {
	            System.out.println(stu); //toString()함수 호출
	        }
	    }
	 
	    public void search() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("이름 검색 : ");
	        String n = sc.next();
	        it = list.iterator(); //위에 선언한 iterator을 불러옴
	        while (it.hasNext()) { //찾을 떄까지 넘김
	            Student stu = it.next();
	            if (stu.getName().equals(n)) { //입력한 n이 같으면
	                System.out.println(stu); //n이 들어있는 list 호출
	            }
	        }
	    }
	 
	    public void fix() {
	        Scanner sc = new Scanner(System.in);
	        if(list.isEmpty()) {System.out.println("수정내용없음");
	        } else {
	        
	        System.out.print("수정 할 이름 입력 : ");
	        String n = sc.next();//이름 입력
	        it = list.iterator();
	        while (it.hasNext()) {//리스트에 값 잇는지
	            Student stu = it.next();
	            
	            
	            if (stu.getName().equals(n)) { 
	            	try {//숫자말고 문자열 입력하면 예외처리하기
	                System.out.print("수정 - 1.일괄  2.과목선택  3.이름 : ");
	                int f = sc.nextInt();
	                switch (f) {
	                case 1: // 일괄
	                	System.out.print("국어 : ");
	                    stu.setKor(sc.nextInt());
	                    System.out.print("수 : ");
	                    stu.setMath(sc.nextInt());
	                	System.out.print("영 : ");
	                    stu.setEng(sc.nextInt());
	                    break;
	                    
	                case 2: // 과목선택
	                	System.out.print("수정 - 1.국어  2.영어  3.수학 : ");
	                    int t = sc.nextInt();
	                    switch (t) {
	                    case 1: // 국어 
	                        System.out.print("국어 : ");
	                        stu.setKor(sc.nextInt());
	                        break;
	                    case 2: // 영어
	                        System.out.print("영어 : ");
	                        stu.setEng(sc.nextInt());
	                        break;
	                    case 3: // 수학 
	                        System.out.print("수학 : "); 
	                        stu.setMath(sc.nextInt());
	                        break;
	                    }
	                    
	                case 3: // 이름
	                    System.out.print("바꿀이름 : "); 
	                    stu.setName(sc.next());
	                    break;
	                
	                default : System.out.println("숫자 잘못입력"); break;    
	                
	                    
	                }
	            	 }catch(InputMismatchException e) {System.err.println("숫자만 입력하세요"); }
	            }else System.out.println("해당 학생이 없음"); break;//if
	           
	        }
	    }
	    }//if empty else
	    public void delete() {
	        Scanner sc = new Scanner(System.in);
	        if (stu == null) {
	            System.out.println("삭제할 내역이 없습니다");
	        } else {
	            System.out.print("삭제 할 이름 검색 : ");
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
