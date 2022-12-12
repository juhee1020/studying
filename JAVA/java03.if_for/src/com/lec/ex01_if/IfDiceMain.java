package com.lec.ex01_if;

public class IfDiceMain {

	public static void main(String[] args) {
		//실습. 주사위 던지기 : Math.random()
		// 1~6까지 난수 발생시키고 1번 나왔습니다~6번
		int dice=(int)(Math.random()*6)+1;
		/*  //▼얘는 2줄 출력된다.
		if(dice==1) {System.out.println("1번");}
		if(dice==2) {System.out.println("2번");}
		if(dice==3) {System.out.println("3번");}
		if(dice==4) {System.out.println("4번");}
		if(dice==5) {System.out.println("5번");}
		else {System.out.println("6번");}
		*/
		if(dice==1) {System.out.println("1번");}
		else if(dice==2) {System.out.println("2번");}
		else if(dice==3) {System.out.println("3번");}
		else if(dice==4) {System.out.println("4번");}
		else if(dice==5) {System.out.println("5번");}
		else {System.out.println("6번");}
	}
}
