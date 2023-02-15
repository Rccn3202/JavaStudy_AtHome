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
        System.out.print("이름 : ");
        stu.setName(sc.next());
        System.out.print("국어 : ");
        stu.setKor(sc.nextInt());
        System.out.print("영어 : ");
        stu.setEng(sc.nextInt());
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
        System.out.print("수정 할 이름 입력 : ");
        String n = sc.next();
        it = list.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            if (stu.getName().equals(n)) { 
                System.out.print("수정 - 1.국어  2.영어  : ");
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
               
                }
            }
        }
    }
 
    public void delete() {
    	Scanner sc = new Scanner(System.in);
    	boolean accessOK=true;
    	System.out.println("<<정보 삭제>>");
    	if (stu == null) { 
    		System.out.println("삭제할 내역이 없습니다");
    	} else {
    		System.out.print("삭제 할 학생명> ");
    		String n = sc.next();
    		it = list.iterator();
    		while(it.hasNext()) {
    			Student stu=it.next();
    			
    			if(stu.getName().equals(n)) {
    				System.out.println("정말 삭제?");
    				while(accessOK) {
    					String yn=sc.next();

    					//~~가 삭제되었습니다 쓸까??
    					if(yn.equalsIgnoreCase("y")) {
    						for(int i=1;i<=3;i++) {
    						System.out.println("관리자 번호를 입력하세요");
							String password=sc.next();
							
    							if(password.equals("1234")) {
    								list.remove(stu);
    								System.out.println("삭제되었습니다"); 
    								accessOK=false; break;
	
    							}else {//만약에 1234가 아니면
    								
    								if(i==3) {
    									System.out.println("접속거부"); accessOK=false;
    								}else System.out.println("비번 틀렸음"+(3-i)+"회 남음 다시입력"); 
    							} 
    						}

    					}else if(yn.equalsIgnoreCase("n")) {
    						System.out.println("프로그램 종료");
    						System.exit(0); //???
    					}else {
    						System.out.println("다시 입력");		}
    				}	
    			}else System.out.println("해당 학생이 없음");
    		}
    	}
    }//delete
}//Grade
    

