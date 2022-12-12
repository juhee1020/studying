package com.lec.ex02_arithmetic;

public class OverflowMain {
	public static void main(String[] args) {
		/*
		산술연산할 때 주의할 점은 
		연산결과가 데이터타입으로 충분히 표현가능한 범위인지 여부를 확인해야 한다.
		표현할 수 없는 값이 산출될 경우 overflow가 발생되고 그 결과값으로 쓰레기값(엉뚱한값)을 얻을 수 있다.
		*/
		int x=1000000;
		int y=1000000;
		System.out.println(x*y); // -727379968 : 오버플로우 발생.
		// ▲ 위와 같은 에러를 방지하기 위해서는 두 변수 중 하나는 long타입으로 선언되어야 함
		
		long a=1000000;
		long b=1000000;
		long c= a*b; // c도 롱타입으로 선언해야한다.
		System.out.println(c); // 1000000000000
	}
}
