package day06_while;

public class Team_Quiz_02 {
	public static void main(String[] args) {
		// 다음과 같은 별 찍기 결과를 출력하시오
		/*
		 			*****
		 			****
		 			***
		 			**
		 			*
		*/
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}
}
