package com.lec.ex03_enum;
import java.util.Calendar;

public class EnumMain {

	public static void main(String[] args) {
		// String str=new String("소향");
		// Week today=new Week(); // 열거타입이라 new해서 생성하지 못한다.
		
		// enum은 객체를 생성할 수 없다. (객체화, 인스턴스화 할수 없다.)
		// Week라는 열거타입을 선언했다면 열거타입을 호출해서 사용하는것이다.
		// 열거타입은 하나의 데이터타입(참조타입, 사용자가 정의한 새로운 데이터타입)이므로 변수로 선언하고 사용해야한다.
		// 열거타입변수를 선언했다면 열거상수를 저장하거나 사용할수있다. 
		// 열거상수는 단독으로 사용할 수 없고, "열거타입.열거상수"형태로 사용해야한다.
		// 즉, Week.MONDAY의 형태
		
		Week today=null;
		
		// 현재 요일 확인하기 - Calendar라는 클래스 이용해서 날짜 제어할 수 있다.
		Calendar cal=Calendar.getInstance(); // Calendar는 new연산자로 객체를 생성할 수 없고 getInstance()라는 메서드로 객체화(인스턴스화)시켜야한다.
		// cal.get(Calendar.DAY_OF_WEEK); // 현재 요일 가져온다.
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week); // 1이 선데이 ~~ 7이 세터데이

		switch(week) {
		case 1: today=Week.SUNDAY; break;
		case 2: today=Week.MONDAY; break;
		case 3: today=Week.TUESDAY; break;
		case 4: today=Week.WEDNESDAY; break;
		case 5: today=Week.THURSDAY; break;
		case 6: today=Week.FRIDAY; break;
		case 7: today=Week.SATURDAY;
		}
		System.out.println("오늘은 "+today+"입니다");


		// 예를들어 사원테이블에 주민번호를 읽기
		int gender=1; // ssn의 7번째 값 추출
		if(gender==1 || gender==3) {System.out.println("사원의 성별은 "+Gender.남자+"입니다.");}
		else System.out.println("사원의 성별은 "+Gender.여자+"입니다.");
	}
}