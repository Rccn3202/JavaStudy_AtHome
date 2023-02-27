package java_Bclass.team02F_230226;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		boolean run=true;
		boolean flage = true;
		Join join = new Join();
        Method method = new Method();

		while (run) {
			System.out.println("1. 회원가입  2. 로그인  3. 종료");
			System.out.print("메뉴 선택 > ");
			String option = sc.nextLine();

			if (option.equals("1")) {
				System.out.println("회원가입");
				System.out.print("ID : ");
				join.setId(sc.nextLine().trim());
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
				System.out.print("ID : ");
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
		
        while (flage) {
        	System.out.println("------------------------------------------------------------------");
            System.out.println("1.학생등록  2.학생검색  3.학생목록  4.학생정보수정  5.학생정보삭제  6.종료");
            System.out.println("------------------------------------------------------------------");
            System.out.print("선택> ");
            int choose;
            choose = sc.nextInt();
            while ( flage ) {
                switch (choose) {
                case 1: // 학생등록
                	method.add();
                    break;
 
                case 2: // 학생검색
                	method.search();
                    break;
 
                case 3:  //학생목록
                	method.output();
                	break;
 
                case 4: // 수정
                	method.fix();
                    break;
 
                case 5: // 삭제
                	method.delete();
                    break;
 
                case 6:	
                	flage = false; System.out.println("프로그램을 종료합니다.");
                    break;
                    
                default:   System.out.println("잘못입력하셨습니다.(1~6)"); 
                }
                break;
            }
        }
    }
}