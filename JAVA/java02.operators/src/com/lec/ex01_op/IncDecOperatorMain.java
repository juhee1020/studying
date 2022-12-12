package com.lec.ex01_op;
/*
	증감연산자 ++, --
		증감연산자는 변수의 값이 1씩 증가,감소시키는 연산자를 말한다.
		boolean타입을 제외한 모든 기본 데이터타입의 피연산자에 사용할 수 있다.
		증감연산자는 선언위치에 따라 전위,후위 증감연산로 구분이 된다.
		변수 앞에 정의된 것을 전위증감연산자, 변수 뒤에 선언된것을 후위 증감연산자라 한다.
		
		주의할점-다른 연산자와 함게 사용되는 연산식에서는 증감연산자의 위치에 따라 연산결과가 다르게 나오므로 주의해야한다.
			> 전위연산자 : 연산전 증감 / 후위연산자 : 연산후 증감
*/

public class IncDecOperatorMain {
	public static void main(String[] args) {
		int x=10, y=10, z;
		x++; // x=x+1;
		++x; // x=x+1;
		System.out.println("x의 값 : "+x);
		z=x++;
		System.out.println("z의 값 : "+z); // 12 / z에 x 저장하고나서 +1 증가.
		System.out.println("x의 값 : "+x); // 13
		System.out.println("---------------------------------");
		z=++x;
		System.out.println("z의 값 : "+z); // 14 / 연산전에 증가하므로 14
		System.out.println("x의 값 : "+x); // 14
		System.out.println("---------------------------------");
		z=++x + y--; // x는 연산전에 15되고 y는 연산때 10인데 연산되고나서 -1
		System.out.println("x의 값 : "+x); // 15
		System.out.println("y의 값 : "+y); // 9
		System.out.println("z의 값 : "+z); // 25
	}
}