package day06_while;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//20~30 �� �Է��� ��ŭ �ݺ��ؼ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		while(true) {
			System.out.println("�� �Է�(20~30) : ");
			num = sc.nextInt();
		
			if(num>20 && num<30) {
				break;
			}
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
		}
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
