package com.lec.ex08_intanceof;
public class DriverMain {
	public static void main(String[] args) {
		Driver mammoth=new Driver();
		//mammoth.driver(new Bus()); 
			// Driver.java에서 이프문으로 돌리지 않으면 
			// Bus나 Taxi 중 하나만 가능하게 된다. (Drive.java 참고)
		//mammoth.driver(new Taxi());
		mammoth.driver(new 오토바이());
		mammoth.driver(new Bus());
		mammoth.driver(new Taxi());	
	}
}

class 오토바이 implements Vechicle{
	@Override
	public void run() {
		System.out.println("오토바이 타지마시오.");
	}
}