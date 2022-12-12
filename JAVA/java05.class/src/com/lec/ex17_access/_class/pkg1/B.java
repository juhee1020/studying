package com.lec.ex17_access._class.pkg1;
/*
	default 접근제한자이기 때문에 
	동일 패키지에서는 접근가능하지만 다른 패키지(외부)에서는 접근 불가
*/
class B {
	A a; // 접근가능
}