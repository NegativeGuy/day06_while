package day06_while;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id1 = null, id2, pw1 = null, pw2;

		while(true) {
		
			System.out.println("1. �α���\n2. ȸ������\n3. ������");
			int select = input.nextInt();
			switch(select) {
			case 2:
				System.out.println("���ϴ� ID �Է� : ");
				id1 = input.next();
				System.out.println("���ϴ� PW �Է� : ");
				pw1 = input.next();
				System.out.println("���� �Ϸ�");
				break;
			case 1:
				System.out.println("ID : ");
				id2 = input.next();
				System.out.println("PW : ");
				pw2 = input.next();
				if(id1.equals(id2) && pw1.equals(pw2)) {
					System.out.println("���� ����!!");
					}
				else {
					System.out.println("���� ����...");
				}
				break;
			case 3:
				System.out.println("���α׷� ����!!");
					System.exit(1);
			
			}
		}
	//�α��� ���α׷� �����
	//ó���� �α����� �ϸ� ����Ǿ� �ִ� ���� ���� ������ ���� �� ���� ���̴�.
	//�׷��� ȸ�������� ���� ����, �α��� �õ� �� ȸ������ �� ���� ���̵��
	//�α��� �� ���� ���̵� ������ ������
	/*
		1. �α���
		2. ȸ������
		3. ������
		>>>
	*/
	
	} //main
}
