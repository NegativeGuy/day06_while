package day06_while;

import java.util.Scanner;

public class Quiz09_Beasu {
	public static void main(String[] args) {
		//�� ���� �ּ� ������� �ִ� ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է����ּ��� : ");
		int num1, num2, max=0, min=0, i=2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i<=num1 && i<=num2) {
			if(num1%1==0 && num2%i ==0) {
				min=i;
			}
			i++;
		}
		max = (num1*num2)/min;		// �ּ� ����� ����
		
		System.out.println(num1+","+num2+"�� �ִ� ����� : "+min);
		System.out.println(num1+","+num2+"�� �ּ� ����� : "+max);
	}
}
