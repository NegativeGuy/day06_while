package day06_while;

public class Quiz03 {
	public static void main(String[] args) {
		// ù���� 1���� �����ϰ�, ���������� ������ 2�辿 ����,
		// 30��° �Ǵ³� �����ؾ��ϴ� �ݾ��� ���Ͻÿ�.
		int num=0, inc=1;
		for(int i=1; i<30; i++) {
			num += inc;
			inc *= 2;
		}
		System.out.println(num);
	}
}
