package day06_while;

import java.util.Scanner;

public class Quiz09_Beasu {
	public static void main(String[] args) {
		//두 수의 최소 공배수와 최대 공약수를 구하는 프로그램을 작성하시오

		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요 : ");
		int num1, num2, max=0, min=0, i=2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i<=num1 && i<=num2) {
			if(num1%1==0 && num2%i ==0) {
				min=i;
			}
			i++;
		}
		max = (num1*num2)/min;		// 최소 공배수 공식
		
		System.out.println(num1+","+num2+"의 최대 공약수 : "+min);
		System.out.println(num1+","+num2+"의 최소 공배수 : "+max);
	}
}
