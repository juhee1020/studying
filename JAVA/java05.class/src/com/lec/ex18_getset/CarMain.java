package com.lec.ex18_getset;
public class CarMain {
	public static void main(String[] args) {
		Car car=new Car();
		
		// car.speed=900;
		// car.stop=true;
		// 자율주동차인데 해커가 속도를 900키로로 설정하고 멈췄다 > 큰일남 > Car에서 접근 못하게 프라이빗으로 해주자!!
		// > 그럼 이제 위에 두줄이 에러가 뜬다. 주석처리
		
		car.스피드(1000); // 가능!
		System.out.println("지금 자동차 : "+car.toString());
		// System.out.println("지금 자동차 : "+car.speed); // 에러라서 > public int 현재속도() {return this.speed;} (메서드)를 Car에 추가
		System.out.println("지금 자동차 : "+car.현재속도());
	}
}