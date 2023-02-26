package java_Bclass.team02F;


import java.util.Scanner;
import java_Bclass.team021.Join;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run=true;
		boolean flage = true;
	
		Join join = new Join();
		Method method = new Method();

		while (run) {
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print("선택 -> ");
			String option = sc.nextLine();
			
			if (option.equals("1")) {
				System.out.println("회원가입");
				System.out.print("Id : ");
				join.setId(sc.nextLine());
				System.out.print("Password : ");
				join.setPassword(sc.nextLine());
				
				System.out.println("회원가입이 완료되었습니다.");
	
				continue;
			} else if (option.equals("2")) {
				if (join.getId() == null) {
					System.out.println("회원정보가 없습니다. 회원가입 해주세요.");
					continue;
				}
				System.out.println("아이디와 패스워드를 입력해주세요.");
				System.out.print("Id : ");
				join.setInputId(sc.nextLine());
				System.out.print("Password : ");
				join.setInputPw(sc.nextLine());


				if (join.getId().equals(join.getInputId()) && join.getPassword().equals(join.getInputPw())) {
					System.out.println("로그인 성공");
					break;
				} else
					System.out.println("다시 입력해주세요.");
				continue;

			} else if (option.equals("3")) {
				flage = false;
				System.out.println("종료합니다.");
				break;
			} else
				System.out.println("잘못누르셨습니다.");
			continue;
		}


		boolean flage1=true;
		while (flage1) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.학생등록  2.학생검색  3.학생목록  4.학생정보수정  5.학생정보삭제  6.종료");
			System.out.println("------------------------------------------------------------------");
			System.out.print("선택> ");
			int choose;
			choose = sc.nextInt();
			
			
			while (flage1) {
				switch (choose) {
				case 1: method.add(); break; //학생등록

				case 2: method.search();  break; // 이름검색

				case 3: method.output(); break; //학생목록

				case 4: method.fix(); break; // 수정

				case 5: method.delete(); break; //삭제

				case 6:	System.out.println("프로그램을 종료합니다"); flage1=false; break;

				default: System.out.println("잘못입력하셨습니다.(1~6)"); 
				} 
				break;
			}
		}
	}
}


