package com.lec.exercise.answer;
public class ShopService {
	private static ShopService abc=new ShopService(); 
	public static ShopService getInstance() {
		return abc;
	}
}
