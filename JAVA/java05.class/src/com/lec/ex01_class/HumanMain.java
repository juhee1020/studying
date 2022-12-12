package com.lec.ex01_class;

// b. 여기에서 뉴 연산자 통해서 휴먼이란 객체 만들것.
public class HumanMain {

	public static void main(String[] args) {
		//Human이란 참조타입은 임포트 필요없이 바로 사용할 수 있다. (같은 패키지에 있어서)
		// 참조타입 : 클래스, 이넘, 
		String str1= new String("소향");
		String str2= new String("소향");

		Human hong=new Human(); // new Human() <-- 생성자
		Human kim=new Human();
		Human park=new Human();

		// hong. 해보면 휴먼의 상위가 오브젝트인걸 볼 수 있다. (기능들만 있다.(메서드들))




		// 1. 속성
		Human adam=new Human();
		adam.name="아담"; // 이름 부여
		adam.gender="남자";
		adam.age=10000;
		System.out.println(adam.name);System.out.println(adam.gender);System.out.println(adam.age);
		System.out.println("--------------------");

		Human eve=new Human();
		eve.name="이브";
		eve.gender="여자";
		eve.age=9999;
		System.out.println(eve.name);System.out.println(eve.gender);System.out.println(eve.age);
		System.out.println("--------------------");




		// 2. 생성자 : 기본생성자 vs 기본생성자 외
		String s1=new String(); // 매개변수가 없음 ▼
		System.out.println("s1="+s1); // s1= 뒤로 안뜬다.
		
		String s2=new String("소향"); // 매개변수 줬더니 ▼
		System.out.println("s2="+s2); // 소향 뜬다.
		System.out.println("--------------------");
		
		Human sonny=new Human("손흥민"); // 여기서 전달해주더라도 Human 16줄에 들어가더라도 거기보면 지역변수라서 아래에 null이 뜬다. (휴먼 고쳐줘서 이제 뜸.)
		System.out.println(sonny.name); // 여기서의 sonny.name은 속성 / 
		// System.out.println(sonny.gender); // null
		// System.out.println(sonny.age); // 0
		System.out.println("--------------------");
		
		Human kangin=new Human("이강인","남자",21);
		System.out.println(kangin.name+", "+kangin.gender+", "+kangin.age);
		// 실습1. 강인의 이름과 성별, 나이 출력
		Human minjae=new Human("김민재","남자",26);
		System.out.println(minjae.name+", "+minjae.gender+", "+minjae.age);
		// 실습2. 김민재의 이름과 성별 나이 출력 (동일생성자 호출)
		Human messi=new Human("메시",35,"남자");
		System.out.println(messi.name+", "+messi.gender+", "+messi.age); // this.age=10;라고 해줬기 때문에 나이가 걍 10이 뜬다.
		// 실습3. 메시의 이름, 나이, 성별 순서의 생성자 호출
		System.out.println("--------------------");




		// 3. 메서드
		minjae.move(); // Human.java의 void move(){}; 호출
		kangin.move(kangin.name); // void move(String name){} 호출
	}
}
