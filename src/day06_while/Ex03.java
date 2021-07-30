package day06_while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 입력한 수 거꺼로 출력하기
		Scanner sc = new Scanner(System.in);
		int i, temp;
		System.out.print("수 입력 : ");
		i = sc.nextInt();
		
		while(true) {
			temp=i%10;
			i=i/10;
			System.out.print(temp+"  ");
			
			if(i==0) {
				break;
			}
		}
		System.out.println();
	}
}
