package com.lec.ex01_string;
/*
	1. 데이터타입 분류
		1) 기본타입 (primitive type)
			정수(바이트, 쇼트, 차, 인트, 롱)


		2) 참조타입 (레퍼런스 타임)
			객체가 저장되어 있는 메모리의 주소를 참조하는 타입으로 Array(배열), Enum(열거), Class, Interface(인터페이스)가 있다.


		3) 기본타입 vs 참조타입
			기본타입은 실제로 값을 변수에 저장하는 반면에 참조타입은 객체가 저장되어 있는 메모리의 주소를 저장하고 있는 데이터타입이다.

			Java는 문자열을 String이라는 참조변수(타입?)(class)변수에 저장하기 때문에 String변수의 타입을 선언해야한다.
			실제로는 문자열을 String변수(아래코드에서 str1, str2 얘네들 의미함)에 저장한다는 말은 틀린 말이다.
			문자열이 직접 변수에 저장되는 것이 아니라 문자열을 String 객체가 생성될 때 그 객체가 Heap 메모리영역에 생성되고
			String변수는 String객체가 저장되어 있는 힙영역의 메모리주소를 참조한다.

			Java는 문자리터럴이 동일하다면 String리터럴을 공유하도록 설계되어 있다.
			일반적으로 변수에 문자를 저장할 경우에는 문자열리터럴을 사용하지만 
			객체 생성연산자인 new를 사용해서 직접 String에 객체를 생성할 수 있다.

			new연산자는 힙영역에 새로운 객체를 생성하는 연산자로 "객체생성연산자"라고 한다.



	2. 메모리 사용 영역

		1) Stack(스택) 영역
			선언된 변수가 저장되는 메모리영역을 말한다.


		2) Heap(힙) 영역
			힙영역은 객체와 배열등이 생성(저장)되는 메모리 영역이다. 
			힙영역에 생성된 객체와 배열은 스택영역의 변수나 다른 ㄱ낵체의 필드에서 참조한다.
			참조하는 변수나 필드가 없다면 의미가 없는 쓰레기 객체가 되기 때문에 이런 객체를 쓰레기(garbage)로 취급되고
			JVM의 쓰레기수집기(gc, garbage collector)를 실행시켜서 객체를 힙영역에서 자동으로 제거한다.

			JVM이 자동으로 삭제해 주기 때문에 개발자는 별도의 코드를 작성할 필요가 없다.


		3) Method(메서드) 영역
			코드에서 사용되는 클래스파일(~.class)들은 JVM의 클래스로더(class loader)가 읽어서
			상수, 필드, 메서드, 생성자 등을 구분해서 메서드 영역에 저장해 둔다. 
			이 영역은 모든 스레드(프로그램)가 공유하는 영역이다.


		4) Constant(Literal) 영역  (사람에 따라 구분을 안하기도 한다더라.)
			literal이 저장되는 영역이다.

*/
public class ReferenceTypeMain {
	public static void main(String[] args) {
		
		int val=100; // 기본타입 : 값을 저장 
		
		String str1="홍길동";						// 리터럴 C.P영역
		String str2="홍길동";						// 리터럴 C.P영역(str2의 리터럴은 str1의 리터럴과 동일값)
		String str3=new String("홍길동");			// 객체 - 힙영역
		String apt32=new String("삼성레미안32평");  // 
		String apt40=new String("프루지오40평");
		apt32=null; // apt32 변수는 더이상 참조하는 객체(삼성레미안32평)가 없기 때문에 그 객체는 쓰레기가 된다.
		
		ReferenceTypeMain rf=new ReferenceTypeMain(); 
		// ReferenceTypeMain는 클래스이기 때문에 참조타입
		// ReferenceTypeMain() : 생성자 - 클래스이름과 동일한 이름을 가진 메서드를 생성자라고 한다.
		
		int i1=100;
		String person1="소향";
		String person2="소향";
		String person3=new String("소향");
		String person4=new String("소향");
		
		System.out.println(person1==person2); // 트루 - 리터럴값을 비교 -> true
		System.out.println(person1==person3); // 펄스 - 값과 참조하는 메모리 주소를 비교 -> false
		System.out.println(person1==person4); // 펄스 - 값과 참조하는 메모리 주소를 비교 -> false
		System.out.println(person3==person4); // 펄스 - 서로 다른 객체의 참조주소를 비교 -> false

		System.out.println("--------------------");

		// 순수하게  == (동등연산자)를 사용하면 안되고
		System.out.println(person1.equals(person2)); // 트루 아래 세개도 트루
		System.out.println(person1.equals(person3));
		System.out.println(person1.equals(person4));
		System.out.println(person3.equals(person4));

		System.out.println("--------------------");

		// 객체의 메모리 주소 확인
		System.out.println(person1.hashCode()); // person1,2,3,4는 모두 1590681
		// 부모가 hashCode / toString이란 메서드 잇으니 String이나 ReferenceTypeMain도 상속받아 쓸 수 있다?
		// hashCode는 기능이 있는데(메모리주소확인) 근데 스트링이란 놈이 해시코드를 재정의(수정)했다. -(기능다름?)
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		System.out.println(person4.hashCode());
		System.out.println(rf.hashCode()); // 1651191114

		// ▼ 메서드
		// replace()메서드 :  기존 문자열은 그대로 두고 대체한 새로운 문자열을 리턴. 
		//이뮤터블?
		// substring() 메서드 : 문자여렝서 특정 위치 문자열을 잘라내 가져오고싶으면~
		// split() : 분자열 분리
	}
}