package com.lec.exercise;
public class ClassMain02 {
	public static void main(String[] args) {
		Point3D p1=new Point3D(1,2,3);
		Point3D p2=new Point3D(1,2,3);
		
		System.out.println("p1: "+p1+"/ p2: "+p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
	}
}
class Point3D{
	int x,y,z;
	
	Point3D(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	Point3D(){
		this(0, 0, 0);
	}
	@Override
	public boolean equals(Object obj) {
	// 코드작성
		if(obj instanceof Point3D) {
			Point3D point=(Point3D)obj;
			if(this.x==point.x&&this.y==point.y&&this.z==point.z) {
				return true;
			}
		}
		return false; // 코드끝
	}
	@Override
	public String toString() {
		return "["+x+","+y+","+z+"]";
	}
}