package com.lec.ex02_array;
// java.exe com.lec.ex02_array.StringArgMain.class 값1 값2 ... 값n
// 위에 값들이 아래 5줄에 Stirng[] <- 에 배열로 들어간다. (String이므로 위에 값들은 String타입이여야한다.)
public class StringArgMain {
	public static void main(String[] args) {
		System.out.println("전달되는 배열의 갯수 : "+args.length); // 5
		
		int sum=0;
		for(int i=0; i<args.length; i++) {
			sum+=Integer.parseInt(args[i]); // 배열안에 값들이 String타입이므로 int타입으로 바꿔줘야한다.
		}
		System.out.println("1,3,5,7,9의 합 : "+sum);
	}
}
// Run > Coverage Configurations > Arguments > Program Arguments에 1 3 5 7 9 적고 시스아웃 args.length