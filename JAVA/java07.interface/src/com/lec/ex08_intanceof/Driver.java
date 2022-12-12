package com.lec.ex08_intanceof;
public class Driver {
	void driver(Vechicle v) {
		/*
		Bus bus=(Bus)v; bus.run(); bus.checkFare(); // 얘만 적어주면 나중에 mammoth.driver(new Taxi()); 얘가 안되고

		Taxi taxi=(Taxi)v; taxi.run(); taxi.xxx(); // 얘만 적으면 mammoth.driver(new Bus());가 오류가 안된다.
		*/
		if(v instanceof Bus) {
			Bus bus=(Bus)v;
			bus.run();
			bus.checkFare();
		}
		else if(v instanceof Taxi) {
			Taxi taxi=(Taxi)v;
			taxi.run();
			taxi.xxx();
		}
		else {v.run();}
	}
}