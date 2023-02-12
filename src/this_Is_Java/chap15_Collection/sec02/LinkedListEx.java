package chap15_Collection.sec02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		//ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		//LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();

		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		//ArrayList나 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();		//System.nanoTime(); 시간측정할 때 쓴다
		for(int i=0;i<10000;i++) {
			list1.add(0, String.valueOf(i));	//인덱스 0에 삽입된다-Array는 계속 뒤로 밀릴 것이고 Linked는 연결될 것
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ", (endTime-startTime));
		
		//LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();		//System.nanoTime(); 시간측정할 때 쓴다
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i));	//인덱스 0에 삽입된다-Array는 계속 뒤로 밀릴 것이고 Linked는 연결될 것
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : ", (endTime-startTime));
	}
	
		

}
