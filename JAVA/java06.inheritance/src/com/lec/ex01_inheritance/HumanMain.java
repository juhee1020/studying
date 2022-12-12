package com.lec.ex01_inheritance;
public class HumanMain {
	public static void main(String[] args) {
		Human maple= new Human();
		System.out.println(maple.toString()); // 아직 값은 안넣었으니 Human [name=null, gender=null, age=0]
		
		Adam adam=new Adam();
		adam.name="아담";
		adam.gender="남자";
		adam.age=20;
		adam.move(); // 부산으로 떠납니다.
		adam.speak(); // 한국말을 한다.
		System.out.println(adam); // 요렇게만 적어도 .toString()꺼 가져온다?
		// Adam [name=아담, gender=남자, age=20]
		System.out.println();
		
		
		Eve eve=new Eve();
		eve.name="이브";
		eve.gender="여자";
		eve.age=30;
		eve.move();
		eve.makeBaby();
		System.out.println(eve);
		System.out.println();
		
		
		Korean juju=new Korean();
		System.out.println(juju.toString());
		System.out.println();
		
		
		American king=new American();
		king.name="킹 아서";
		king.move();
		king.speak();
		System.out.println(king.toString());
	}
}