package chap15_Collection.Example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	//�ְ� ������ ���� ���̵� �����ϴ� ����
		int maxScore = 0;	//�ְ� ������ �����ϴ� ����
		int totalScore = 0;	//���� �հ踦 �����ϴ� ����
		
		//�ڵ� �ۼ�
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > maxScore) {
			name = entry.getKey();
			maxScore = entry.getValue();
			} 
			totalScore += entry.getValue();
		}

		int avgScore = totalScore / map.size();
		System.out.println("��� ����: "+avgScore);
		System.out.println("�ְ� ����: "+maxScore);
		System.out.println("�ְ� ������ ���� ���̵�: "+name);
		
	}

}
