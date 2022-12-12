package com.lec.ex01_object.ex01_equals;
public class MemberMain {
	public static void main(String[] args) {
		Member m1=new Member("삼성");
		Member m2=new Member("삼성");
		Member m3=new Member("현대");
		int mm=10;
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		//1. m1,2,3의 해시코드 모두 다른다. <- 다른 객체!
		System.out.println();
		
		System.out.println(m1.equals(m2));//false
		System.out.println(m1.equals(m3));//false
		//2. m1, m2가 둘 다 삼성이라 true라고 생각할 수 있지만 다름.
		System.out.println();
		
		if(m1.equals(m2)) {
			System.out.println("동일객체입니다.");
		}else {System.out.println("다른객체입니다.");}


		/* 3. Member에서 hashcode와 equls를 재정의하고나서 다시 실행해보면 
		> m1.equals(m2) 가 true가 나오고 if문도 이프문도 동일객체 뽑힘.*/
	}
}