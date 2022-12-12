package com.lec.ex18_getset;
import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();

		emp1.setEmpno(1000);
		System.out.println("사원번호:"+emp1.getEmpno()); // 사원번호:1000

		emp1.set질병(true);
		System.out.println("질병여부:"+emp1.is질병()); // 질병여부:true
		System.out.println();



		Employee emp2=new Employee(1002,"스크류바",new Date(),5000,101,"1231234-1231234",true,false);
		Employee emp3=new Employee(1003,"누가바",new Date(),3000,102,"1231234-1231234",false,true);
		System.out.println("사원번호:"+emp2.getEmpno()); // 사원번호:1002
		System.out.println("질병여부:"+emp2.is질병()); // 질병여부:true
		System.out.println();
		
		System.out.println(emp2.hashCode());
		System.out.println(emp2.toString());
		System.out.println(emp3.hashCode());
		System.out.println(emp3.toString());
		System.out.println();
		
		System.out.println(emp2.equals(emp3));
		System.out.println(emp2.getClass()); // class com.lec.ex18_getset.Employee
	}
}