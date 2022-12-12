package com.lec.ex05_bounded;
/*
	제한된 파라미터      <T extends 상위타입>
	
	타입파라미터에 지정되는 구체적인 타입을 제한할 필요가 종종 있다.
	예를들어 숫자를 연산하는 제네릭 메소드는 매개값으로 Number타입 
	또는 하위 클래스 타입(Byte, Short, Integer, Long, Double)의 인스턴스만 가져야한다.
	이것이 제한된 파라미터(bounded type parameter)가 필요한 이유이다.
	제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 
	extends 키워드를 붙이고 상위 타입을 명시하면 된다.
	상위 타입은 클래스 뿐 아니라 인터페이스도 가능하다. 인터페이스라고해서 implements 사용하진않는다.
	
	public <T extends 상위타입> 리턴타입 메소드(매개변수,...){...}
	
	타입 파라미터에 지정되는 구체적인 타입은 
	상위타입이거나 상위타입을 상속 또는 구현한 하위클래스, 하위클래스만 전달이 가능.
*/
public class BoundedMain {
	public static void main(String[] args) {
		/*숫자비교 result=new 숫자비교();
		int abc=result.compare(100.4, 10.4);*/
		int abc=숫자비교.compare(50.1,3.14);
		System.out.println(abc);
		
		abc=숫자비교.compare(60.4, 100.1);
		System.out.println(abc);
		
		int result = 숫자비교.compare(-10.5, 1);
		System.out.println(result);
		
		result = 숫자비교.compare(15f, 15D);
		System.out.println(result);
		
		result = 숫자비교.compare(15f, 10.5);
		System.out.println(result);
		
		
		
		// abc=숫자비교.compare("1",3); // 에러
		// 아래에서 number와 하위타입만 대입하도록 제한했기때문
	}
}

class 숫자비교{
	public static <T extends Number> int compare(T t1, T t2) {
		double d1=t1.doubleValue();
		double d2=t2.doubleValue();
		return Double.compare(d1, d2);
	}
}