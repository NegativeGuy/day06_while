package day06_while;

public class Quiz04 {
	public static void main(String[] args) {
		//1~1000������ ���� ���Ͻÿ�.
		//(��, 3�� ����� ���� �׷��� 3�� ����̸鼭 5�� ����̸� ����)
		int sum=0, sum3 = 0;
		for(int i=1; i<=1000; i++) {
			if(i%3==0 && i%5!=0) {	//������ 3�� ��� ����
				sum3 += i;
			}
			sum += i;
			}
		sum = sum - sum3;
		System.out.println(sum);
	}
}
