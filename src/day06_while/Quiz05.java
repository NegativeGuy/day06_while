package day06_while;

public class Quiz05 {
	public static void main(String[] args) {
		//1���� �����Ͽ� Ȧ���� ���� �ϸ鼭
		//�� ���� 10000�� ���� �ʴ� ������ ���� ���Ͻÿ�
		int i = 1, sum = 0;
	      
		for(; sum < 10000;i++) {
		   if(i%2 == 1) {	// Ȧ���� �ɷ�����
		   sum += i;		// Ȧ������ ���ϱ�
		   }
		}
		i--;				// for���� ������ i++�� ���� �Ǳ� ������
		System.out.println(i + " : " + sum);
		
		//====���� Ǯ��(�̿ϼ�)
		/*int oddSum=0, i=0;
		//for(i=1;;i++) {
		while(true) {
			i++;
			if(i%2 !=0) {
				oddSum += i;
			}
			else if(oddSum>=9999) {
				break;
			}
		}
		System.out.println(i);
		 */
	}
}
