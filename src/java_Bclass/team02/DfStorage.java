package java_Bclass.team02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DnF_ {
	LinkedList<Student> list = new LinkedList<Student>();
	Iterator<Student> it = list.iterator();
	Student stu;
	DnF_Math dnfM = new DnF_Math();


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
			System.out.print(stu);
		}
	}

	//점수 입력시 글자 입력하면 오류남-해결 InputMismatchException try-catch
	//이름이 같은 학생은 수정 어떻게 됨?-첫번째 학생만 수정됨/이름이 같으면 목록 나오게 할까? 1번2번 인덱스번호를 골라서 수정
	//검색하면 이름 같은 학생 명단 출력-학교명 검색-삭제
	//indexOf????
	public void fix() {
		Scanner sc = new Scanner(System.in);
		if (list.isEmpty()) {	System.out.println("수정할 내역이 없습니다");}	//1-학생 없으면			
		else {							//1-학생 있으면
			System.out.println("<<정보 수정>>");
			System.out.print("이름 입력 : ");
			String name = sc.next();	//이름입력
			it = list.iterator();
			while (it.hasNext()) {					//2-학생 검색 값이 있는지..
				Student stu = it.next();
				try {		//문자를 입력할 경우예외처리	

					if (stu.getName().equals(name)) { //3-일치하는 이름 있을 때 (Student st : list)
						System.out.println("선택 1.성적일괄수정 2.과목선택 3.이름");
						int select = sc.nextInt();
						switch(select) {
						
						case 1 :
							
							System.out.print("국어 : ");
							stu.setKor(sc.nextInt());
							System.out.print("영어 : ");
							stu.setEng(sc.nextInt());
							System.out.println("결과");
							System.out.println(stu.toString());
							
							break;
						case 2 :
							System.out.println("과목선택 : 1.국어  2.영어 ");
							int subject = sc.nextInt();					//4-과목 선택
						
							
								switch (subject) {
								case 1: // 국어 
									System.out.print("국어 : ");
									stu.setKor(sc.nextInt());
									System.out.println(stu.toString());
									break;
								case 2: // 영어
									System.out.print("영어 : ");
									stu.setEng(sc.nextInt());
									System.out.println(stu.toString());
									break;
								default : System.out.println("잘못된 번호 선택 메인으로 감"); break;
								} break; //switch
							
						case 3 :
							System.out.print("변경할 이름: ");
							stu.setName(sc.next());
							System.out.println("이름이 "+name+"에서 "+stu.getName()+"으로 변경되었습니다"); break;

						default : System.out.println("잘못된 번호 선택. 메인으로 나감");


						}





					}//if3
					else System.out.println("해당 학생이 없음"); break;  //3-일치하는 이름 없을 때

				}//try
				catch(InputMismatchException e) {System.err.println("숫자만 입력하세요"); }
			}//while
		}//else1
	}//fix



	public void delete() {
		Scanner sc = new Scanner(System.in);
		boolean accessOK=true;
		System.out.println("<<정보 삭제>>");

		if (list.isEmpty()) { System.out.println("삭제할 내역이 없습니다"); } 	//1-학생 정보 없을 때
		else {												//1-학생 정보 있을 때
			System.out.print("삭제 할 학생명> ");
			String name = sc.next();
			it = list.iterator();
			while(it.hasNext()) {
				Student stu=it.next();							//2-학생 검색
				
				//for(int k =0;k<list.size();k++) {
								//3-일치하는 이름 있을 때
				//if(list.equals(name)) {
				
					if(stu.getName().equals(name)) {
					while(accessOK) {
						System.out.println("정말 삭제?");
						String yn=sc.next();

						if(yn.equalsIgnoreCase("y")) {			//4-y입력
							for(int i=1;i<=3;i++) {
								System.out.println("관리자 번호를 입력하세요");
								String password=sc.next();

								if(password.equals("1234")) {	//5-번호 잘 입력됨
									list.remove(stu.getName());
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
 * 2023.02.22
 * 정보수정 부분에서 숫자가 아닌 문자열 입력할 시 빨간색으로 '숫자만 입력하세요' 출력
 * 정보수정 목록 추가 : 성적일괄수정/과목선택수정/이름수정
 * 수정 후 변경된 내용 출력
 * 
 * 문제) 두번째로 입력한 학생은 수정 안됨
 * 		학생 이름 같을 경우 위에것만 수정됨
 *
 * 추가필요) 성적점수 범위 설정
 * 		   자꾸 변경할 이름 나옴
 * 			난수얻기 해서 비밀번호???(유틸 랜덤클래스) 
 * 			/Random r=new Random();//랜덤클래스 인스턴스화
			System.out.println(r.nextInt());
 * 
 * 알아보기) main에 throws IOException 왜 넣은거임?
 * 		
 * 
 * 
 * 
 * 종료할 때 system.exit() 쓰면??/~~를 누르면 프로그램 종료
 * 
 * 2023.02.22
 * 수정내용
 * 이름 같은 학생 있으면 명단 뜨게 만들기
 * 학번을 확인하고 학번을 입력하시오-----------------------여기부터/두번째 학생은 수정 안됨!!!!!!!!!!!!!!!
						//이거 학번 확인 후 다시 입력칸으로 가게 하면 되지않
 * 
 * 

 * arrayList 다중배열로 해서 같은 이름이면 같은 배열로 줄줄이 달면??
 * 
 * 전체삭제 기능넣기 clear()? list.remove()?
 * 
 * 
 * 
 * 
 * //이름 같은 학생 있으면 명단 뜨게 만들기
						//학번을 확인하고 학번을 입력하시오-----------------------여기부터/두번째 학생은 수정 안됨
						//이거 학번 확인 후 다시 입력칸으로 가게 하면 되지않
						//배열 만들까.....
						//학번 예외


						}//3.2 for
						System.out.print("학번 검색 : ");
						String name2 = sc.next();
						it=list.iterator();
						if(stu.getNum().equals(name2)) {		//3-3. 학번입력
 * 
 * for(int i=0; i<list.size();i++) {	//3.2-일치하는 이름 출력
							if(name.equals(list.get(i).getName())) {
								System.out.println("학번 확인 후 학번 입력");
								System.out.print(list.get(i).toString());
							}





 */
