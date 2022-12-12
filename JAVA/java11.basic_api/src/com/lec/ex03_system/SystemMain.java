package com.lec.ex03_system;
import java.util.Map;
// 얘가 첫번째.

public class SystemMain {
	public static void main(String[] args) {
		// 1. exit()
		if(args.length>3) {
			System.out.println("프로그램이 종료되엇습니다.");
			System.exit(0);
			// 0 : 정상종료 / 0 외 : 비정상종료
		}
		
		// 2. gc() // 가비지콜랙터
		Employee emp=null;
		for(int i=1; i<=3; i++) {
			emp=new Employee(i);
			if(i==1) emp=null;
		}
		System.out.println("emp가 최종적으로 참조하는 사원번호 : ");
		System.out.println(emp.empno);
		System.gc();
		
		// 3. getenv()
		String java_home=System.getenv("JAVA_HOME");
		System.out.println(java_home);
		
		// 운영체제의 환경정보출력
		/* 길어서 주석처리
		for(Map.Entry entry:System.getenv().entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		*/
	}
}

class Employee{
	int empno;
	public Employee(int empno) {
		this.empno=empno;
		System.out.println("Employee("+this.empno+")가 메모리에 생성되엇습니다.");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee("+this.empno+")가 메모리서 제거되었습니다");
	}
}