package day06_while;

import java.util.Scanner;

public class Quiz10_YakSu {
	public static void main(String[] args) {
		// � ���� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.println("=== "+num1+"�� ��� ===");
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
