package com.mystudy.ex06_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam2 {

	public static void main(String[] args) {
		// ������ for���� ����� Map ������ ��ȸ
		int[] nums = {10, 20, 30, 40};
		System.out.println("--- �⺻���� for�� �迭�� ��� ---");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("--- ������ for�� �迭�� ��� ---");
		//for (�ϳ��ǵ�����Ÿ�� ����Һ����� : ���հ�ü) {}
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		//===============================================
		System.out.println("=======================================");
		Map<String, String> map = new HashMap<String, String>();
		map.put("Ű1", "��1");
		map.put("Ű2", "��2");
		map.put("Ű3", "��3");
		map.put("Ű4", "��4");
		map.put("Ű5", "��5");
		System.out.println(map); 
		
		//========================
		// ��ü ������ ȭ�� ���
		// ��¿�) Ű1-��1
		// �ǽ�1 : keySet(), iterator() ���(while�� �����)
		Set<String> keySet = map.keySet();
		Iterator<String> ite = keySet.iterator();
		while (ite.hasNext()) {
			String key = ite.next();
			String value = map.get(key);
			System.out.println(key + "-" + value);
		}
/*		
		while (ite.hasNext()) {
			System.out.println(ite.next() + "-" + map.get(ite.next()));
		}
		//���� - ite.hasNext()�ѹ� ���� ite.next()�� �ι� ���� ����ϱ� ����
		//�����Ͱ� Ȧ������ �� ������ ��
		
*/
		
		// �ǽ�2 : keySet() ���(������ for�� ��� - �ϸ� forEach��)
		System.out.println("-------");
		//keySet = map.keySet();
		for (String key : map.keySet()) {
			//String value = map.get(key);
			System.out.println(key + "-" + map.get(key));
		}
		
		// entrySet(), ������ for�� ���
		System.out.println("-------");
		//Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}





















