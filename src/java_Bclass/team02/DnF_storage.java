package java_Bclass.team02;

public class DnF_storage {
//2023.02.21.화 - 성적입력 스위치문 분리 생각중
	
	package java_Bclass.team02;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.InputMismatchException;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Scanner;

	public class DnF_ {
		ArrayList<Student> list = new ArrayList<Student>();
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
			System.out.print("학번 : ");
			stu.setNum(sc.next());
			list.add(stu);
		}

		public void output() {
			for (Student stu : list) {
				System.out.println(stu);
			}
		}
		
		//점수 입력시 글자 입력하면 오류남-해결 InputMismatchException try-catch
			//이름이 같은 학생은 수정 어떻게 됨?-첫번째 학생만 수정됨/이름이 같으면 목록 나오게 할까? 1번2번 인덱스번호를 골라서 수정
			//검색하면 이름 같은 학생 명단 출력-학교명 검색-삭제
			//indexOf????
		public void fix() {
			Scanner sc = new Scanner(System.in);
			if (stu==null) {	System.out.println("수정할 내역이 없습니다");}	//1-학생 없으면			
			else {							//1-학생 있으면
				System.out.println("<<정보 수정>>");
				System.out.print("학생 이름 : ");
				String name = sc.next();
				it = list.iterator();
				while (it.hasNext()) {					//2-학생 검색
					Student stu = it.next();
					try {		//예외처리	
						
						if (stu.getName().equals(name)) { //3-일치하는 이름 있을 때 (Student st : list)
							//이름 같은 학생 있으면 명단 뜨게 만들기
							//학번을 확인하고 학번을 입력하시오-----------------------여기부터/두번째 학생은 수정 안됨
							//이거 학번 확인 후 다시 입력칸으로 가게 하면 되지않
							//배열 만들까.....
							//학번 예외
							
							for(int i=0; i<list.size();i++) {	//3.2-일치하는 이름 출력
								if(name.equals(list.get(i).getName())) {
									System.out.println("학번 확인 후 학번 입력");
									System.out.print(list.get(i).toString());
								}
							}//3.2 for
							System.out.print("학번 검색 : ");
							String name2 = sc.next();
							it=list.iterator();
							if(stu.getNum().equals(name2)) {		//3-3. 학번입력
							
							System.out.print("과목선택 : 1.국어  2.영어 ");
							int subject = sc.nextInt();					//4-과목 선택
							
							while(subject !=2) {
							switch (subject) {
							case 1: // 국어 
								System.out.print("국어 : ");
								stu.setKor(sc.nextInt());
								break;
							case 2: // 영어
								System.out.print("영어 : ");
								stu.setEng(sc.nextInt());
								break;
							} break; //switch
							
							} System.out.println("숫자 잘못 입력");//while
							
							 } else System.out.println("학번 없음");
						}//if3
						else System.out.println("해당 학생이 없음"); break;  //3-일치하는 이름 없을 때
						
					}//try
					catch(InputMismatchException e) { System.out.println("숫자만 입력하세요"); System.err.println(e.getMessage()); }
				}//while
			}//else1
		}//fix

		public void delete() {
			Scanner sc = new Scanner(System.in);
			boolean accessOK=true;
			System.out.println("<<정보 삭제>>");

			if (stu == null) { System.out.println("삭제할 내역이 없습니다"); } 	//1-학생 정보 없을 때
			else {												//1-학생 정보 있을 때
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
										if(i==3) {System.out.println("접속거부"); accessOK=false;}			//6-3번 틀림	
										else System.out.println("비번 틀렸음"+(3-i)+"회 남음 다시입력"); 	//6-n(n<3) 틀림
									} 
								}

							}else if(yn.equalsIgnoreCase("n")) {	  //4-n입력
								System.out.println("프로그램 종료"); accessOK=false;

							}else { System.out.println("다시 입력"); }
						}	
					}else System.out.println("해당 학생이 없음"); break;   //3-일치하는 이름 없을 때
				}
			}
		}//delete
	}//DnF


	/*
	 * 수정 2023.02.16 13:01
	fix
	-학생목록 없으면 '수정할 내역 없다'고 뜨게함
	-학생이름 입력 후 과목 선택시 문자를 입력하면 예외로 넘겨서 '숫자만 입력'하라고 뜨게 함
	-과목 선택시 숫자 잘못입력하면 초기화면으로 돌아감
	*문제: 학생 이름 같을 경우 삭제, 수정은 먼저 입력된 학생만 됨


	*/
	/*
	 * 2023.02.21
	 * 오 이거 신기한데?
	 * System.err.println("에러나면 빨간색 출력");
	 * 종료할 때 system.exit() 쓰면??/~~를 누르면 프로그램 종료
	 * 
	 * 문제
	 * <<정보 수정>>
	학생 이름 : rla
	이름 : rla 국어 : 1 영어 : 2 수학 : 0 총점 : 3 평균 : 1.0 학번 : 4
	이름 : rla 국어 : 5 영어 : 6 수학 : 0 총점 : 11 평균 : 3.6666667 학번 : 7
	학번 검색 : 4
	과목선택 : 1.국어  2.영어 1
	국어 : 100
	숫자 잘못 입력

	틀린 학번 예외 추가하기
	 * 
	 */

}
