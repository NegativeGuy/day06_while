package day06_while;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//20~30 중 입력한 만큼 반복해서 더하기
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		while(true) {
			System.out.println("수 입력(20~30) : ");
			num = sc.nextInt();
		
			if(num>20 && num<30) {
				break;
			}
			System.out.println("잘못 입력 하셨습니다");
		}
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
