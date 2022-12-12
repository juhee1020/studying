package com.lec.ex01_class;
// a. 얘가 설계도
public class Human {
	
	//1. 속성(필드라고도 얘기한다.)
	String name;
	String gender;
	int age;


	//2. 생성자 - 클래스 이름과 동일한게 생성자. / 앞에 아무것도 없는 애가 기본 생성자?
	// 기본생성자는 생략이 가능하다.
	Human(){}; // 얘가 기본생성자.  //void human() {} // 얜 메서드라 리턴타입 줘야함.
	// Human(String name){} // 얘는 기본생성자가 아니다.
	// ▲ String name : 지역변수이기 때문에 위의 String name과는 다른놈이다. 얘 잇으면 HumanMain에 에러 뜬다.
	Human(String xxx){
		// System.out.println("객체의 이름은 "+ xxx);
		this.name=xxx;
		} // 기본생성자외
	Human(String name, String gender){
		this.name=name; this.gender=gender;
	}
	Human(String name, String gender, int age){
		this.name=name; this.gender=gender; this.age=age;
	}
	Human(String name, int age, String gender){
		this.name=name; this.gender=gender; this.age=10;
	}
	// 기본 생성자 이외에 생성자가 정의되 있다면 기본생성자도 정의해줘야한다?
	// 매개변수개수,타입,순서 다르면 다른 생성자로 인식하여 복수로 정의할 수 있다.
	// 매개변수개수,타입,순서 같으면 에러 뜬다.



	//3. 메서드(기능) - 리턴타입 정해줘야하는데 없으면 void
	void move(){System.out.println(this.name+"가(이) 움직이고 있습니다.");};
	void move(String name){System.out.println(name+"가(이) 움직인다.");};
	void think(){System.out.println(this.name+"가(이) 생각하고 있습니다.");};
	void think(String name){System.out.println(name+"가(이) 생각합니다.");};
	void speak(){System.out.println(this.name+"가(이) 말하고 있습니다.");};
	void speak(String name){System.out.println(name+"가(이) 말합니다.");};
	void eat(){System.out.println(this.name+"가(이) 먹고 있습니다.");};
	void eat(String name){System.out.println(name+"가(이) 먹는다.");};
}
