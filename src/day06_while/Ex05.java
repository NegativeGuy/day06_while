package day06_while;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//exit
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�ȱ� 2.���߱��� 3.����");
			int select = sc.nextInt();
			switch(select) {
			case 1:System.out.println("�ɾ��");break;
			case 2:System.out.println("����Ÿ��");break;
			case 3:System.out.println("��������");
				System.exit(1);	//��ȣ���� 1�� �ǹ� ����. �ƹ��ų� �ᵵ ��
			}
		}
	}
}
