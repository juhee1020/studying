package com.lec.ex02_arithmetic;

public class CheckOverflowMain {
	public static void main(String[] args) {
		//int result=2000000000 + 2000000000;
		//System.out.println(result); // 오버플로우
		try {
			int result2=safeAdd(2000000000,2000000000);
			System.out.println(result2);
		}catch(ArithmeticException e) {
			System.out.println("Overflow발생. 정확한 연산을 수행할 수 없습니다.");
		}
		// int result2=safeAdd(2000000000,2000000000);
		// System.out.println("result2="+result2); // result2=-294967296 아래 safeAdd문에 return left+right만 있었을때 결과값
		System.out.println("int타입 최대값 : "+Integer.MAX_VALUE);
		System.out.println("int타입 최소값 : "+Integer.MIN_VALUE);
	
	}// 리턴값이 없으므로 퍼블릭 스태틱 void ~~ 라고 적어줬던 거고
	
	public static int safeAdd(int left, int right) {
		if(right>0) { // 사용자가 강제로 예외를 발생시킨다.
			if(left>Integer.MAX_VALUE-right) {
				throw new ArithmeticException("Overflow 발생.");
			}
		}else {
			if(left<Integer.MIN_VALUE-right) {
				throw new ArithmeticException("Underflow 발생."); // 오버플로우인지 언더플로우인지...
			}
		}
		return left+right;
	} // 리턴값이 있다면 리턴되는 void 위치에 타입을 적어줘야한다.
}