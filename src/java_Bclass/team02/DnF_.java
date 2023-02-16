package java_Bclass.team02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DnF_ {
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
            System.out.println(stu);
        }
    }
    public void fix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.next();
        it = list.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            if (stu.getName().equals(name)) { 
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
                }
            }
        }
    }
    
    public void delete() {
    	Scanner sc = new Scanner(System.in);
    	boolean accessOK=true;
    	System.out.println("<<정보 삭제>>");
    	
    	if (stu == null) { 										//1-학생 정보 없을 때
    		System.out.println("삭제할 내역이 없습니다");
    	} else {												//1-학생 정보 있을 때
    		System.out.print("삭제 할 학생명> ");
    		String name = sc.next();
    		it = list.iterator();
    		while(it.hasNext()) {
    			Student stu=it.next();							//2-학생 검색
 
    			if(stu.getName().equals(name)) {				//3-일치하는 이름 있을 때
    				while(accessOK) {
    					System.out.println("정말 삭제?");
    					String yn=sc.next();

    					if(yn.equalsIgnoreCase("y")) {			//4-y입력
    						for(int i=1;i<=3;i++) {
    						System.out.println("관리자 번호를 입력하세요");
							String password=sc.next();
							
    							if(password.equals("1234")) {	//5-번호 잘 입력됨
    								list.remove(stu);
    								System.out.println(stu.getName()+"이 삭제되었습니다"); 
    								accessOK=false; break;
	
    							}else {							//5-번호 틀림
    								if(i==3) {					//6-3번 틀림
    									System.out.println("접속거부"); accessOK=false;
    								}else System.out.println("비번 틀렸음"+(3-i)+"회 남음 다시입력"); 	//6-n(n<3) 틀림
    							} 
    						}

    					}else if(yn.equalsIgnoreCase("n")) {	////4-n입력
    						System.out.println("프로그램 종료"); accessOK=false;
    						
    					}else { System.out.println("다시 입력");		}
    				}	
    			}else System.out.println("해당 학생이 없음"); break; ////3-일치하는 이름 없을 때
    		}
    	}
    }//delete
}//DnF
    
    

