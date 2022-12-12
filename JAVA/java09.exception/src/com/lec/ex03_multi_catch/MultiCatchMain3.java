package com.lec.ex03_multi_catch;

public class MultiCatchMain3 {

	public static void main(String[] args) {
		try {
			String data1=args[0];
			String data2=args[1];
			int val1=Integer.parseInt(data1);
			int val2=Integer.parseInt(data2);
			int result= val1+val2;

		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행할 매개변수가 부족하거나 숫자로 변환이 불가능하거나~.");

		}finally {
			System.out.println("프로그램 종료");
		}
	}
}