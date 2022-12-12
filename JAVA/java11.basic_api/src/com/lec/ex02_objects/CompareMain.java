package com.lec.ex02_objects;
import java.util.Comparator;
import java.util.Objects;


/*
	Objects 클래스
	
	Object 클래스와 유사한 이름을 가진 java.util.Objects 클래스는
	객체의 비교, 해시코드생성, null여부 객체문자널의 리턴 등의 연산을 수행하는
	정적메서드들로 구성된 Object의 유틸리티 클래스이다.
	
	1. 객체비교
	2. 동등비교(equals()와 deepEquals())
	3. 해시코드생성(hash(), hashCode())
*/
public class CompareMain {
	public static void main(String[] args) {
/*
	1. 객체비교
	compare(T a, T b, Comparator<T> c)
	
	Objects.compare()메서드는 두개의 객체(동일타입)를 비교해서 int를 리턴한다.
	java.util.Comparator<T>는 제너릭 인터페이스 타입으로 
	두 객체를 비교하는 compare(T a, T b)메서드가 정의되어있다.

*/
		Student s1=new Student(1);
		Student s2=new Student(2);
		Student s3=new Student(3);
		
		int result=Objects.compare(s1, s2, new StudentComparator());
		System.out.println("비교결과 : "+result);
		System.out.println("비교결과 : "+Objects.compare(s3, s2, new StudentComparator()));
	}

	static class Student{
		int sno;
		public Student(int sno) {
			this.sno=sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			/*
			if(o1.sno<o2.sno) return -1;
			else if(o1.sno==o2.sno) return 0;
			else return 1;
			*/
			return Integer.compare(o1.sno, o2.sno);
		}
	}
}