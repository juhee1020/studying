package com.lec.ex15_final;
/*
	final필드와 static final(상수) 필드
	
	1. final 필드
		
		final이라는 의미는 final필드는 초기값이 지정되면 더이상 수정할 수 없는 것.
		final필드를 초기화하는 방법은 두가지. > 아래 적음.
			1) 필드 선언시에 초기값 부여 / 2) 생성자 통해서 객체를 생성할 때 final필드에 초기값 부여

		단순값이라면 필드선언시에 부여하는 것이 가장 간단한 방법이지만 
		복잡한 초기화 코드가 필요하거나 객체 생성시에 외부데이터로 초기화해야할 경우 생성자에서 객체가 생성될 때 초기값을 부여한다.
		
		생성자는 final필드를 초기화해야 하는데 만약 초기화 되지 않는 final필드가 있다면 문법에러가 발생한다.



	2. static final 필드
	
		일반적으로 불변의 상수값을 상수라고 한다. 불변의 값은 수학에서 자주 사용하는 원주율의 pi값 or 지구의 둘레, 무게등이 해당되는 값이다.
		
		이런 불변의 값을 저장하는 필드를 Java에서는 상수(constant)라고 한다. 
		final필드는 한번 초기화가 되면 수정할 수 없는 필드이지만 상수라고 하지는 않는다.
		왜냐면 불변의 값은 객체마다 저장할 필요가 없는 공통으로 사용되는 값으로 여러가지 값으로 초기화 될수 없기 때문이다.
		
		final필드는 객체마다 저장되고 생성자의 매개값을 통해서 여러가지 값을 객체별로 독립적으로 가질 수 있기 때문에 상수가 될 수 없다.
		
		그래서 Java에서는 상수는 final이면서 static으로 선언된다. 
		(static : 정적맴버이기 때문에 객체마다 저장되지 않고 클래스에 포함된다.
				그리고 한번, 초기화가 되면 그 이후에는 더이상 수정할 수 없다.)
*/
public class KoreanMain {
	public static void main(String[] args) {
		Korean kor1=new Korean("소향","911231-2222222");
		Korean kor2=new Korean("메시","888888-111111");
		Korean kor3=new Korean("흥민","999999-111111");
		
		System.out.println("kor1의 국적: "+kor1.NATION);
		System.out.println("kor2의 국적: "+kor2.NATION);
		System.out.println("kor3의 국적: "+kor3.NATION);
		System.out.println();
		
		// kor2.nation="태국"; // 요렇게 하면 kor1,2,3의 nation이 모두 태국으로 바뀐다. final써줘도 못바꾸게 해줬다.(상수)
		// kor1.ssn="901010=111111"; // 수정불가
	}
}


class Korean{
	static final String NATION = "대한민국"; // 얘가 첫번째 초기화 방법.
	String name;
	 final String ssn; // final은 초기화를 해줘야한다.
	 
	 // public Korean(){} // final필드가 있는 경우 그 필드가 초기화되지않았을 경우 기본생성자정의는 정의불가.
	 public Korean(String name, String ssn) { // 얘가 두번째 초기화 방법.
		 this.name=name;
		 this.ssn=ssn;
	 }
}