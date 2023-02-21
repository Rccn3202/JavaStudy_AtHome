package java_Bclass.team02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//성적수정 메소드
public class Search_ {
	ArrayList<Student> list = new ArrayList<Student>();
	Iterator<Student> it = list.iterator();
	Student stu;
	Scanner sc = new Scanner(System.in);
	
	public void search() {
	
	        System.out.print("학번 : ");
	        String num = sc.next();
	        it = list.iterator();
	        while (it.hasNext()) {
	            Student stu = it.next();
	            if (stu.getNum().equals(num)) { 
	                System.out.print("과목선택 : 1.국어  2.영어 ");
	                int subject = sc.nextInt();
	                switch (subject) {
	                case 1: // 국어 
	                    System.out.print("국어 : ");
	                    stu.setKor(sc.nextInt());
	                    break;
	                case 2: // 영어
	                    System.out.print("영어 : ");
	                    stu.setEng(sc.nextInt());
	                    break;
	                }//switch
	            }//if
	}System.out.println("숫자 잘못 입력");//while
	
	}//method search
	            
}//Serach
