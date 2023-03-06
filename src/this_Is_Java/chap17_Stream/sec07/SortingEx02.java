package chap17_Stream.sec07;

import java.util.ArrayList;
import java.util.List;

public class SortingEx02 {

	public static void main(String[] args) {
		//List 컬렉션 생성
				List<Student02> studentList = new ArrayList<>();
				studentList.add(new Student02("홍길동", 30));
				studentList.add(new Student02("신용권", 10));
				studentList.add(new Student02("유미선", 20));
				
				//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
				studentList.stream();

	}

}
