package com.lec.el;
import java.text.DecimalFormat;

public class StaticMethod {
	public static String staticMethod(long num, String patten) {
		DecimalFormat ptrn=new DecimalFormat(patten);
		return ptrn.format(num);
	}
}
