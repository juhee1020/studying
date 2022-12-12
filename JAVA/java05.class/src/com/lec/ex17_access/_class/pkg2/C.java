package com.lec.ex17_access._class.pkg2;
import com.lec.ex17_access._class.pkg1.*; //pkg1에 있는것들 전부 임포트 해와라.
// import com.lec.ex17_access._class.pkg1.B; // 에러

public class C {
	A a; // 접근가능
	// B b; // B를 퍼블릭으로 바꾸라고 뜬다.
	// B클래스는 디폴트 접근제한자로 선언되었기 때문에 
	// 다른 패키지에서는 접근할수없다.
	
}
