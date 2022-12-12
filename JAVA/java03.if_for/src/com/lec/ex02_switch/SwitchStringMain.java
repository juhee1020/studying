package com.lec.ex02_switch;
public class SwitchStringMain {
	public static void main(String[] args) {
		// Java6까지는 switch(조건)의 조건에는 정수타입(byte~long)만 가능했지만 이후 버전부터는 문자열(String)도 가능하게 되었다.
		
		String position="부장";
		switch(position) {
		case "과장":
			System.out.println("보너스 지급은 없습니다."); break;
		case "부장":
			System.out.println("보너스 지급 10만원."); break;
		default:
			System.out.println("보너스 지급 100만원.");
		}
	}
}
