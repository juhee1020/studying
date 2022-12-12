package com.lec.ex02_arg;
public class FunctionalInterfaceMain {
	public static void main(String[] args) {
		FuncInterface fi1=null;
		
		fi1=(a)->{
			int result=a+10;
			System.out.println(a+"+10="+result);
		};
		fi1.method(100);
		System.out.println();
		
		fi1=(a)->{System.out.println(a+"*10="+(a*10));};
		fi1.method(40);
		//fi1.method(3.14);// 인트가 들어와야함.
		fi1.method((int)3.14);
		System.out.println();
	}
}
@FunctionalInterface
interface FuncInterface{
	void method(int a);
}