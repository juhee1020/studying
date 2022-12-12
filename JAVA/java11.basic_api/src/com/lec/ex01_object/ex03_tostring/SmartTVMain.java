package com.lec.ex01_object.ex03_tostring;
import java.util.Date;


public class SmartTVMain {
	public static void main(String[] args) {
		Object obj1=new Object();
		System.out.println(obj1.toString());
		
		Date date=new Date(0);
		System.out.println(date.toString());
		
		String str=new String("^a^");
		System.out.println(str.toString());
		
		SmartTV tv=new SmartTV("LG","OLED");
		System.out.println(tv.toString());
	}
}