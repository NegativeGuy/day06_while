package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		continue : �ݺ����� �������� �÷������� 
		*/
		int i=0;
		while(i<5) {
			i++;
			if(i==3) {
				//break;
				continue; //�ش� ���ǿ��� continue(��ŵ)��
			}
			System.out.println(i);
		}
		System.out.println();
		//System.out.println(i+"��°���� �ݺ��� �����");
		System.out.println("3��°���� continue �߻�");
	}
}
