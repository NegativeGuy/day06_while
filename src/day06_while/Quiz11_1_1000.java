package day06_while;

public class Quiz11_1_1000 {
	public static void main(String[] args) {
		// 1~1000������ �ڿ��� ��, 4�� 6 ��η� ����� �������� 1�� ���� ��
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("============");
		System.out.println("�� �� : "+sum);
	}
}
