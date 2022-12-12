package com.lec.ex03_return;
public class FunctionalInterfaceMain {
	public static void main(String[] args) {
		FuncInterface fi1=null;
		fi1=(a,b)->{a=a*5; b=b*3; return a+b;};
		System.out.println("15*5+3*6="+fi1.method(15, 6)+"\n");

		fi1=(a,b)->a*b;
		System.out.println("15*6="+fi1.method(15, 6)+"\n");


		// 람다식에 메서드를 정의하기
		fi1=(a,b)->div(a,b);
		System.out.println(fi1.method(10, 3));
		

		System.out.println();


		// ▼ 수업 중 아니고 내가 해본거.
		
		// 람다식 없이 해보기
		FuncInterface fi2=new FuncInterface() {
			public double method(int a, int b) {
				return (double)a/b;
			}
		};
		System.out.println("fi2 : "+fi2.method(100, 40));
		
		fi2=(a,b)->div(a,b); // 이건 람다
		System.out.println("fi2 : "+fi2.method(50, 100));

		FunctionalInterfaceMain abc = null;
		System.out.println("abc : "+abc.div(100, 0));
		// div를 .으로 호출?하는건 FunctionalInterfaceMain 얘인것같다.
		// ◀ 여기까지.
		
	}

	private static double div(int a, int b) {
		if(b==0) {System.out.println("나눌수없다."); return 0.0;}
		else {double result=(double)a/b; return result;}
	}
}
@FunctionalInterface
interface FuncInterface{
	double method(int a, int b);
}