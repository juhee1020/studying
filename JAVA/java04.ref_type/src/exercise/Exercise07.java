package exercise;
public class Exercise07 {
	public static void main(String[] args) {
		int[][] array ={
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};  
// 주어진 배열의 전체 항목의 합과 평균값을 구하기.(중첩 for문을 이용)
		int sum=0; int length=0;
		for(int i=0; i<array.length; i++) {
			length+=array[i].length;
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
			}
		}
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+(double)sum/length);
		
	}
}