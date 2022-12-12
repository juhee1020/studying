package com.lec.ex03_for;

public class ForFloatMain {

	public static void main(String[] args) {
		/* for문을 사용할 때 초기화식에서 변수를 선언할 때
		부동소수점타입(실수)을 사용하지 말것.
		*/
		for(float f=0.1f;f<=1.0; f+=0.1f) {
			System.out.println(f);
			//상기결과는 9번만 실행된다. 
			// 0.1은 float타입으로 정확하게 표현할 수 없기 때문에 실제값 0.1보다 약간 큰 값을 처리한다.
				/* 출력 결과값. ▼
						0.1
						0.2
						0.3
						0.4
						0.5
						0.6
						0.70000005
						0.8000001
						0.9000001
				 */
		}
	}
}
