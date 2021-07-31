package day06_while;

public class Team_Quiz_04 {
	public static void main(String[] args) {
		//다음과 같이 별 피라미드(삼각형)을 출력하세요
		/*
					 *
					***
				   *****
				  *******
				 *********

		*/
		for(int i=0; i<5; i++) {		//5줄 생성
			for(int j=0; j<4-i; j++) {	//매 반복 마다 (i)증가량 만큼 빼기
				System.out.print("0");
			}
			for(int s=0; s<2*i+1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
