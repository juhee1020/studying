package code_study;
/*
문제 설명
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
str에 나타나는 숫자 중 최소값과 최대값을 찾아 
이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, 
solution을 완성하세요.

예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, 
"-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
*/
public class Solution5 {
	public String solution(String s) {
		String answer1 = ""; String answer2="";
		String[] array=s.split(" ");
		answer1=array[0]; answer2=array[0];
		for(int i=0; i<array.length; i++) {
			if(Integer.parseInt(answer1)>Integer.parseInt(array[i])) {
				answer1=array[i];
			}
		}
		for(int i=0; i<array.length; i++) {
			if(Integer.parseInt(answer2)<Integer.parseInt(array[i])) {
				answer2=array[i];
			}
		}
		return answer1+" "+answer2;
	}
}
