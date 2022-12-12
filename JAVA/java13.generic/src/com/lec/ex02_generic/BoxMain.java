package com.lec.ex02_generic;
public class BoxMain {
	public static void main(String[] args) {
		
		/* 
		제네릭은 컴파일단계에서부터 에러발생을 미연에 방지하기 위해서 
		객체저장시에 틀정객체만 제한하도록 하는 방법이다.
		
		주의사항 ※
		좌변에만 제네릭을 정의하면 사전에 에러 방지하지만
		우변에 제네릭을 정의하면 non generic과 동일하다.
		즉, 우변에만 제네릭을 정의할 경우에는
		컴파일에러는 발생하지않고 런타임시에 예외가 발생. (?)
		*/
		
		Box<Apple> 사과상자=new Box(); // 여긴 이제 Apple만 들어올수있습니다.
		사과상자.setObject(new Apple());
		Apple 사과=사과상자.getObject();
		System.out.println(사과+"\n"+사과.getClass());
		Box<Hammer> 망치상자=new Box();
		//Box<String> 글자상자=new Box(); // String만 들어올수있다.
		
		
		Box toolBox=new Box<Apple>();
		toolBox.setObject(new Apple());
		Apple xxx=(Apple)toolBox.getObject(); // (Apple) 없음 에러 발생.
	}
}
class Box<T>{ // T : 임의의 (참조)타입
	private T t; // Object가 최상위라 다 들어갈 수잇ㅇ다.
	public T getObject() {return t;}
	public void setObject(T t) {this.t = t;}
	
}
class Apple{
	@Override
	public String toString() {return "사과";}
}
class Hammer{
	@Override
	public String toString() {return "망치";}
}