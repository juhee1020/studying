package com.lec.ex05_string.builder;
/*
	StringBuffer, StringBuilder 클래스
	
	문자열을 저장하는 String클래스는 내부의 문자열을 수정할 수 없다.
	예를들어 String.replace()메서드는 내부의 문자열을 변경하는 것이 아니라
	새롭게 대체된 문자열객체를 리턴한다.
	또한 예를들어 "JAVA" + "PROGRAMING"을 실행하는 경우 내부붐나열을 수정할 수 없기 때문에
	"JAVA PROGRAMING"이라는 새로운 String객체를 생성한 후에 그 객체의 참조번지를 리턴한다.
	문자열을 결합할 경우 "+" 연결연산자를 사용하면 할수록 
	그 사용수만큼 새로운 String객체의 수가 늘어나기 때문에
	프로그램의 성능을 느리게하는 요인이 된다.
	
	따라서, 문자열 변경작업이 많을 경우에는 String클래스 대신에 
	java.lang.StringBuilder or StringBuffer클래스를 사용하는 것이 좋다.
	이 두 클래스는 내부버퍼(buffer, 데이터를 임시로 저장하는 메모리)에 문자열을 저장해두고
	그 안에서 수정,추가,삭제 등의 작업을 할수 있도록 한다.
	String처럼 새로운 객체를 만들지 않고도 문자열을 조작할 수 있다.
	
	StringBuffer와 StringBuilder의 사용방법은 동일한데 차이점은 
	StringBuffer는 멀티스레드환경에서 사용할 수 있도록 동기화가 적용되어있어 스레드에 안전하지만
	StringBuilder는 단일스레드환경에서만 사용하도록 설계되어있다.
	
	StringBuffer, StringBuilder 메서드
	1. append : 문자열 끝에 매개값으로 주어진 문자열 추가
	2. insert : 문자열 사이에 매개값으로 주어진 문자열을 삽입
	3. delete : 매개값으로 주어진 문자열을 삭제
	4. deleteChartAt : 문자열에서 주어진 위치(index)의 문자를 삭제
	5. replace : 다른 문자열로 변경
	6. reverse : 문자열 그대로 뒤집기
	7. setCharAt : 문자열에서 주어진 위치(index)의 문자열을 다른 문자로 변경

*/
public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("sb.hashCode(): "+sb.hashCode());
		
		//1. append : 문자열 끝에 매개값으로 주어진 문자열 추가
		sb.append("마우스"); sb.append("키보드");
		System.out.println("sb.hashCode(): "+sb.hashCode()); // 위에줄 실행하기 전과  후의 해시코드 동일
		

		//2. insert : 문자열 사이에 매개값으로 주어진 문자열을 삽입
		sb.insert(4, "포도맛");
		System.out.println("sb.hashCode(): "+sb.hashCode()+", "+sb); // 마우스키포도맛보드
		
		
		//3. delete : 매개값으로 주어진 문자열을 삭제
		sb.delete(4, 5);
		System.out.println("sb.hashCode(): "+sb.hashCode()+", "+sb);
		
		
		//4. deleteChartAt : 문자열에서 주어진 위치(index)의 문자를 삭제
		sb.deleteCharAt(4);
	    System.out.println(sb.hashCode() + ", " + sb);
	
		
		//5. replace : 다른 문자열로 변경
		sb.replace(4, 6, "소향");
	    System.out.println(sb.hashCode() + ", " + sb);
		
		
		//6. reverse : 문자열 그대로 뒤집기
	    sb.reverse();
	    System.out.println(sb.hashCode() + ", " + sb);
		
		
		//7. setCharAt : 문자열에서 주어진 위치(index)의 문자열을 다른 문자로 변경
		sb.setCharAt(6, 'X');
		
		
		//8. 문자열의 갯수
		System.out.println("sb.hashCode():"+sb.hashCode());
		System.out.println(sb.reverse());
		System.out.println("문자열의 총 갯수 : "+sb.length());
		
		
		//9. StringBuffer를 String 타입으로 형변환
		String result=sb.toString();
		System.out.println(result);
		System.out.println("result.hashCode():"+result.hashCode());
		System.out.println("result.getClass():"+result.getClass());
		
		
		//10. String을 StringBuffer 타입으로 형변환
		StringBuffer sb1=new StringBuffer(result);
		System.out.println("sb.hashCode(): "+sb1.hashCode());
		System.out.println("result.hashCode():"+result.hashCode());
		System.out.println("sb.getClass():"+sb1.getClass());
		System.out.println("result.getClass():"+result.getClass());
	}
}