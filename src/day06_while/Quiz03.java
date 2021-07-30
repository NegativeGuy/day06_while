package day06_while;

public class Quiz03 {
	public static void main(String[] args) {
		// 첫날에 1원을 예금하고, 다음날에는 전날의 2배씩 증가,
		// 30일째 되는날 예금해야하는 금액을 구하시오.
		int num=0, inc=1;
		for(int i=1; i<30; i++) {
			num += inc;
			inc *= 2;
		}
		System.out.println(num);
	}
}
