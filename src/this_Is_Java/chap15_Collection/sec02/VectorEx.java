package chap15_Collection.sec02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list=new Vector<>();

		//작업 스레드 객체 생성
		Thread threadA=new Thread() {
			@Override
			public void run() {
			//객체 1000개 추가
				for(int i=1; i<=1000;i++) {
					list.add(new Board("제목"+i,"내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 객체 생성
		Thread threadB=new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
		}
		
		
		
	}

}
