package com.lec.ex17_access._class.pkg1;
/*
	class의 접근제한자는 public과 default 두개가 있다.
	(접근제한자 자체는 4갠데 클래스는 위에 두개를 쓸수 있다...?)
	class에 정의된 제한자가 아무것도 선언되어있지 않다면 default접근제한자로 선언된 것이다.
	A클래스는 public으로 선언되었기 때문에 다른 패키지에서 접근가능.
	B는 (default)로 선언되어서 다른 패키지에서는 접근할 수가 없다.

*/

public class A {
	B b; // 접근 가능
}