package com.lec.ex05_compare;
import java.util.*;
/*
Comparable과 Comparator

TreeSet객체와 TreeMap의 키는 저장과 동시에 자동으로 오름차순으로 정력되는데 숫자(Integer, Double..)
타입일 경우에는 값으로 정렬하고 문자열(String)타입일 경우에는 유니코드로 정렬된다.

TreeSet객체와 TreeMap을 정렬하기 위해서는 java.lang.Comparable인터페이스를 구현한 객체를 요구하는데
Integer, Double, String은 모두 Comparable인터페이스를 구현하고 있다.

사용자가 정의한 클래스를 자동으로 정렬을 하고자할 경우에는 Comparable을 구현해야 한다. Comparable
인터페이스는 compareTo()추상메서드가 정의되어 있기 때문에 사용자가 정의하는 클래스도 Comarable을
구현하려면 compareTo()를 재정의해야 한다.

compareTo()메서드는 int값을 리턴하는데 객체가 동일할 경우는 0, 작을 경우 -1, 클 경우는 1을 리턴한다.
TreeSet, TreeMap의 키가 Comparable을 구현하고 있지 않을 경우에는 객체를 저장하는 순간 ClassCastException
예외가 발생한다.
*/
public class ComparableMain {

	public static void main(String[] args) {

		TreeSet<Person> ts=new TreeSet<>();

		ts.add(new Person("에브리바디",2013));
		ts.add(new Person("뷰",2015));
		ts.add(new Person("돈콜미",2020));
		ts.add(new Person("콜미베이비",2008));
		ts.add(new Person("롤리폴리",2015));
		ts.add(new Person("칠성사이다",1999));
		
		System.out.println("총 객체 : "+ts.size()); // 1
		// 아래 컴페어투에 리턴 0 이라서 다 같은놈으로 인식하기 때문...
		// 이제 conpareTo 재정의해서 이제 0 안나옴.
		
		Iterator<Person> shinee=ts.iterator();
		while(shinee.hasNext()) {
			Person person=shinee.next();
			System.out.println(person.name +" / "+ person.age);
		}
	}

}

class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 1. 이름으로 비교
//	@Override
//	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);
//	}

	// 이름과 나이로 비교
	@Override
	public int compareTo(Person o) {
		String x = this.name + this.age;
		String y = o.name + o.age;
		return x.compareTo(y);
	}
	
	// 살습1. 나이로 비교(if)
//	@Override
//	public int compareTo(Person o) {
//		if(this.age < o.age) return -1;
//		else if(this.age == o.age) return 0;
//		else return 1;
//	}
	// 살습2. 나이로 비교(삼항연산자)
//	@Override
//	public int compareTo(Person o) {
//		return (this.age < o.age) ? -1 : ((this.age == o.age) ? 0 : 1);
//	}
	// 실습3. Integer의 compare()메서드이용
//	@Override
//	public int compareTo(Person o) {
//		return Integer.compare(this.age, o.age);
//	}

}