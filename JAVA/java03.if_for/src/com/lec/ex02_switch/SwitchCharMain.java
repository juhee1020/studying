package com.lec.ex02_switch;
public class SwitchCharMain {
	public static void main(String[] args) {
		char grade='a';
		
		switch(grade) {
		case 'a': 
		case 'A': // or 조건일 경우 연달아서 case를 써준다.
			System.out.println("A등급입니다.");
			break;
		case 'b':
		case 'B':
			System.out.println("B등급입니다.");
			break;
		default:
			System.out.println("등급외 입니다.");
		}
	}
}
