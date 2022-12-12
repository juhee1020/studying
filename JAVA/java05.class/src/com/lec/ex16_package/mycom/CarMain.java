package com.lec.ex16_package.mycom;

import com.lec.ex16_package.hankook.SnowTire;
import com.lec.ex16_package.hyundai.Engin;
//import com.lec.ex16_package.hankook.Tire;
//import com.lec.ex16_package.kumho.Tire;
// 이런 경우는 명시적으로 임포트 해오지 말고 아래처럼 패키지 적어주고 . Tire ~~하면 된다.
import com.lec.ex16_package.kumho.BigWidthTire;

/*

	패키지
	
	프로그램을 개발하다 보면 작게는 수십개, 많게는 수백개의 클래스를 작성해야한다.
	클래스를 체계적으로 관리하지 않으면 클래스간의 관계가 뒤엉키게 되어 
	복잡하고 난해한 프로그램이 되어버려 결국엔 유지보수가 불가능하게 된다.
	
	Java에서는 클래스를 체계적으로 관리하기 위해서 패키지를 사용한다.
	PC에서 파일을 저장해서 유사한 성격의 파일들을 그룹화해서 관리하듯이 
	Java에서는 패키지를 만들어 유사한 기능을 하는 클래스들끼리 그룹화해서 저장,관리하도록 한다.
	
	패키지의 물리적인 형태는 파일시스템의 폴더이다.
	패키지는 단순히 파일시스템의 폴더만 가능하는 것이 아니라 "클래스이름의 일부분"이다.
	즉, 클래스이름은 패키지명을 포함한 클래스파일명 전체가 클래스 이름이다.
	
	클래스전체이름은 "패키지명.하위패키지명.클래스명"인데 
	상위 하위로 구분이 되어있다면 dot(.)로 구분한다.
	
	패키지의 선언은 Java의 명명규칙을 준수하는데 관례적으로 패키지명은 전부 소문자로 정의하는것이 관례

*/

public class CarMain {

	public static void main(String[] args) {
		// 여기에서 hankook의 SnowTire, Tire / hundai의 Engin / kumho의 BigWidthTire, Tire에 접근할수 있니?
		Car car =new Car(); // 같은 패키지 안에 있으니까 걍 가능!

		Engin engin=new Engin(); // 빨간줄 뜨는데 보면 임포트 해오라고 한다. (추가해준다)

		// Tire tire=new Tire(); // 한국에 있는 타이어와 금호에 있는 타이어에서도 가져오고 싶으면!
		// 둘 다 임포트하면 하나는 에러가 뜬다. 
		
		com.lec.ex16_package.hankook.Tire ft=new com.lec.ex16_package.hankook.Tire();
		com.lec.ex16_package.kumho.Tire bt=new com.lec.ex16_package.kumho.Tire();
		
		SnowTire sft=new SnowTire();
		BigWidthTire sbt=new BigWidthTire();
		
		car.flt=ft;
		car.frt=ft;
		car.blt=sft;
		car.brt=sbt;
		car.engin=engin;
		
		System.out.println("Mycar 한대 생성");
	}

}

class Car{
	com.lec.ex16_package.hankook.Tire flt;
	com.lec.ex16_package.hankook.Tire frt;

	SnowTire blt;
	BigWidthTire brt;
	Engin engin;
}