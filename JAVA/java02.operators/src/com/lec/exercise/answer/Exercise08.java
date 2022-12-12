package com.lec.exercise.answer;
public class Exercise08 {
	public static void main(String[] args) {
		// %연산 수행한 결과값에 10 더하는 코드. 
		// NaN값 검사해 올바른 결과가 출력될수 잇도록해라.
		double x=5.0;
		double y=1.0;
		double z=x%y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌수없다.");
		}else {
			double result=z+10;
			System.out.println(result+5);
		}
	}
}
