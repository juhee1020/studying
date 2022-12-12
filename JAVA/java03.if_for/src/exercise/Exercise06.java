package exercise;

public class Exercise06 {

	public static void main(String[] args) {
		System.out.println("1) ▼ ----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("\n2) ▼ ----------");
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("\n3) ▼ ----------");
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("\n4) ▼ ----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("\n5) ▼ ----------");
		for(int i=0; i<4; i++) {
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("\n6) ▼ ----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=4; j>i; j--) {
				System.out.print("★");
			}
			for(int j=3; j>i; j--) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("7) ▼ ----------");
		for(int i=0; i<4; i++) {
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=3; j>i; j--) {
				System.out.print("★");
			}
			for(int j=2; j>i; j--) {
				System.out.print("★");
			}
			System.out.println("");
		}
	}
}
