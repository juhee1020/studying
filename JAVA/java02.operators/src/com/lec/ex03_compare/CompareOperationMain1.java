package com.lec.ex03_compare;
public class CompareOperationMain1 {
	public static void main(String[] args) {
		// 비교연산자 : =, <, >, <=, >=, !=
		int num1=10; int num2=20;
		boolean result1=num1 != num2;
		System.out.println(num1==num2); // false
		System.out.println(result1); // true
		System.out.println("--------------------");
		
		char char1='A'; char char2='B';
		boolean result2=char1<char2;
		System.out.println(result2); // true
		System.out.println("--------------------");
		
		// 비교연산시에는 연산을 수행하기 전에 형변환이 발생되어서 피연산자의 타입을 일치 시킨다.
		System.out.println('A'==65); // true
		System.out.println(3==3.0); // true
		System.out.println(0.1==0.1f); // false - 이진포맷기수를 사용하는 모든 부등소수점타입은 0.1을 정확히 표현할수없기 때문에 false값이 산출된다.
		// 즉 0.1f는 0.1000000014어쩌구 나오기 때문 (0.1이랑 0.1f가 더블로 형변환되는듯.)
		System.out.println((double)0.1f);
		System.out.println(0.1);
	}
}
