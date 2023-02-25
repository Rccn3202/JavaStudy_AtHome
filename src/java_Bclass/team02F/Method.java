package java_Bclass.team02F;


import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import java_Bclass.team02.Student;

public class Method {
	LinkedList<Student> list = new LinkedList<Student>();
	Iterator<Student> it = list.iterator();
	Scanner sc = new Scanner(System.in);
	Student stu = new Student();
	
	
	public void add() {
		
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

/*	public void input() {
		
		System.out.println("점수를 등록할 학생 이름을 입력하세요 ");
		String search = sc.next();
		boolean flage1 = true;
		
		if(! stu.getName().equals(search)) System.out.println("등록되지 않은 학생입니다");
		else {
			while(flage1) {
				System.out.println("국어점수 : ");
				int kor = sc.nextInt(); //국어
				if(kor<0|kor>100) {
					System.out.println("1~100까지의 숫자만 입력가능합니다"); break;
				} else stu.setKor(kor); break;//
			}//list.add(stu);
			System.out.println("입력완료"); 
		}
		
		

	
	    }// end input
		
	*/	
	

	public void output() {
		for (Student stu : list) {
            System.out.println(stu); //toString()함수 호출
        }
	}

	//
	//이름이 같은 학생은 수정 어떻게 됨?-첫번째 학생만 수정됨/이름이 같으면 목록 나오게 할까? 1번2번 인덱스번호를 골라서 수정
	//검색하면 이름 같은 학생 명단 출력-학교명 검색-삭제
	
	public void fix() {
		Scanner sc = new Scanner(System.in);
		if (list.isEmpty()) {	System.out.println("저장된 학생정보가 없습니다");}		
		else {							
			System.out.println("<<정보 수정>>");
			System.out.print("학생이름 입력 : ");
			String name = sc.next();	
			it = list.iterator();
			while (it.hasNext()) {					
				Student stu = it.next();




				if (! stu.getName().equals(name)) System.out.println("일치하는 학생이 없습니다"); 
				else {	
					try {		//문자를 입력할 경우예외처리	
						System.out.println("---------------------------------");
						System.out.println(" 1.성적일괄수정 | 2.과목선택 | 3.이름");
						System.out.println("---------------------------------");
						int select = sc.nextInt();
						switch(select) {

						case 1 :

							System.out.print("국어 : ");
							stu.setKor(sc.nextInt());
							System.out.print("영어 : ");
							stu.setEng(sc.nextInt());
							System.out.print("수학 : ");
							stu.setMath(sc.nextInt());
							System.out.print("결과> ");
							System.out.println(stu.toString());

							break;
						case 2 :
							System.out.println("--------------------------------");
							System.out.println("과목선택 : 1.국어 | 2.영어 | 3.수학 ");
							System.out.println("--------------------------------");
							int subject = sc.nextInt();					//4-과목 선택


							switch (subject) {
							case 1: // 국어 
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
							default : System.err.println("번호를 잘못 입력하였습니다 (1~3 선택)"); break;	

							} break;

						case 3 :
							System.out.print("변경할 이름: ");
							stu.setName(sc.next());
							System.out.println("이름이 "+name+"에서 "+stu.getName()+"으로 변경되었습니다"); break;

						default : System.err.println("번호를 잘못 입력하였습니다. 메인화면으로 돌아갑니다"); break;


						}break;//switch

					} catch(InputMismatchException e) {System.err.println("숫자만 입력하세요"); }


						

				}break;
				//3-일치하는 이름 없을 때


			} //while
			
		}//else1
	}//fix



	public void delete() {
		Scanner sc = new Scanner(System.in);
		boolean accessOK=true;
		Join join = new Join();
		System.out.println("<<정보 삭제>>");

		if (list.isEmpty()) { System.out.println("삭제할 내역이 없습니다"); } 	//1-학생 정보 없을 때
		else {		//1-학생 정보 있을 때
			System.out.println("-------------------------------------");
			System.out.println("삭제 - 1.개인삭제 | 2.전체삭제 | 3.삭제취소");
			System.out.println("-------------------------------------");
			int s=sc.nextInt();

			switch(s) {

			case 1: 
				System.out.print("삭제 할 학생이름> ");
				String name = sc.next();
				it = list.iterator();
				while(it.hasNext()) {
					Student stu=it.next();							//2-학생 검색

					//for(int k =0;k<list.size();k++) {
					//3-일치하는 이름 있을 때
					//if(list.equals(name)) {
					
					
					if(! stu.getName().equals(name)) {System.out.println("일치하는 이름이 없습니다");}
					else {
						System.out.println(name+"학생 정보를 정말 삭제하시겠습니까?(Y/N)");
						String yn=sc.next();
					//	while(accessOK) {


							if(yn.equalsIgnoreCase("y")) {			//4-y입력
								for(int i=1;i<=3;i++) {
									System.out.println("관리자 비밀번호를 입력하세요");
									String password=sc.next();

									if(password.equals("1234")) {	//5-번호 잘 입력됨
										list.remove(stu);//********
										System.out.println(stu.getName()+"학생정보가 삭제되었습니다"); break;
									//	accessOK=false; break;

									}else {							//5-번호 틀림
										if(i==3) {System.err.println("접속거부"); break;} //accessOK=false; break;}			//6-3번 틀림	
										else System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요 ( "+(3-i)+" 회 남았습니다 )"); 	//6-n(n<3) 틀림
									} 
								}//for(int i=1;i<=3;i++)

							}else if(yn.equalsIgnoreCase("n")) {	  //4-n입력
								System.out.println("삭제 프로그램을 종료하고 메인화면으로 나갑니다"); break; //accessOK=false; break;

							}else { System.out.println("다시 입력해주세요"); break; }
					//	}//while(accessOK)
					} //else//if(stu.getName().equals(name))

				}//while
				break;

			case 2: //전체삭제
				System.out.println("전체삭제 하시겠습니까?(Y/N)");
				String yn=sc.next();

				if(yn.equalsIgnoreCase("y")) {			
					
					System.out.println("관리자 비밀번호를 입력하세요");
					String password=sc.next();

					if(password.equals("1234")) {	
						System.out.println("다음 문구를 입력하시오 : 학생전체삭제확인합니다");
						String check=sc.next();
						if(check.equals("학생전체삭제확인합니다")) {

							list.clear();//********
							System.out.println("모두 삭제되었습니다"); 
							break;	
						}else System.out.println("확인문구를 잘못 입력하였습니다"); break;


					} else System.out.println("비밀번호가 일치하지 않습니다"); break;

					

				}else if(yn.equalsIgnoreCase("n")) {	  //4-n입력
					System.out.println("프로그램 종료"); accessOK=false;

				}else { System.out.println("다시 입력"); break; } break;


			case 3: System.out.println("실행취소: 메인 화면으로 나갑니다 "); break;//취소
			default : System.err.println("잘못된 번호를 선택하였습니다. 메인 화면으로 돌아갑니다"); break;
			}//switch
		}

	}//delete
}//DnF

