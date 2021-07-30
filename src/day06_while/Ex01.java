package day06_while;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 while의 문법
			while(조건식){
			
			}
			
		while을 for문으로 바꾸면
			for( ; 조건식; ){
			}
		*/
		int i=1;
		int sum=0;
		while(i<=10) {					// for( ; i<=10; ){
			sum += i;					//		sum += i;
			i++;						//		i++;
		}								// }			
		System.out.println("1~10까지의 합 : "+sum);
	}
}
