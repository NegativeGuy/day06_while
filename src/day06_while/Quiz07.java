package day06_while;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		// ���Ǳ� ����
		Scanner input = new Scanner(System.in);
		System.out.println("����� ���� �ϼ��� : ");
		int mny = 0, chg = 0, select = 0;
		mny = input.nextInt();
		
		while(true) {
			System.out.println("======Ŀ�� ���Ǳ�======");
			System.out.println("1. Ŀ��(200)\t2. ���ھ�(250)\t3. ��ȯ\t4. ����");
			System.out.println("�޴��� �����ϼ��� : ");
			select = input.nextInt();
			switch(select) {
			case 1:
				if(mny>=200) {
					System.out.println("���ְ� �弼��");
					mny = mny - 200;
					System.out.println("�ܾ� : "+mny);
					System.out.println("\n\n");
					break;
				}else {
					System.out.println("�ܾ��� ���� �մϴ�");
					System.out.println("\n\n");
					break;
				}
			
			case 2:
				if(mny>=250) {
					System.out.println("���ְ� �弼��");
					mny = mny - 250;
					System.out.println("�ܾ� : "+mny);
					System.out.println("\n\n");
					break;	
				}else {
					System.out.println("�ܾ��� ���� �մϴ�");
					System.out.println("\n\n");
					break;
				}
			case 3:
				System.out.println("�Ž��� �� : "+mny);
				System.out.println("\n\n");
				break;
				
			case 4:
				System.out.println("�����մϴ�");
				System.exit(1);
			}
		}
	}
}
