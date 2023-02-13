package java_Bclass.team02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		/*
		 * 학생 성적 입력 프로그램
		 * 담당 : 학생 정보 삭제 , 학생 정보 수정
		 * 구현
		 * 화면 설계

------------------------------------------------------------------
1. 학생 등록 2. 학생 점수 입력 3. 학생 목록 4. 학생 정보 삭제 5. 학생 정보 수정 6. 종료
------------------------------------------------------------------
메뉴 선택 > 4
삭제할 학생의 이름 >
삭제할 학생의 이름이 ( 이름 ) 이 맞으면 다시 입력, 아니면 0을 입력해주세요.
( 이름 ) 학생의 정보가 삭제되었습니다.

------------------------------------------------------------------
1. 학생 등록 2. 학생 점수 입력 3. 학생 조회 4. 학생 정보 삭제 5. 학생 정보 수정 6. 종료
------------------------------------------------------------------
메뉴 선택 > 5
정보를 수정할 학생의 이름 입력 >
나이 :
수강과목 :
국어 점수 :
수학 점수 :
영어 점수 :

------------------------------------------------------------------
1. 학생 등록 2. 학생 점수 입력 3. 학생 목록 4. 학생 정보 삭제 5. 학생 정보 수정 6. 종료
------------------------------------------------------------------
메뉴 선택 > 6
학원 수강생 관리 프로그램을 종료합니다.
		 */
		LinkedList<Student> listStudent = new LinkedList<>();
		Iterator<Student> it = listStudent.iterator();
	    Student stu = new Student();
	    Scanner sc = new Scanner(System.in);
	    
	    //내 담당 아님
	     input() {
	    	System.out.println("이름 ");
	    	stu.setName(sc.next());
	    	System.out.println("국어 ");
	    	stu.setKor(sc.nextInt());
	    	System.out.println("영 ");
	    	stu.setEng(sc.nextInt());
	    	System.out.println("수 ");
	    	stu.setMath(sc.nextInt());
	    	listStudent.add(stu);
	    }
	    
	    //여기까지
	    
		
		System.out.println("학생 이름> ");
		String name=sc.next();
		
		remove() {  //정보 삭제 메소드
			
		}
		
		public void fix() {  //정보 수정 메소드
			System.out.println("정보수정-학생이름 입력> ");
			name=sc.next();
							
			//자바 Iterator 이용 :컬렉션 프레임워크(Collection Framework)에서 값을 가져오거나 삭제할 때 사용하는데
			//Iterator<데이터타입> iterator명 = 컬렉션.iterator();
			//컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있음
			//단방향 반복만 가능, 값 변경이나 추가 불가능.대량 데이터는 속도 느려짐
			

		}
		
	}

	private static void input() {
		// TODO Auto-generated method stub
		
	}//end main
}//end class

//정보삭제메소드 : 이름으로 검색/모두 삭제기능 추가/중복되는 이름 어떻게 하지???(학교도 등록?)
//정보수정메소드 : 과목 검색 후 수정/변경된 내용 출력
