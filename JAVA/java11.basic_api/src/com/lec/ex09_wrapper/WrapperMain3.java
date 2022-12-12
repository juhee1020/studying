package com.lec.ex09_wrapper;
public class WrapperMain3 {
	public static void main(String[] args) {
/*
	포장객체비교
	포장객체는 내부값을 비교하기 위해 동등연산사(==,!=)를 사용할 수 없다.
	동등연산자는 내부의 값으로 비교하는 것이 아니라 포장객체의 참조주소를 비교하기 때문.
*/
		// -128~127 범위의 값과 초과한 값의 비교결과가 다르다.
		Integer obj1=300;
		Integer obj2=300;
		System.out.println(obj1==obj2);
		System.out.println(obj1.hashCode()+" : "+obj2.hashCode());
		System.out.println();
		
		// 내부의 값만 비교하려면 언박싱한 값을 비교해야한다.
		System.out.println("[-128~127 초과한 값일 경우]");
		System.out.println("== 비교결과 : "+(obj1==obj2));
		System.out.println("언박싱 후 == 비교결과 : "+(obj1.intValue()==obj2.intValue()));
		System.out.println("equals()메서드의 결과 : "+obj1.equals(obj2));
		System.out.println();
		obj1=100; obj2=100;
		System.out.println("[-128~127 이내의 값일 경우]");
		System.out.println("== 비교결과 : "+(obj1==obj2));
		System.out.println("언박싱 후 == 비교결과 : "+(obj1.intValue()==obj2.intValue()));
		System.out.println("equals()메서드의 결과 : "+obj1.equals(obj2));
	}
}