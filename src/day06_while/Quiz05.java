package day06_while;

public class Quiz05 {
	public static void main(String[] args) {
		//1부터 시작하여 홀수의 합을 하면서
		//그 합이 10000을 넘지 않는 마지막 수를 구하시오
		int i = 1, sum = 0;
	      
		for(; sum < 10000;i++) {
		   if(i%2 == 1) {	// 홀수만 걸러내기
		   sum += i;		// 홀수끼리 합하기
		   }
		}
		i--;				// for문이 끝날때 i++가 진행 되기 때문에
		System.out.println(i + " : " + sum);
		
		//====나의 풀이(미완성)
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
