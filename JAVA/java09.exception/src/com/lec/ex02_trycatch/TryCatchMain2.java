package com.lec.ex02_trycatch;
public class TryCatchMain2 {
	public static void main(String[] args) {

		// 실행예외
		String data1=null;
		String data2=null;

		//data1=args[0]; // 실행할 때 예외가 발생.-(에러체크안됨(빨간줄안뜸))
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		at com.lec.ex02_trycatch.TryCatchMain2.main(TryCatchMain2.java:9)
		*/

		// 예외  떠넘길수 없으니 무조건 trycatch문 써줘야한다.

		try {data1=args[0];}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행할 매개변수가 부족합니다.");
			e.printStackTrace();
			System.out.println(e.getMessage()); // Index 0 out of bounds for length 0
			return; // 프로그램을 끝내라.
		}
		// catch문에 return; 적어주면! 아래로 안내려온다!
		System.out.println();
		System.out.println(data1+","+data2); // null,null // 아래 하고나면 홍길동,null
		
		// Run > Coverage Configurations > Arguments > Program Arguments에 홍길동 900살 적어라.
		
		try {
			int val1=Integer.parseInt(data1);
			int val2=Integer.parseInt(data2);
			int result= val1+val2;
			System.out.println("더하기결과:"+result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
			System.out.println(e.getMessage()); // For input string: "홍길동"
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}
}