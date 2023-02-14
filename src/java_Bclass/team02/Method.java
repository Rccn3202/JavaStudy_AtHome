package java_Bclass.team02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import chap15_Collection.sec02.Board;

public class Method {

	Scanner sc=new Scanner(System.in);
	NoList list2=new NoList();
		
		
	
	    
	
		
		System.out.println("학생 이름> ");
		
		
		
		
		
		//입력자 하나이고 학생수 얼마 없으니 arraylist써도 될듯
		public void remove() {  //정보 삭제 메소드
			System.out.println("정보삭제---------------");
			System.out.println("학생 이름> ");
			String name=sc.nextLine();
			if (list2.contains(name)) {
	            System.out.println("Removed string: " + name);
	            list2.remove(name);
	        } else {
	            System.out.println("String not found.");
	        }
		}//end remove
		
		public void fix() {  //정보 수정 메소드
			System.out.println("정보수정-학생이름 입력> ");
			String name=sc.nextLine();
							
			//자바 Iterator 이용 :컬렉션 프레임워크(Collection Framework)에서 값을 가져오거나 삭제할 때 사용하는데
			//Iterator<데이터타입> iterator명 = 컬렉션.iterator();
			//컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있음
			//단방향 반복만 가능, 값 변경이나 추가 불가능.대량 데이터는 속도 느려짐
			
		}//end fix
		
	

	
	
}//end class

//정보삭제메소드 : 이름으로 검색/모두 삭제기능 추가/중복되는 이름 어떻게 하지???(학교도 등록?)
//정보수정메소드 : 과목 검색 후 수정/변경된 내용 출력
