package java_Bclass.team02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		
		Student stu = null;
		
		char random = 0;
		for(int i=0;i<7;i++) {	
			random =(char)((int)(Math.random()*26)+65);
			System.out.print(random);
			
			String charandom=stu.charToString(random);
			System.out.println(charandom);
			String code=sc.nextLine();
		
			
		
		
		}
	
		
	//	if(code.equals(charandom)) {
		
		
	//	System.out.println("모두 삭제되었습니다"); 
		
	//	}else System.out.println("틀림");
}
}
