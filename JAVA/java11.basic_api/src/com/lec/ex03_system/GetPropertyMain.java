package com.lec.ex03_system;
import java.util.Properties;
import java.util.Set;
// 세번째

/*
	System property 읽기( getProperty(), getProperties() )
	
	시스템 프로퍼티는 JVM이 시작될 때 자동으로 설정되는 시스템의 속성값을 말한다.
	예를들어
	운영체제의 종류, 자바프로그램을 실행시킨 사용자ID, JVM버전, 운영체제
	에서 사용되는 파일경로, 구분자 등이 있다.
	
	시스템 프로퍼티는 key와 value로 구성되어 있다.
*/
public class GetPropertyMain {
	public static void main(String[] args) {
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("user.name");
		String userHome=System.getProperty("user.home");

		System.out.println("운영체제 이름: "+osName);
		System.out.println("사용자 이름: "+userName);
		System.out.println("사용자 홈디렉토리: "+userHome);

		System.out.println("-----------------------------");
		System.out.println("[ key ]\t\t\tvalue");
		System.out.println("-----------------------------");
		Properties props=System.getProperties();
		Set keys=props.keySet(); // 키와 벨류 세트
		for(Object objkey:keys) {
			String key=(String)objkey;
			String value=System.getProperty(key);
			System.out.println("["+key+"]\t"+value);
		}
	}
}