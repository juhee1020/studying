package com.lec.ex02_objects;

import java.util.Objects;

public class HashCodeMain {
	public static void main(String[] args) {
/*
	해시코드생성(hash(), hashCode())
	
	Objects.hash(Object...Object) 메서드는 
	주어진 값들을 이용해서 해시코드를 생성하는 기능을 하는데
	주어진 매개값들로 배열을 생성하고 Arrays.hashCode(Object[])를 호출해서
	해시코드를 생성하고 이 값을 리턴한다.
	
	이 메서드는 클래스가 hashCode()를 재정의할 때 리턴값을 생성하기 위해 사용한다.
	클래스가 여러가지 필드를 가지고 있을 때 이 필드들로부터 해시코드를 생성하게 되면
	동일한 필드값을 가지는 객체는 동일한 해시코드를 얻을 수 있다.
*/
		Student s1=new Student(1001, "홍길동");
		Student s2=new Student(1001, "홍길동");
		Student s3=new Student(1002, "어반시");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));
		
	}
	static class Student{
		String name;
		int ssn;
		
		public Student(int ssn, String name) {
			this.ssn=ssn;
			this.name=name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(ssn,name);
		}
		
	}
}