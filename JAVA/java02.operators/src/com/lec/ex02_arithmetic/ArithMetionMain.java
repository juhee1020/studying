package com.lec.ex02_arithmetic;
/*
	산술연산자 (+,-,/,*,%)
	
	Java에서 산술연산자는 4칙연산자와 나머지연산자(%) 총 5가지의 연산자가 있다.
	이 연산자는 boolean타입을 제외한 모든 기본 타입에 사용할 수 있다.
	
	산술연산자의 특징은 피연산자들의 타입이 동일타입이 아닐 경우 피연산자들의 타입을 일치시킨 후 연산을 수행한다.
	
	1. 피연산자들이 모두 정수타입이고, int타입보다 크기가 작을 경우 
		모두 int로 타입변경 후에 연산을 수행한다. 
		따라서 연산결과의 타입은 int이다.
		(ex. byte+byte->int+int = 결과는 int타입이다.)
	2. 피연산자들이 모두 정수타입이고, long 타입이 있을 경우 모두 long으로 변환 후 연산 수행.
		(ex. int+long->long+long = 결과는 long타입.)
	3. 피연산자 중 실수타입(float, double)이 있을 경우 크기가 큰 실수 타입으로 변환 후 연산을 수행한다.
		(ex. int + double -> double+double = 결과는 double타입이다.)
		
	간단하게 정리하면 long타입을 제외한 정수타입 연산은 int타입으로 산출되고
	피연산자 중 하나라도 실수타입이 있다면 결과는 실수타입으로 산출된다.
	
	정수타입의 연산결과가 int타입으로 나오는 이유는 JVM이 기본적으로 32bit(4byte)단위로 연산하기 때문이다.
 */
public class ArithMetionMain {
	public static void main(String[] args) {
		byte byte1=1;
		byte byte2=1;
		// byte result=byte1+byte2; // 연산결과가 int타입이므로 에러.
		int result=byte1+byte2;
		System.out.println("result값은 : "+result);
		
		int int1=10;
		int int2=20;
		int result2=int1+int2; // 정수타입의 연산은 기본으로 int타입으로 수행한다.
		System.out.println("result2="+result2);
		
		double result3= int1/int2; // 정수 연산이 되고 실수로 저장된다.
		System.out.println("result3="+result3); // 0.0 정수로 연산이 되므로 0이 되고 나서 double타입이 된다.
		double result4= int1/(double)int2;
		System.out.println("result4="+result4); // 0.5 연산되는 애 중 하나라도 double이 있으면 다 double타입이 되고 나서 연산.
		double result5=int1*1.0/int2;
		System.out.println("result5="+result5); // 0.5
		double result6=int1/int2*1.0;
		System.out.println("result6="+result6); // 0.0
	}
}