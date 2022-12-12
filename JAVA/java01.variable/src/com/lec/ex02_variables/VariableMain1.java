package com.lec.ex02_variables;
/*
  1. 변수란?    (int val = 10; // 초기화&선언)
  	프로그램의 작업을 처리하는 과정에서 필요에 따라 데이터를 메모리에 저장하게 되는데 
  	이때 그 값을 저장하기 위해서 변수(Variable)를 선언한다. 
  	이 변수는 하나의 값을 저장하는 메모리 공간을 의미한다.

  	변수라는 용어는 프로그램에서 수시로 값이 변동되면서 저장된 값이 변하기 때문에 변수라고 명명이 되었다.

  2. 변수의 명명규칙.
  	a) 첫번째 문자는 문자,$,언더바(_)로 시작해야하고 숫자로 시작할 수 없다. (반드시 지켜야함)
  	b) 변수명은 대문자와 소문자를 구분한다. (ex. firstName과 FirstName은 다른 변수다.)
  	c) 첫번째문자는 소문자로 시작하고 단어 구분마다 대문자로 쓴다.(Camel Case 방식 / 반드시는 아니고 관례)
  	d) 변수명의 길이는 제한이 없다.
  	e) 한글명도 가능하다. 하지만 사용하지 않는다.(관례)
  	f) 변수명으로 자바예약어(if, for 등...)는 사용할 수 없다.(필수)

  3. 변수의 사용.
  	변수에 값을 저장할 때 대입연산자(Assignment, =)를 사용한다. 
  	수학에서는 동등비교지만 프로그램언어에서는 변수에 값을 대입하는 기능을 한다.
  	
  	변수를 선언하고 최초의 값을 저장하는 행위를 초기화라고 하고 이 값을 초기값이라고 한다.
  	자바에서 변수를 사용하기 위해서는 반드시 초기화가 되어야 사용할 수 있다.
  	이 행위를 자바에서는 "변수의 초기화"라고 한다.
  	
  	리터럴(literal)과 상수(constant, 변하지않는 값)는 같은 의미이지만 
  	java에서는 
  	literal을 값을 변경할 수 없는 자료, 
  	상수는 "한번 값을 저장하면 변경할 수 없는 변수"로 정의하기 때문에 
  	java에서는 literal과 constant를 구분해서 사용한다.
  	
  	컨스턴트는 나중에 변수가 파이널리로 선언?되잇고 그건 이제 값을 변경할 수 없다.
  	리터럴은 int a =10; 이라고 할때 10이 리터럴...?
*/
public class VariableMain1 {
	public static void main(String[] args) {//클래스명은 대문자로 시작하는게 관례.
		/*  1. 변수의 선언 방법.
		 		a. 데이터타입 변수명; // 선언만 한것.
		 		b. 데이터타입 변수명 = 값; // 선언과 초기화
		*/
		int firstNumber = 10;
		// int firstNumber = 50; // 에러. 한번 선언된 변수를 재선언할 수 없다.
		int firstnumber = 20; // 대소문자를 구분하므로 이건 재선언한게 아님. 그러므로 오류x
		int FirstNumber = 5; // 에러는 아니나 변수명 명명규칙 관례에 어긋남.
		int 첫번째숫자 = 25; // 한글변수명 가능. (관례적으로 잘 쓰이진않음)
		System.out.println(firstNumber+firstnumber+FirstNumber+첫번째숫자);
		System.out.println("firstNumber ="+firstNumber); // 10
		// 형변환이 일어나서 자동으로(자동형변환) 문자열로 "firstNumber =10" 되는거.

		// firstNumber=20; // 값을 변경.
		// firstNumber=20.0 // 에러. java에서는 변수타입 즉, 정수와 실수는 다른 자료형이기 때문에 에러.
		firstNumber=(int)(20.0); // 20.0을 강제로 정수타입으로 바꿔준것.
		System.out.println("firstNumber ="+firstNumber); //20


		/*  2. 변수의 선언  */
		int val1; // 선언만 한것.
		int val2=10; // 선언과 동시에 초기화.
		//System.out.println("val1 ="+val1); // 에러. The local variable val1 may not have been initialized.
		System.out.println("val2 ="+val2); // 10
		
		//val1=val1+20; // 에러. 58줄과 같은 에러. 변수 초기화를 해줘야 한다.
		val1=0;
		val1=val1+20;
		val2=val2+20;
		System.out.println("val1 ="+val1); // 20
		System.out.println("val1 ="+val2); // 30

		int val3=val1+val2;
		System.out.println("val3 ="+val3); // 50
	}
}