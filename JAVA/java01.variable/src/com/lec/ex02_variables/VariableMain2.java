package com.lec.ex02_variables;

public class VariableMain2 {
	public static void main(String[] args) {
	//1. 변수의 선언
		int val1=10;
		int val2=20;
		System.out.println("val1="+val1+", val2="+val2); // val1=10, val2=20

	//2. 변수의 동시선언
		int a,b,c;
		int x=10, z=20, y=30;
		System.out.println("x="+x+", z ="+z+", y="+y);

	//3. 변수선언과 변수타입(기본타입, primitive type)
		//1) 정수 : byte-1바이트, short-2바이트, char-2바이트, int-4바이트, long-8바이트

			// a. BYTE
			byte b1=-128; byte b2=127;
			System.out.println("b1="+b1+", b2 ="+b2);
			// b1=-129; // 에러 : 표현할 수 있는 값의 범위를 초과
			// b2=128; // 에러(윗줄과같은에러) : Type mismatch:cannot convert from int to byte
			// 129 : 기본이 int.     129.0 : 기본이 double
			b1=(byte)-129;
			System.out.println("b1="+b1); // 127로 나온다.
			b1=(byte)128;
			System.out.println("b1="+b1); // -128 (숫자가 짤린것?)


			// b. char : 한개의 문자(내부적으로는 유니코드값(UTF-8문자셋의 코드정수값)으로 저장.)
					// : 작은 따옴표로 선언
			char chr1='A'; // A는 내부적으로 65라는 정수값으로 저장.
			System.out.println("chr1="+chr1); // A. A~Z : 65~90
			char chr2=65; System.out.println("chr2="+chr2); // A
			char chr3=65+1; System.out.println("chr3="+chr3); // B
			char chr4=97; System.out.println("chr4="+chr4); // a. 97~122
			char chr5=48; System.out.println("chr5="+chr5); // 0
			char chr6=44032; System.out.println("chr6="+chr6); // 가. 가~핳 : 48~57


			// c. int
			int int1='Z'; System.out.println("ini1="+int1); // 90
			int int2='핳'; System.out.println("ini2="+int2); // 54643
			int int3=-2147483648; 
			// int int4=-2147483649; // 범위에러
			int int5=2147483647; 
			// int int6=2147483648; // 범위에러


			//d. long
			//long long1=-2147483649; 
			// ▲ 에러. 자바에서 숫자의 기본 데이터타입은 인트타입이라서! 
			// ▲ (The literal 2147483649 of type int is out of range)
			long long2=-2147483649l; // 정수를 long으로 선언하기 위해서 l 혹은 L로 정의


			//e. short
		short sh1; // -2의 15제곱 ~ 2의 15제곱-1 범위
		
		// 2) 실수 : float-4바이트, double-8바이트
				// Java에서는 정수타입의 기본형은 int타입이지만 실수타입의 기본형은 double타입.
				// float로 선언할 경우는 명시적으로 float임을 선언하거나 데이터타입변경(형변환)을 해야한다.

			//a. float
			float f1=3.14f; // f or F는 명시적으로 실수타입의 값을 float타입으로 선언
			System.out.println("f1="+f1);
			// b. double
			double db1=3.141592;
			System.out.println("db1="+db1);
			// float f3=3.141592; // 에러. 플로트인데 더블로 선언되어있다. 강제형변환해주거나 타입변경해야한다.


		//3) 논리 : 불린 1바이트 - 트루, 펄스 내부적으로는 트루는 1 펄스는 0 값을 가지고 있다. (정수타입)
			boolean bool1=true;
			boolean bool2=false;
			// boolean bool3=1; // 타입미스매치. 캔낫 컨버트 프롬 인트 투 불린
	}
}
