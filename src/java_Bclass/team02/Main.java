package java_Bclass.team02;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        Grade g = new Grade();
        while (true) {
            System.out.println("1.입력  2.출력  3.검색  4.수정  5.삭제  6.끝내기");
            System.out.print("선택 : ");
            int choose;
            choose = sc.nextInt();
            while (choose != 6) {
                switch (choose) {
                case 1: // 입력
                    g.input();
                    break;
 
                case 2: // 출력
                    g.output();
                    break;
 
                case 3: // 검색
                    g.search();
                    break;
 
                case 4: // 수정
                    g.fix();
                    break;
 
                case 5: // 삭제
                    g.delete();
                    break;
 
                case 6: // 끝내기
                    break;
                }
                break;
            }
        }
    }
}

//삭제하기 전에 정말 삭제하시겠습니까?
//