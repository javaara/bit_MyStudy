package com.mystudy.ex05_hashset;

import java.util.HashSet;

class Person {
	String name; //이름
	int age; //나이
	String jumin; //주민번호
	
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]" +"\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		return true;
	}
}

public class HashSetExam_equals {

	public static void main(String[] args) {
		// Set 중복데이터 하나만 저장
		// 참조형 데이터의 동일 데이터 여부는 equals 메소드 기준
		// equals() 메소드를 재정의(override)하고, hashCode() 함께 재정의
		// 비교순서 : hashCode() 값 비교 후 같으면 equals() 비교
		HashSet set = new HashSet();
		set.add("ABC");
		set.add("ABC");
		set.add("XYZ");
		System.out.println(set);
		
		set.add(new Person("홍길동", 30, "901010-1111111"));
		set.add(new Person("홍길동", 27, "901010-1111111"));
		set.add(new Person("홍길동", 30, "901010-1222222"));
		System.out.println(set);
	}

}
