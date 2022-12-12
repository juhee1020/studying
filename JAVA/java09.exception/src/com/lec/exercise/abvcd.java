package com.lec.exercise;
import java.util.*;

public class abvcd {
	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		Scanner scanner=new Scanner(System.in);
		do {
			try {
				count++;
				System.out.println("1~100 사이 값을 입력해라.");
			
				input=new Scanner(System.in).nextInt();

				
				if(answer>input) {
					System.out.println("더 큰수 입력해라.");
				}else if(answer<input){
					System.out.println("더 작은수 입력해라.");
				}else {
					System.out.println("딩동댕동");
					System.out.println("시도횟수는 "+count+"번 입니다.");
					break;
				}
			}
			catch(InputMismatchException e){
				System.out.println("정수만 입력가능.");
				}
		}while(true); // 무한반복문
	}// end of main
}// end of class HighLow