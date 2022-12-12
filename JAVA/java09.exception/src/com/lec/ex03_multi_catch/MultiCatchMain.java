package com.lec.ex03_multi_catch;

public class MultiCatchMain {

	public static void main(String[] args) {
		try {
			String data1=args[0];
			String data2=args[1];
			int val1=Integer.parseInt(data1);
			int val2=Integer.parseInt(data2);
			int result= val1+val2;

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행할 매개변수가 부족합니다.");

		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가");

		}finally {
			System.out.println("프로그램 종료");
		}
		
		// args에 값 넣기 전 : 실행할 매개변수가 부족합니다.
		// args에(run에 들어가서 ~~) 홍길동 900살 추가 : 숫자로 변환 불가
	}
}