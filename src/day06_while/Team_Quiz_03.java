package day06_while;

import java.util.Scanner;

public class Team_Quiz_03 {
	public static void main(String[] args) {
		//숫자를 입력받고 그 숫자 이하의 완전수를 출력하시오. 
		//완전수의 조건은 자기 자신을 제외한 모든 양의 약수들의 합이 
		//자기 자신이 되는 자연수 입니다.
		//while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("수 입력 : ");
			int num = sc.nextInt();
		
			for(int i=1; i<=num; i++) {		// 입력한 숫자 이하까지 반복 조건
				int sum=0;		// 반복이 다시 시작 할 때마다 sum을 0으로 초기화
			
				for(int j=1; j<i; j++) {	// 대상 숫자(i) 이하의 숫자까지 반복 조건
					if(i%j==0) {	//대상 숫자(i)의 약수를 구함
						sum += j;	//약수라면 sum에 더하기
					}
				}
				if(i==sum) {  // 모든 약수를 더했을때 대상 숫자(i)와 같으면 그 수는 완전수
					System.out.println(i);
				}
			}
			System.out.println();
		//}
	}
}
