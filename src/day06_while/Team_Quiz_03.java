package day06_while;

import java.util.Scanner;

public class Team_Quiz_03 {
	public static void main(String[] args) {
		//���ڸ� �Է¹ް� �� ���� ������ �������� ����Ͻÿ�. 
		//�������� ������ �ڱ� �ڽ��� ������ ��� ���� ������� ���� 
		//�ڱ� �ڽ��� �Ǵ� �ڿ��� �Դϴ�.
		//while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�� �Է� : ");
			int num = sc.nextInt();
		
			for(int i=1; i<=num; i++) {		// �Է��� ���� ���ϱ��� �ݺ� ����
				int sum=0;		// �ݺ��� �ٽ� ���� �� ������ sum�� 0���� �ʱ�ȭ
			
				for(int j=1; j<i; j++) {	// ��� ����(i) ������ ���ڱ��� �ݺ� ����
					if(i%j==0) {	//��� ����(i)�� ����� ����
						sum += j;	//������ sum�� ���ϱ�
					}
				}
				if(i==sum) {  // ��� ����� �������� ��� ����(i)�� ������ �� ���� ������
					System.out.println(i);
				}
			}
			System.out.println();
		//}
	}
}
