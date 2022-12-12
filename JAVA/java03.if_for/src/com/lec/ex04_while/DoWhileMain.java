package com.lec.ex04_while;
import java.io.IOException;
import java.util.Scanner;
// java.lang에 잇는 클래스들은 굳이 import해오지않아도 된다. Math가 lang 안에 있다.

public class DoWhileMain {
	public static void main(String[] args) throws IOException {
		// 키보드로부터 문자열을 입력받는 방법중에 System.in.read()는
		// 한개의 키코드만 읽기 때문에 콘솔에 입력된 문자열을 한꺼번에 읽을수가 없다.
		//System.out.println("키보드를 입력하세요 ==>");
		//System.out.println(System.in.read()); // 자바버츄얼머신에 떠넘긴다.
		/*
		 	키보드를 입력하세요 ==>
			AAAAAAAAAAAAAAAAAAAA
			65 // 앞에 한글자만 읽는 모습을 볼 수 있다. 
		 */


		// 콘솔에 입력된 문자열을 한꺼번에 읽기 위해서는 
		// Scanner라는 (클래스 이용해 )객체를 생성하고 nextLine()메서드를 호출하면 콘솔에 입력된 문자열을 한번에 읽을수가 있다.
		// 강사님은 (클래스를 이용해 )를 안적음... 
		
		System.out.println("입력.");
		System.out.println("프로그램을 중단하려면 q를 입력.");
		
		Scanner scanner = new Scanner(System.in); // Scanner 사용하려면 임포트 해와야한다.
		// System.in 안적고 소괄호 비워두면 에러 > 매개변수 꼭 받아줘야한다.
		String name = null;

		do {
			System.out.println("==> ");
			name = scanner.nextLine();
			System.out.println("입력된 이름 = " + name);
		} while(!name.contentEquals("q"));
		System.out.println();
		System.out.println("프로그램종료!!");
	}
}
