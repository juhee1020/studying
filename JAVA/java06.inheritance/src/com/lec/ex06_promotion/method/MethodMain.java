package com.lec.ex06_promotion.method;
public class MethodMain {
	public static void main(String[] args) {
		Child child=new Child();
		child.method1(); // Parent.method1() 호출
		child.method2(); // Child.method3() 호출
		child.method3(); // Child.method3() 호출
		System.out.println();



		//1. 자동형변환후에는? > 자식객체 -> 부모객체로 형변환
		Parent parent=child; // 형변환
		parent.method1(); // Parent.method1() 호출
		parent.method2(); // Child.method3() 호출 // 자식객체에서 재정의가 되었기 때문에 메서드 즉,child.method2가 호출된다.
		//parent.method3(); // 에러 자식객체에서 새롭게 추가된 메서드이기 때문에 부모객체로 타입변환시에 삭제(짤린다.
		System.out.println();



		//2. 형변환이 되었을 경우에 parent와 child가 동일타입인지 여부
		System.out.println(parent==child); // true : child에서 형변환이 되엇기 때문에 동일타입.
		System.out.println(parent.equals(child)); // true
		System.out.println();
		
		Parent p1=new Parent();
		System.out.println(p1==child); // false
		System.out.println(p1.equals(child)); // false
		System.out.println();
		
		System.out.println(parent.getClass()); System.out.println(child.getClass()); //class com.lec.ex06_promotion.method.Child
		System.out.println(p1.getClass()); //class com.lec.ex06_promotion.method.Parent
	}
}