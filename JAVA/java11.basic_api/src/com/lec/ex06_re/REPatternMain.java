package com.lec.ex06_re;

import java.util.regex.Pattern;

/*
	정규식과 Patten클래스(java.util.regex.Patten)
	
	문자열이 정해져 있는 형식(정규표현식:Regular Expression)으로 구성되어 있는지 검증해야하는 경우가 있다.
	예를들어, 이메일, 전화번호를 사용자가 제대로 입력했는지 검증해야할때 정규표현식과 비교한다.
	
	간단히 말해서 정규식은 문자 or 숫자 등 반복기호가 결합된 문자열이다.
	문자열이 02)1234-1234 or 010-1234-1234와 같은 전화번호를 확인할 수가 있는데
	정규식은 ()-\d{3,4}-\d{4} 의 형태인지 여부를 boolean으로 리턴 ( () - 숫자 3자리 아님 4자리 - 숫자4자리 )
	이메일의 경우는 정규식 : \

*/
public class REPatternMain {
	public static void main(String[] args) {
		// 1. 전화번호 유효성검증하기
		String tel1="02-1234-1234";
		String tel2="010-1234-1234";
		String tel3="052-123-123";
		
		// 정규식
		String re="(02|031|010)-\\d{3,4}-\\d{4}";
		// \한개는 \로 간주해서 \\라고 적어줘야 \d로 인식?
		boolean result1=Pattern.matches(re, tel1);
		boolean result2=Pattern.matches(re, tel2);
		boolean result3=Pattern.matches(re, tel3);
		System.out.println("tel1-유효한 전번 여부 : "+result1);
		System.out.println("tel2-유효한 전번 여부 : "+result2);
		System.out.println("tel3-유효한 전번 여부 : "+result3);
		System.out.println(Pattern.matches(re, "000-000-000"));
		if(Pattern.matches(re, "051-123-1234")) {
			System.out.println("정상적인 전화번호");
		}else {
			System.out.println("전화번호를 다시 확인해주세요.");
		}
		System.out.println();
		
		
		// 2. 이메일 유효셩 검증
		String email="admin@gmail.com";
		re="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		if(Pattern.matches(re, email)) {
			System.out.println("정상적인 이메일");
		}else {
			System.out.println("이메일을 다시 확인해주세요.");
		}
		System.out.println();
		
		
		// 3. 숫자 or 문자 검증
		System.out.println(Pattern.matches("[a-z]", "z")); // true
		System.out.println(Pattern.matches("[a-c]", "z")); // false
		System.out.println(Pattern.matches("[a-z]", "abcdefg")); // []는 한개의 문자 -> false
		System.out.println(Pattern.matches("[a-z]+", "abcdefg")); // []+는  단어단위-> true
		System.out.println(Pattern.matches("[A-Z]+", "f")); // false
		System.out.println(Pattern.matches("[A-z]+", "Z"));
		System.out.println(Pattern.matches("[0-9]","6"));
		System.out.println();
		
		
		// 회원가입 userId987xxx@
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "userId987xxx"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "userId987xxx@@"));
		System.out.println(Pattern.matches("[^a-zA-Z0-9]+", "userId987xxx")); // ^ : 부정
		System.out.println(Pattern.matches("[^a-zA-Z0-9]+", "!@#$%^&*"));
	}
}