package com.lec.ex02_switch;
public class SwitchMain {
	public static void main(String[] args) {
		int dice=(int)(Math.random()*6)+1;
		
		switch(dice) {
		// break;를 안쓰면 만약에 case1로 들어갓을 경우 1부터 6까지 전부 출력한다. case1에 맞으면 1들어갔다가 break로 빠져나올수있게한다.
		case 1:
			System.out.println("1번"); break;
		case 2:
			System.out.println("2번"); break;
		case 3:
			System.out.println("3번"); break;
		case 4:
			System.out.println("4번"); break;
		case 5:
			System.out.println("5번"); break;
		case 6:
			System.out.println("6번");
		}
	}
}
