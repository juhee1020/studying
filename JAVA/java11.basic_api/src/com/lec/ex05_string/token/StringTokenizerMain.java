package com.lec.ex05_string.token;
import java.util.StringTokenizer;

/*
	StringTokenizer 클래스
	
	문자열이 특정 구분자로 연결되어 있을 경우, 구분자를 기준으로 부분 문자열을 분리하기 위해서는 
	String.split(re)메서드를 이용하거나, java.util패캐지의 StringTokenizer클래스를 이용할 수 있다.

	String.split(re)은 정규 표현식(re, Regular Expression)으로 구분하지만, 
	StringTokenizer는 문자(구분자)로 구분한다는 차이점이 있다.
	문자열이 한 종류의 구분자로 연결이 되어있을 경우에는
	StringTokenizer를 이용하면 쉽게 문자열(token)을 분리할 수 있다.
	
	StringTokenizer의 메서드
	1. countToken() : 현재 남아있는 token의 갯수를 int로 리턴
	2. hasMoreTokens() : 남아있는 token이 있는지 여부를 boolean으로 리턴
	3. nextToken() : token을 하나씩 꺼내는 메서드. String으로 리턴.
			--- nextToken()메서드는 더이상 꺼내올 token이 없다면 
				java.util.NoSuchElementException 예외 발생
*/
public class StringTokenizerMain {
	public static void main(String[] args) {
		String text="메이플 안들어간지 10일은 넘은것같다. 뽀송피부는얻을수잇음";
		StringTokenizer st=new StringTokenizer(text," ");
		int count=st.countTokens();
		System.out.println("현재 토큰의 갯수 : "+count);
		System.out.println("현재 토큰이 남아있는지 여부 : "+st.hasMoreElements());
		System.out.println();
		
		String str=st.nextToken();
		System.out.println("꺼내온 토큰은 : "+str);
		System.out.println("현재 토큰의 갯수 : "+st.countTokens());
		System.out.println();
		
		
		
		st=new StringTokenizer(text," ");
		System.out.println("현재 토큰이 남아있는지 여부 : "+st.hasMoreElements());
		// for
		count=st.countTokens();
		for(int i=0; i<count; i++) {
			String token=st.nextToken();
			System.out.println(token);
		}
		System.out.println("현재 토큰의 갯수 : "+st.countTokens());
		System.out.println("현재 토큰이 남아있는지 여부 : "+st.hasMoreElements()+"\n");
		//st.nextTokens(); // 남아있는 토큰이 없기 떄문에 에러


		st=new StringTokenizer(text," ");
		System.out.println("현재 토큰의 갯수 : "+st.countTokens());
		// while
		while(st.hasMoreElements()) {
			String token=st.nextToken();
			System.out.println(token);
		}
		System.out.println("현재 토큰의 갯수 : "+st.countTokens());
		System.out.println("현재 토큰이 남아있는지 여부 : "+st.hasMoreElements()+"\n");
	}
}