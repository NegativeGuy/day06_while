package day06_while;

public class Team_Quiz_04 {
	public static void main(String[] args) {
		//������ ���� �� �Ƕ�̵�(�ﰢ��)�� ����ϼ���
		/*
					 *
					***
				   *****
				  *******
				 *********

		*/
		for(int i=0; i<5; i++) {		//5�� ����
			for(int j=0; j<4-i; j++) {	//�� �ݺ� ���� (i)������ ��ŭ ����
				System.out.print("0");
			}
			for(int s=0; s<2*i+1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
