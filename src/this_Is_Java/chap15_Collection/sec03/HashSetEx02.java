package chap15_Collection.sec03;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx02 {

	public static void main(String[] args) {
		//HashSet 拿泛记 积己
		Set<Member> set = new HashSet<Member>();
		
		//Member 按眉 历厘
		set.add(new Member("全辨悼", 30));
		set.add(new Member("全辨悼", 30));

		//历厘等 按眉 荐 免仿
		System.out.println("醚 按眉 荐 : " + set.size());
	}

}
