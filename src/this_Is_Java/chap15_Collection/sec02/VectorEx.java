package chap15_Collection.sec02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list=new Vector<>(); //Vector말고 ArrayList 넣으면 오류난다

		//작업 스레드 객체 생성
		Thread threadA=new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1; i<=1000;i++) {			//for반복하면서 객체를 추가하고 있음
					list.add(new Board("제목"+i,"내용"+i, "글쓴이"+i));    
				}
			}
		};
		
		//작업 스레드 객체 생성
		Thread threadB=new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1001; i<=2000;i++) {			//for반복하면서 객체를 추가하고 있음
					list.add(new Board("제목"+i,"내용"+i, "글쓴이"+i));
			}
		}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();	//각 1000개씩 저장했으니까 <Board>안에는 2000개 저장되어야함
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
		threadA.join();			//메인 스레드가 스레드A가 종료될 때까지 기다림(1000개 저장할 때까지)
		threadB.join();			//메인 스레드가 스레드B가 종료될 때까지 기다림(1000개 저장할 때까지)
		} catch(Exception e) {
		}
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : "+size);
		System.out.println();
	}
}
