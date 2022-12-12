package exercise;
import java.util.Scanner;
public class Exercise09 {

	public static void main(String[] args) {
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		int sum=0; int top=0; int abc=0;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo=scanner.nextInt();
			
			if(selectNo==1) {
				System.out.println("학생수 >");
				int std=scanner.nextInt(); studentNum+=std;
				scores=new int[std];
			}
			else if(selectNo==2) {
				System.out.println("점수입력 >");
				for(int i=0; i<scores.length; i++) {
					System.out.println("socres["+i+"] : ");
					scores[i]=scanner.nextInt();
				}
			}
			else if(selectNo==3) {
				System.out.println("점수리스트 >");
				for(int i=0; i<scores.length; i++) {
					System.out.println("socres["+i+"] : "+scores[i]);
				}
			}
			else if(selectNo==4) {
				System.out.println("분석 >");
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];
					if(scores[i]>top) {top=scores[i];}
				}
				System.out.println("최고점수 : " + top);
				System.out.println("평균점수 : " + sum/scores.length);
			}
			else if(selectNo==5) {
				run=false;
			}
		}System.out.println("프로그램 종료");
		scanner.close();
	}
}
