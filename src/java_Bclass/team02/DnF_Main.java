package java_Bclass.team02;

import java.io.IOException;
import java.util.Scanner;

public class DnF_Main {

		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
	        DnF_ dnf = new DnF_();
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
	                    dnf.input();
	                    break;
	 
	                case 2: // 출력
	                	dnf.output();
	                    break;
	 
	                case 3: break;
	 
	                case 4: // 수정
	                	dnf.fix();
	                    break;
	 
	                case 5: // 삭제
	                	dnf.delete();
	                    break;
	 
	                case 6:			 
	                    break;
	                }
	                break;
	            }
	        }
	    }
	

	}


