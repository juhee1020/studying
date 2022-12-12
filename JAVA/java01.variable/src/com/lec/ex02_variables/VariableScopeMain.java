package com.lec.ex02_variables;

public class VariableScopeMain {
	public static void main(String[] args) {
		// 변수의 사용범위
		// local vs global (지역변수 vs 전역변수)
		int var1=10;
		System.out.println("var1의 값 : "+var1);
		System.out.println(); // 엔터같은 느낌인가?
		
		if(true) {
			int var2;
			var1=20;
			var2=20; // 지역변수
		}
		if(true) {
			int var3;
			var1=30;
			var3=30;
			//var2=5; // 에러(var2 cannot be resolved to a variable) : var2는 상기 if block에서만 사용할 수 있다.
		}
		System.out.println("var1의 값:"+var1);
		//System.out.println("var2의 값:"+var2); // var2가 선언된 블록(지역)에서만 사용가능.
		//System.out.println("var3의 값:"+var3); // 윗줄과 같은 이유로 에러.
	}
}
