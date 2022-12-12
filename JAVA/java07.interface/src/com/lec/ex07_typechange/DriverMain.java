package com.lec.ex07_typechange;

public class DriverMain {
	public static void main(String[] args) {
		Vechicle vechicle=new Bus();
		vechicle.run();
		System.out.println();
		// vechicle.checkFare(); // Bus 클래스에서 추가한 checkFare는 짤려서 에러!
		Bus bus=(Bus)vechicle; // 강제로 형변환 시켜준다!
		bus.run();
		bus.checkFare(); // 가능하다! (안짤림)
	}
}