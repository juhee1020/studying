package com.lec.ex18_getset;

public class Car {
	private int speed;
	private boolean stop;
	
	public void 스피드(int x) {
		if(x>=110) {
			this.speed=60;
		}
		else {this.speed=x;}

	}

	public int 현재속도() {
		return this.speed;
	}
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}

} // 퍼블릭인 요 스피드를 이제 CarMain에서 가져다 쓰는것