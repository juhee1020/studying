package com.lec.ex04_class;
/*
	Class 클래스
	
	1. Class객체얻기( Class.forName(String str), Object.getClass(클래스이름) )

		프로그램에서 Class객체를 얻기 위한 방법
		1) Object클래스의 getClass()메서드와
		2) Class클래스의 forName()메서드를 이용한다.

		Object는 모든 클래스의 최상위 클래스이므로 모든 클래스에 getClass()를 호출할 수 있다.
		getClass()메서드는 해당 클래스의 객체가 생성되어 있을때에만 사용할 수 있지만
		객체가 생성되어있지않다면 class객체를 얻을수가 없다.

		Class의 생성자는 private로 선언되어 있기 때문에 new객체 생성연산자로 객체를 만들수가 없고
		정적인 메서드 forName()을 이용해서 클래스 정보를 얻을 수 있다.

		forName()메서드는 클래스전체이름 즉, 패키지까지 포함된 전체이름을 매개값으로 전달받아서
		해당 클래스의 객체를 생성한 후에 그 객체를 리턴한다.

		Class.forName()메서드는 매개값으로 주어진 클래스를 찾지못하면 
		ClassNotFoundException 예외를 발생시키기 때문에 예외처리가 필요하다.


	2. Class정보얻기 ( Reflection )
	
		getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethods() 등의 매서드를 이용해서
		해당 클래스의 생성자, 필드, 메서드에 대한 정보를 알 수 있다.
		이것을 리플렉션(Reflection)이라고 한다.


	3. 동적으로 객체를 생성( newinstance())

		Class객체를 이용하면 new연산자를 사용하지않아도 동적으로 객체를 생성할 수 있다.
		이 방법은 코드 작성시에 클래스의 이름을 결정할 수 없고,
		런타임시에 클래스이름이 결정되는 경우에 매우 유용하게사용된다.
*/
public class ClassMain {
	public static void main(String[] args) {	
		//1. 객체를 생성하는 방법
			// a.new 객체생성연산자로 생성하기 /  b. getClass() /  c. forName()
			
			// a.
		Car car1=new Car();
		System.out.println(car1.getClass()+"\n");
		// class com.lec.ex04_class.Car
		
			// b.
		Class car2=car1.getClass();
		System.out.println(car2.getClass()); // class java.lang.Class
		System.out.println(car2.getName()); // com.lec.ex04_class.Car
		System.out.println(car2.getSimpleName()); // Car
		System.out.println(car2.getPackage()); // package com.lec.ex04_class
		System.out.println(car2.getPackage().getName()+"\n"); // com.lec.ex04_class
		
		try {
			Class car3=Class.forName("com.lec.ex04_class.Car");
			System.out.println(car3.getClass());
			System.out.println(car3.getName());
			System.out.println(car3.getSimpleName());
			System.out.println(car3.getPackage());
			System.out.println(car3.getPackage().getName());
		}catch(ClassNotFoundException e) { // 클래스를 발생시키지 못했으면 발생시키는 예외
			e.printStackTrace();
		}
		
		// Class<?extends Car>car2=car1.getClass(); // 클래스 얻는 방법 <- ?
	}
}

class Car{
	String model="포르쉐";
	int speed;
}