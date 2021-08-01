package day06_while;

public class Quiz11_1_1000 {
	public static void main(String[] args) {
		// 1~1000까지의 자연수 중, 4와 6 모두로 나누어도 나머지가 1인 수의 합
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("============");
		System.out.println("총 합 : "+sum);
	}
}
