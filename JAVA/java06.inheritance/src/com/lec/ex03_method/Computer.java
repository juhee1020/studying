package com.lec.ex03_method;

public class Computer extends Calculator{
	@Override
	double areaCalculator(double r) {
		//double pi=3.141592;
		return Math.PI*r*r;
	}
}
