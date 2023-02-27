package java_Bclass.team02F_230226;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Method {
	LinkedList<Student> list = new LinkedList<Student>();
	Iterator<Student> it = list.iterator();
	Scanner sc = new Scanner(System.in);
	Student stu = new Student();

	public void add() {
		
		do {
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
			System.out.println("추가 등록 하시겠습니까? (Y/N)");
			String continueYn = sc.next();
			if( continueYn.equalsIgnoreCase("n") ) {
				{
					System.out.println("메인화면으로 돌아갑니다.");
					break;
				}
			}
		} while ( true );

	}

	public void search() { 

		Scanner sc = new Scanner(System.in);
		System.out.print("검색하고 싶은 학생 이름을 입력하세요 : ");
		String stuSearch = sc.nextLine();
		
		it = list.iterator();
		while( it.hasNext() ) {
			Student stu = it.next();
			
			if( stu.getName().equals(stuSearch) ) {
				System.out.println( stu.toString() );
			}
		}
		
	}

	public void output() {
		for (Student stu : list) {
            System.out.print(stu); //toString()함수 호출
            System.out.println();
            if( stu.getAvg() >= 90 ) {
            	System.out.println(stu.getName() + " 학생은 성적우수 학생입니다.");
                System.out.println();
             }
             else if(stu.getAvg() <= 70) {
             	System.out.println(stu.getName() + " 학생은 보충필요 학생입니다.");
                System.out.println();
             }
        }
      }

	public void fix() {
		
		if (list.isEmpty()) { System.out.println("저장된 학생정보가 없습니다"); }		
		else {		
			System.out.println("<<정보 수정>>");
			System.out.print("학생이름 입력 : ");
			String name = sc.next();	
			it = list.iterator();
			while (it.hasNext()) {	
				Student stu = it.next();

				if (stu.getName().equals(name)) {	
					
					System.out.println("---------------------------------");
					System.out.println(" 1.성적일괄수정 | 2.과목선택 | 3.이름");
					System.out.println("---------------------------------");
					int select = sc.nextInt();
					
					switch(select) {

					case 1 :	//성적일괄수정

						System.out.print("국어 : ");
						stu.setKor(sc.nextInt());
						System.out.print("영어 : ");
						stu.setEng(sc.nextInt());
						System.out.print("수학 : ");
						stu.setMath(sc.nextInt());
						System.out.print("결과> ");
						System.out.println(stu.toString()); break;

					case 2 :	//과목선택

						System.out.println("--------------------------------");
						System.out.println("과목선택 : 1.국어 | 2.영어 | 3.수학 ");
						System.out.println("--------------------------------");
						int subject = sc.nextInt();					

						switch (subject) {
						
						case 1:	// 국어 
							System.out.print("국어 : ");
							stu.setKor(sc.nextInt());
							System.out.print("결과> ");
							System.out.println(stu.toString());
							break;
							
						case 2: // 영어
							System.out.print("영어 : ");
							stu.setEng(sc.nextInt());
							System.out.print("결과> ");
							System.out.println(stu.toString());
							break;
							
						case 3: // 수학
							System.out.print("수학 : ");
							stu.setMath(sc.nextInt());
							System.out.print("결과> ");
							System.out.println(stu.toString());
							break;	
							
						default : System.err.println("번호를 잘못 입력하였습니다 (1~3 선택)"); 	

						} break;

					case 3 :	//이름
						
						System.out.print("변경할 이름: ");
						stu.setName(sc.next());
						System.out.println("이름이 "+name+"에서 "+stu.getName()+"으로 변경되었습니다"); break;

					default : System.err.println("번호를 잘못 입력하였습니다. 메인화면으로 돌아갑니다"); break;

					} break;
					
				} //end if (stu.getName().equals(name)) 
			} //end while (it.hasNext())
		} //end else
	} //end fix

	public void delete() {

		Join join = new Join();
		System.out.println("<<정보 삭제>>");

		if (list.isEmpty()) { System.out.println("삭제할 내역이 없습니다"); } 
		else {		
			System.out.println("-------------------------------------");
			System.out.println("삭제 - 1.개인삭제 | 2.전체삭제 | 3.삭제취소");
			System.out.println("-------------------------------------");
			int s=sc.nextInt();

			switch(s) {

			case 1: //개인삭제
				System.out.print("삭제 할 학생이름> ");
				String name = sc.next();
				it = list.iterator();
				
				while(it.hasNext()) {
					Student stu=it.next();						

					if(stu.getName().equals(name)) {

						System.out.println(name+"학생 정보를 정말 삭제하시겠습니까?(Y/N)");
						String yn=sc.next();

						if(yn.equalsIgnoreCase("y")) {
							for(int i=1;i<=3;i++) {
								System.out.println("관리자 비밀번호를 입력하세요");
								String password=sc.next();

								if(join.getSecurityNum().equals(password)) {
									list.remove(stu);
									System.out.println(stu.getName()+"학생정보가 삭제되었습니다"); break;

								}else {				
									if(i==3) {System.err.println("접속거부"); break;} 		
									else System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요 ( " + (3-i)+" 회 남았습니다 )"); 	
								}
							}

						}else if(yn.equalsIgnoreCase("n")) {	
							System.out.println("삭제 프로그램을 종료하고 메인화면으로 나갑니다"); break; 

						}else  System.out.println("다시 입력해주세요"); break; 	
					} //end if(stu.getName().equals(name))

				}break; //while

			case 2: //전체삭제
				System.out.println("전체삭제 하시겠습니까?(Y/N)");
				String yn=sc.next();

				if(yn.equalsIgnoreCase("y")) {			

					System.out.println("관리자 비밀번호를 입력하세요");
					String password=sc.next();

					if(join.getSecurityNum().equals(password)) {
						System.out.println("다음 문구를 입력하시오 : 학생전체삭제확인합니다");
						String check=sc.next();
						if( check.equals("학생전체삭제확인합니다") ) {
							list.clear();
							System.out.println("모두 삭제되었습니다"); 
							break;	
						}else System.out.println("확인문구를 잘못 입력하였습니다."); break;

					} else System.out.println("비밀번호가 일치하지 않습니다"); break;

				}else if( yn.equalsIgnoreCase("n") ) {	
					System.out.println("프로그램 종료"); 

				}else System.out.println("문자를 정확히 입력하십시오"); break;

			case 3: System.out.println("실행취소: 메인 화면으로 나갑니다 "); break;
			
			default : System.err.println("잘못된 번호를 선택하였습니다. 메인 화면으로 돌아갑니다"); break;
			
			} //end switch
		}
	} //end delete

} //end Method

