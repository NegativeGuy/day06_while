package day06_while;

public class Quiz04 {
	public static void main(String[] args) {
		//1~1000까지의 합을 구하시오.
		//(단, 3의 배수는 제외 그러나 3의 배수이면서 5의 배수이면 포함)
		int sum=0, sum3 = 0;
		for(int i=1; i<=1000; i++) {
			if(i%3==0 && i%5!=0) {	//순수한 3의 배수 조건
				sum3 += i;
			}
			sum += i;
			}
		sum = sum - sum3;
		System.out.println(sum);
	}
}
