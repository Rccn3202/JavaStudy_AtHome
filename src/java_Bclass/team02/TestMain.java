package java_Bclass.team02;

import java.io.IOException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws IOException {
					Scanner sc = new Scanner(System.in);
			        Test test = new Test();
			        while (true) {
			        	System.out.println("----------------");
			            System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제  6.종료");
			            System.out.println("----------------");
			            System.out.print("선택 : ");
			            int choose;
			            choose = sc.nextInt();
			            while (choose != 6) {
			                switch (choose) {
			                case 1: // 입력
			                    test.input();
			                    break;
			 
			                case 2: // 출력
			                	test.output();
			                    break;
			 
			                case 3: break;
			 
			                case 4: // 수정
			                	test.fix();
			                    break;
			 
			                case 5: // 삭제
			                	test.delete();
			                    break;
			 
			                case 6:			 
			                    break;
			                }
			                break;
			            }
			        }
			    }
			

			}



	}

}
