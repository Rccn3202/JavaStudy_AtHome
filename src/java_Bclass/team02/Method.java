package java_Bclass.team02;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import chap15_Collection.sec02.Board;

public class Method {
	
		Scanner sc=new Scanner(System.in);
		List<Student> list6=new ArrayList<>();
		Iterator<Student> it = list6.iterator();
		Student stu;
		
		//입력
		public void input() {
	        Scanner sc = new Scanner(System.in);
	       
	       do {
				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("국 > ");
				String kor = sc.nextLine();
				System.out.print("수 > ");
				String math = sc.nextLine();
				System.out.print("영 > ");
				String eng = sc.nextLine();
				System.out.print("학교 > ");
				String school = sc.nextLine();
				Student stu = new Student();

				list6.add(stu) ;
				System.out.println(name+kor+math+eng+school+"추가되었습니다.");
				System.out.println("계속 추가 하시겠습니까? (Y/N)");
				String input = sc.nextLine().toUpperCase();
				if (input.equals("Y"))
					continue;
				if (input.equals("N"))
					break;

			} while (true);
	       
	       }//end input
	       
	       
		//삭제 메소드
		void delete() {
			System.out.println("정보삭제---------------");
			System.out.println("학생 이름> ");

			String name=sc.nextLine();
			if (list6.contains(name)) {		//list6에서 입력된 값이 있으면 name에 담아 출력
	            System.out.println("정보 삭제 " + name);
	            list6.remove(name);
	        } else {
	            System.out.println("정보없음");
	        }
		}//end remove
		
		public void fix() {  //정보 수정 메소드
			System.out.println("정보수정-학생이름 입력> ");
			String name=sc.nextLine();
							
			//자바 Iterator 이용 :컬렉션 프레임워크(Collection Framework)에서 값을 가져오거나 삭제할 때 사용하는데
			//Iterator<데이터타입> iterator명 = 컬렉션.iterator();
			//컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있음
			//단방향 반복만 가능, 값 변경이나 추가 불가능.대량 데이터는 속도 느려짐
			
			if(stu ==null) {
				System.out.println("삭제할 학생 없음"); 
			} else {
				System.out.println("삭제할 학생 이름> ");
				String stuname=sc.next();
				it=list6.iterator();
				while(it.hasNext()) {
					Student stu=it.next();
					if(stu.getName().equals(stuname)) {
						System.out.println("정말 삭제?");
						while(true) {
							String yn=sc.next();
							if(yn.equals("y")) {
								System.out.println("관리자 번호를 입력하세요");
								String anum=sc.next();
								if(anum.equals("1234")) {
									list6.remove(stu);
									System.out.println("삭제되었습니다");
								}
							}else if(yn.equals("n")) {
								System.out.println("프로그램 종료");
								System.exit(0); //???
							}else {
								System.out.println("다시 입력");
							}
						}
						
					}
				}
				
			}
			
		}
		
		//수정 메소드
	/*	void fix() {
			
			
		        System.out.print("수정 할 이름 입력 : ");
		        String stuname = sc.next();
		        it = list6.iterator();
		        while (it.hasNext()) {
		            NStudent nstu = it.next();
		            if (nstu.getStudentName().equals(stuname)) { 
		                System.out.print("수정 - 1.국어  2.영어  3.수학 : ");
		                int f = sc.nextInt();
		                switch (f) {
		                case 1: // 국어 
		                    System.out.print("국어 : ");
		                    nstu.setKor(sc.nextInt());
		                    break;
		                case 2: // 영어
		                    System.out.print("영어 : ");
		                    nstu.setEng(sc.nextInt());
		                    break;
		                case 3: // 수학 
		                    System.out.print("수학 : "); 
		                    nstu.setMath(sc.nextInt());
		                    break;
		                }
		            }
		        }
			
			
		}
	
	*/

//	Scanner sc=new Scanner(System.in);
//	NoList list2=new NoList();
//		
//		
//	
//	    
//	
//		
//		System.out.println("학생 이름> ");
//		
//		
//		
//		
//		
//		//입력자 하나이고 학생수 얼마 없으니 arraylist써도 될듯
//		public void remove() {  //정보 삭제 메소드
//			System.out.println("정보삭제---------------");
//			System.out.println("학생 이름> ");
//			String name=sc.nextLine();
//			System.out.println(list2.remove());
//		}//end remove
//		
//		public void fix() {  //정보 수정 메소드
//			System.out.println("정보수정-학생이름 입력> ");
//			String name=sc.nextLine();
//							
//			//자바 Iterator 이용 :컬렉션 프레임워크(Collection Framework)에서 값을 가져오거나 삭제할 때 사용하는데
//			//Iterator<데이터타입> iterator명 = 컬렉션.iterator();
//			//컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있음
//			//단방향 반복만 가능, 값 변경이나 추가 불가능.대량 데이터는 속도 느려짐
//			
//		}//end fix
//		
//	

	
	
}//end class

//정보삭제메소드 : 이름으로 검색/모두 삭제기능 추가/중복되는 이름 어떻게 하지???(학교도 등록?)
//정보수정메소드 : 과목 검색 후 수정/변경된 내용 출력
//예외 추가
//입력범위 추가 1~100
