package exercise;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {
/*
	 while문과 Scanner를 이용해서 키보드로 부터 입력된 데이터로 예금, 출금, 조회, 종료기능을
	 제공하는 코드를 작성(예금잔액을 입출금내역을 출력)
	 WhileKeyControlMain.java를 참조해서 자유롭게 작성
					System.out.println("-------------------------------------");
					System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
					System.out.println("-------------------------------------");
					
					JOptionPan.showInputDialog() 이용해도 상관없음
*/
	public static void main(String[] args) throws IOException {
		boolean run=true;
		int keyCode=0;
		int count=0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
				System.out.println("-------------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
				System.out.println("-------------------------------------");
				System.out.println("1,2,3,4 중 택 1 : ");
			keyCode=scanner.nextInt();
			if(keyCode==1) {System.out.println("넣을돈 : \t"); int abc=scanner.nextInt(); count+=abc;}
			else if(keyCode==2) {System.out.println("뺄돈 : \t"); int abc=scanner.nextInt(); count-=abc;}
			else if(keyCode==3) {System.out.println("있는돈 : \t"+count);}
			else if (keyCode==4) run=false;
			}
		System.out.println("프로그램 종료");
		scanner.close();
	}	
	
}
