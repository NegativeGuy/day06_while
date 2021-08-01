package day06_while;

import java.util.Scanner;

public class Quiz10_YakSu {
	public static void main(String[] args) {
		// 어떤 수의 약수를 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("=== "+num1+"의 약수 ===");
		for(int i=2; i<num1; i++) {
			int min = 0;
			if(num1%i == 0) {
				min = i;
				System.out.println(min);
			}
		}
		System.out.println("=================");
	}
}
