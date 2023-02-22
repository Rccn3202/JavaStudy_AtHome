package java_Bclass.team02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public void fix() {
		Scanner sc = new Scanner(System.in);
		if (list.isEmpty()) {	System.out.println("수정할 내역이 없습니다");}	//리스트가 비어있으면 수정할 내역 없습니다		
		else {																//리스트에 내용이 있으면
			System.out.println("<<정보 수정>>");	
			System.out.print("이름 입력 : ");		
			String name = sc.next();										//이름 입력하면 입력한 값이 name에 저장됨
			it = list.iterator();											//찾기위해 이터레이터 생성, it값 찾기
			while (it.hasNext()) {											//반복문(해즈넥스트) it값이 있으면
				Student stu = it.next();									//입력된 it값이 학생클래스에 있는지.stu를 이용해 학생클래스 이용
				try {														//예외	

					if (stu.getName().equals(name)) {						//만약 학생클래스(stu)에 입력된(getName)내용과 name이 일치하면
						System.out.println("선택 1.성적일괄수정 2.과목선택 3.이름");
						int select = sc.nextInt();							//입력된 값은 select에 담는다
						switch(select) {									//???select가 true면?
						case 1 :											//1번 누르면 일괄수정
							System.out.print("국어 : ");
							stu.setKor(sc.nextInt());
							System.out.print("영어 : ");
							stu.setEng(sc.nextInt());
							
							System.out.println("결과");
							System.out.println(stu.toString());
							break;											//2번 누르면 과목 선택
						case 2 :
							System.out.println("과목선택 : 1.국어  2.영어 ");
							int subject = sc.nextInt();						//subject에 입력된 값 저장 1이나 2

														
								switch (subject) {							//switch에 subject를 값을 넣으면
								case 1: 									//1 누르면 국어 수정
									System.out.print("국어 : ");
									stu.setKor(sc.nextInt());				
									break;
								case 2: 									//2 누르면 영어 수정
									System.out.print("영어 : ");
									stu.setEng(sc.nextInt());
									break;
								} break;
							
						case 3 :
							System.out.print("변경할 이름: ");
							stu.setName(sc.next());
							System.out.println(stu.toString());

						default : System.out.println("잘못된 번호 선택. 메인으로 나감");


						}//switch(select)





					}//if (stu.getName().equals(name))
					else System.out.println("해당 학생이 없음"); break; 

				} catch(InputMismatchException e) {System.err.println("숫자만 입력하세요"); }
			}//while (it.hasNext())
		}
	}//fix

	public void delete() {
		Scanner sc = new Scanner(System.in);
		boolean accessOK=true;
		System.out.println("<<정보 삭제>>");

		if (list.isEmpty()) { System.out.println("삭제할 내역이 없습니다"); } 	
		else {												
			System.out.print("삭제 할 학생명> ");
			String name = sc.next();//삭제할 학생명 name에 담는다
			it = list.iterator();	//컬렉션에 저장되어있는 요소들을 읽는 방법 표준화함
			while(it.hasNext()) {//list에 값이 있는한 계속 반복,list의 값은 it에 담는다/요소가 남아있으면 true
				Student stu=it.next();					//it 값을 학생클래스 stu에 담는다/데이터 벼녀환		
				if(stu.getName().equals(name)) {				//만약 학생클래스에 잇는 이름ㅁ이 name이랑 같으며ㅕㄴ 
					
					while(accessOK) {
						System.out.println("정말 삭제?");
						String yn=sc.next();

						if(yn.equalsIgnoreCase("y")) {			
							for(int i=1;i<=3;i++) {
								System.out.println("관리자 번호를 입력하세요");
								String password=sc.next();

								if(password.equals("1234")) {	
									list.remove(stu);
									System.out.println(stu.getName()+"이 삭제되었습니다"); 
									accessOK=false; break;

								}else {							
									if(i==3) {System.out.println("접속거부"); accessOK=false;}			
									else System.out.println("비번 틀렸음"+(3-i)+"회 남음 다시입력"); 	
								} 
							}//for(int i=1;i<=3;i++)

						}else if(yn.equalsIgnoreCase("n")) {	  
							System.out.println("프로그램 종료"); accessOK=false;

						}else { System.out.println("다시 입력"); }
					}//while(accessOK)
					
				}else System.out.println("해당 학생이 없음"); break;   //if(stu.getName().equals(name))
			}//while(it.hasNext())
		}
	}//delete
	
	
}


