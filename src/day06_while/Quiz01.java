package day06_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		//1~10���� �� �Է��� ��ŭ �ݺ��ؼ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		while(true) {
			System.out.println("�� �Է�(1~10) : ");
			num = sc.nextInt();
		
			if(num>1 && num<10) {
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
